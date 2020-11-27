package com.proghub.covid;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import jdk.internal.net.http.hpack.NaiveHuffman;

public class MainMenuScreen extends JFrame {
	// instance fields
	private final JButton signupButton; // button for sign up
	private final JButton loginButton; // button for log in
	private final JButton quitButton; // button for exiting the app
	
	//Constructor
	public MainMenuScreen() {
		// main menu screen frame setup
		super("Main Menu");
		setLayout(new GridLayout(3,1)); // layout manager 3 x 1
		setSize(400, 400); // width : 400, height : 400
		
		// sign up button set up
		signupButton = new JButton("Sign Up"); // set the text for the button
		signupButton.setFont(new Font("Serif", Font.BOLD, 15)); // set the button's font
		// set the action listener 
		signupButton.addActionListener(
			new ActionListener() {
							
				public void actionPerformed(ActionEvent event) {
					setVisible(false);
					new SignupScreen(MainMenuScreen.this);
				}
			}
		);
		add(signupButton); // add button to frame
		
		// login button set up
		loginButton = new JButton("Log In"); // set the text for the button
		loginButton.setFont(new Font("Serif", Font.BOLD, 15)); // set the button's font
		// set the action listener
		loginButton.addActionListener(
			new ActionListener() {
							
				public void actionPerformed(ActionEvent event) {
					setVisible(false);
					new LoginScreen(MainMenuScreen.this);
				}
			}
		);
		add(loginButton); // add button to frame
		
		// quit button set up
		quitButton = new JButton("Quit"); // set the text for the button
		quitButton.setFont(new Font("Serif", Font.BOLD, 15)); // set the button's font
		// set the action Listener
		quitButton.addActionListener(
			new ActionListener() {
							
				public void actionPerformed(ActionEvent arg0) {
					System.exit(EXIT_ON_CLOSE);	
				}
			}
		);
		add(quitButton); // add button to frame
		
		setVisible(true); // set the main main screen visible
		setResizable(false); // window not resizable
		setLocationRelativeTo(null); // place the window in the center of the screen
		setDefaultCloseOperation(EXIT_ON_CLOSE); // exit app when X is clicked
	}
}
