package com.greatlearning.model;

public class Employee {
	
	private String FirstName;
	private String LastName;
	public Employee(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	public String getFirstName() {
		return this.FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return this.LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	

	
}
