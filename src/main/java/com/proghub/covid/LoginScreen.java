package com.proghub.covid;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen extends JFrame {

	// static fields
	private static String usernameInput;
	private static String passwordInput;
	// instance fields
	private final JFrame parent; // parent screen
	// Labels
	private final JLabel usernameLabel;
	private final JLabel passwordLabel;
	// Text Fields
	private final JTextField usernameField;
	private final JPasswordField passwordField;
	// Check Boxes
	private final JCheckBox usernameBox;
	private final JCheckBox passwordBox;
	// Buttons
	private final JButton loginButton;
	private final JButton returnButton;
	
	// Constructor
	public LoginScreen(JFrame parent) {
		// frame settings
		super("Log In");
		setLayout(new GridLayout(3,1)); // orizei to layout manager 3 x 3
		setSize(400, 400); // width : 400, height : 400
		
		this.parent = parent;
		
		usernameLabel = new JLabel("Enter username"); // set title for username label
		usernameLabel.setFont(new Font("Serif", Font.BOLD, 12));; // set the font
		add(usernameLabel); // add to frame
		
		usernameField = new JTextField("", 12); // set the username field
		usernameField.addActionListener(
			
			new ActionListener() {
							
				public void actionPerformed(ActionEvent event) {
								
					usernameInput = event.getActionCommand(); // saves the username input
					usernameBox.setSelected(true); // checks the username box 
				}
			}
		);
		add(usernameField);
		
		usernameBox = new JCheckBox("", false); // set the username box ''false''
		add(usernameBox); // add to frame
		
		passwordLabel = new JLabel("Enter password"); // set the title for password label
		passwordLabel.setFont(new Font("Serif", Font.BOLD, 12)); // set the font
		add(passwordLabel); // add to frame
		
		passwordField = new JPasswordField("", 12); // set the password field
		passwordField.addActionListener(
						
			new ActionListener() {
							
				public void actionPerformed(ActionEvent event) {
								
					passwordInput = event.getActionCommand(); // save keyboard input
					passwordBox.setSelected(true); // check the box
				}
			}
		);
		add(passwordField); // add to frame
		
		passwordBox = new JCheckBox("", false); // set the box to 'false'
		add(passwordBox); // add to frame
		
		loginButton = new JButton("Log In"); // button title
		loginButton.setFont(new Font("Serif", Font.BOLD, 12)); // button font
		loginButton.addActionListener(
		
			new ActionListener() {
							
				public void actionPerformed(ActionEvent event) {
				
					boolean accountExists = false; // check if the input corresponds to an existing account
					Company company = null;
					
					for(Account account : Account.getAccounts()) {
						if (usernameInput.equals(account.getUsername()) && passwordInput.equals(account.getPassword())) {
							accountExists = true;
							company = account.getCompany();
						}
					}
					
					if(accountExists) {
						// inform user that log in is successful
						JOptionPane.showMessageDialog(LoginScreen.this.parent, "Log In Done!");
						LoginScreen.this.setVisible(false); // hide the log in screen
						new InAppScreen(LoginScreen.this, company); // show the in app menu
					} else {
						// blank the text fields and uncheck boxes
						usernameField.setText("");
						usernameBox.setSelected(false);
						passwordField.setText("");
						passwordBox.setSelected(false);
						// inform user that the credentials given were invalid
						JOptionPane.showMessageDialog(LoginScreen.this.parent, "Username / password invalid, please try again!");
					}
				
				}
			}
		);
		add(loginButton);
		
		returnButton = new JButton("Return to menu"); // button title
		returnButton.setFont(new Font("Serif", Font.BOLD, 12)); // button font
		returnButton.addActionListener(
				
				new ActionListener() {
					
					public void actionPerformed(ActionEvent event) {

						LoginScreen.this.setVisible(false); // close log in screen
						LoginScreen.this.parent.setVisible(true); // open main menu screen
					}
				}
		);
		add(returnButton); // add to frame
		
		setVisible(true); // set the log in screen visible
		setResizable(false); // window not resizable
		setLocationRelativeTo(null); // place in the center of the screen
	}
}
