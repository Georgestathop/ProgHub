package com.proghub.covid;

import java.util.ArrayList;
import java.util.Stack;

public class App {
	

	public static void main(String[] args) {
		new MainMenuScreen();

	}
	
	public void searchcovid(Company company,String name) {
		ArrayList<Employee> employees = company.getEmployees();
		for (int i=0; i<employees.size(); i++) {
			if (employees.get(i).getName().equals(name)) {
				Stack<Test> tests = employees.get(i).getTests();
				System.out.println("Covid: " + tests.lastElement().getResult());	}		
			}
		}
		
	public void showpositives(Company company) {
			ArrayList<Employee> employees = company.getEmployees();
			for (int i=0; i<employees.size(); i++) {
				Stack<Test> tests = employees.get(i).getTests();
				if (tests.lastElement().getResult()==true) {
					System.out.println(employees.get(i).getName());			
				}
			}
			
	public void avarageage(Company company) {
		
	}
		
		
	
		
			
		
	}
}
