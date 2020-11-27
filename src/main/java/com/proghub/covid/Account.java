package com.proghub.covid;

import java.util.ArrayList;

public class Account {
	// static field
	private static ArrayList<Account> accounts = new ArrayList<Account>();
	// instance fields
	private Company company; // company of the account
	private String username; // account username
	private String password; // account password
	
	// Constructor
	public Account(Company company, String username, String password) {
		this.company = company; 
		this.username = username;
		this.password = password;
		accounts.add(this);
	}

	// Getters and Setters
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return String.format("%s%nUsername : %s%nPassword : %s%n",
				this.company, this.username, this.password);
	}
	
	public static ArrayList<Account> getAccounts() {
		return accounts;
	}
}
