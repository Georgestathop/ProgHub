package com.proghub.covid;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupScreen extends JFrame {

	// static fields
	private static String usernameInput;
	private static String passwordInput;
	private static String companyNameInput;
	private static Region companyRegionInput;
	// instance fields
	private final JFrame parent; // parent screen
	// Labels
	private final JLabel usernameLabel;
	private final JLabel passwordLabel;
	private final JLabel companyNameLabel;
	private final JLabel companyRegionLabel;
	// TextFields
	private final JTextField usernameField;
	private final JPasswordField passwordField;
	private final JTextField companyNameField;
	// Buttons and Boxes
	private final JComboBox<Region> regionComboBox;
	private final JCheckBox usernameBox;
	private final JCheckBox passwordBox;
	private final JCheckBox companyNameBox;
	private final JCheckBox regionCheckBox;
	private final JButton signupButton;
	private final JButton returnButton;
	
	//Constructor
	public SignupScreen(JFrame parent) {
		// sign up screen set up
		super("Sign Up"); // set the frame's title
		setLayout(new GridLayout(5, 5)); // set the layout
		setSize(400, 400); // set the dimension width X height
		
		this.parent = parent; // set the parent frame
		
		usernameLabel = new JLabel("Enter username"); // label text
		usernameLabel.setFont(new Font("Serif", Font.BOLD, 12)); // set the font
		add(usernameLabel); // add to frame
		
		usernameField = new JTextField("", 12); // set the content and size of the field
		usernameField.addActionListener(
		
			new ActionListener() {
					
				public void actionPerformed(ActionEvent e) {
						usernameInput = e.getActionCommand(); // save keyboard input
						usernameBox.setSelected(true); // check the box
				}
			}
		);
		add(usernameField); // add to frame
		
		usernameBox = new JCheckBox("", false); // set the username box 'false'
		add(usernameBox); // add to frame
		
		passwordLabel = new JLabel("Enter password"); // label text
		passwordLabel.setFont(new Font("Serif", Font.BOLD, 12)); // label font
		add(passwordLabel); // add to frame
		
		passwordField = new JPasswordField("", 12); // set the content and size of the field
		passwordField.addActionListener(
		
			new ActionListener() {
				
				public void actionPerformed(ActionEvent event) {
					passwordInput = event.getActionCommand(); // save keyboard input
					passwordBox.setSelected(true); // check the box
				}
			}
		);
		add(passwordField); // add to frame
		
		passwordBox = new JCheckBox("", false); // set the password box 'false'
		add(passwordBox); // add to frame
		
		companyNameLabel = new JLabel("Company Name"); // label text
		companyNameLabel.setFont(new Font("Serif", Font.BOLD, 12)); // label font
		add(companyNameLabel); // add to frame
		
		companyNameField = new JTextField("", 12); // set the content and size of the field
		companyNameField.addActionListener(
		
			new ActionListener() {
				
				public void actionPerformed(ActionEvent event) {
					companyNameInput = event.getActionCommand(); // save keyboard input
					companyNameBox.setSelected(true); // check the box
				}
			}
		);
		add(companyNameField); // add to frame 
		
		companyNameBox = new JCheckBox("", false); // set the name box 'false'
		add(companyNameBox); // add to frame
		
		companyRegionLabel = new JLabel("Enter region"); // label text
		companyRegionLabel.setFont(new Font("Serif", Font.BOLD, 12)); // label font
		add(companyRegionLabel); // add to frame
		
		regionComboBox = new JComboBox<Region>(); // initiates the combo box for regions
		regionComboBox.addItem(null); // first place 'null'
		// adds the regions to the combo box
		for(Region region : Region.values()) {
			regionComboBox.addItem(region);
		}
		regionComboBox.setMaximumRowCount(3); // show 3 rows at once
		regionComboBox.addItemListener(
		
			new ItemListener() {
				
				public void itemStateChanged(ItemEvent event) {
					if (event.getStateChange() == ItemEvent.SELECTED) {
						companyRegionInput = (Region)regionComboBox.getSelectedItem(); // save the selection
						regionCheckBox.setSelected(true); // check the box		
					}	
				}
			}
		);
		add(regionComboBox); // add to frame
		
		regionCheckBox = new JCheckBox("", false); // set the region box 'false'
		add(regionCheckBox); // add to frame
		
		signupButton = new JButton("Sign Up"); // set button title
		signupButton.setFont(new Font("Serif", Font.BOLD, 12)); // set font
		signupButton.addActionListener(
				
			new ActionListener() {
					
				public void actionPerformed(ActionEvent event) {
						Company newComp = new Company(); // initiate new company instance
						newComp.setName(companyNameInput); // set the company name
						newComp.setRegion(companyRegionInput); // set the company region
						new Account(newComp, usernameInput, passwordInput); // set the corresponding account instance
						JOptionPane.showMessageDialog(SignupScreen.this, "Sign Up Done!"); // user dialog
						System.out.println(Account.getAccounts()); 
				}
			}
		);
		add(signupButton); // add to frame
		
		returnButton = new JButton("Return to menu"); // text of the return to menu button
		returnButton.setFont(new Font("Serif", Font.BOLD, 12)); // set the font
		returnButton.addActionListener(
				
			new ActionListener() {
					
				public void actionPerformed(ActionEvent event) {
						
					SignupScreen.this.setVisible(false); // close the sign up screen
					SignupScreen.this.parent.setVisible(true); // returns to central menu screen
				}
			}
		);
		add(returnButton); // add to frame
		
		setVisible(true); // set the sign up screen visible
		setResizable(false); // window not resizable
		setLocationRelativeTo(null); // place in the center of the screen
	}
}
