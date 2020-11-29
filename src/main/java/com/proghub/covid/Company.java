package com.proghub.covid;

import java.util.ArrayList;

public class Company {

	// static field
	private static int count = 1; // count companies to set the id
	// instance fields
	private int id; // company id (primary)
	private String name; // company name
	private Region region; // company region
	private ArrayList<String> departments;
	protected ArrayList<Employee> employees;
	
	// Constructor
	public Company() {
		setId(count);
		departments = new ArrayList<String>(); // initiate list departments 
		employees = new ArrayList<Employee>(); // initiate list employees
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
	public Region getRegion() {
		return region;
	}
	
	public void setRegion(Region region) {
		this.region = region;
	}
	
	public ArrayList<String> getDepartments() {
		return departments;
	}
	
	public void addDepartment(String department) {
		departments.add(department);
	}
	
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	public void addEmployees(Employee employee) {
		employees.add(employee);
	}
	
	@Override
	public String toString() {
		return String.format("Company Id : %s%nCompany Name : %s%nCompany Region : %s%n",
				this.id, this.name, this.region.getName());
	}
}
