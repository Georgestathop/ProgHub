package com.proghub.covid;

import java.sql.Date;

public class Test {

	// static field
	private static int count; // metraei tests to set test id 
	// instance fields
	private int id; // test id (monadiko)
	private Date date; // test date
	private boolean result; // test result
	
	// Constructor
	public Test() {
		setId(count);
		count++;
	}

	// Getters and Setters
	public static int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
}
