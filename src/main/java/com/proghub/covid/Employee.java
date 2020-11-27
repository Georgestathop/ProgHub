package com.proghub.covid;

import java.util.Stack;

public class Employee {

	// static field
	private static int count; // count employees to set employee id
	// instance fields
	private int id; // employee id (primary)
	private String name; // employee name
	private String department; // employee department
	private Stack<Test> tests; // employee test list
	
	// Constructor
	public Employee() {
		setId(count);
		tests = new Stack<Test>();
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Stack<Test> getTests() {
		return tests;
	}
}
