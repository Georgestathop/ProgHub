package com.proghub.covid;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class InAppScreen extends JFrame {

	public InAppScreen(JFrame parent, Company company) {
		// frame settings
		super("App Menu");
		//setLayout(new GridLayout(3,1)); // orizei to layout manager 3 x 3
		setSize(400, 400); // width : 400, height : 400
		
		// add departments, add employees
		// get statistics, test employees for covid
		
		
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
