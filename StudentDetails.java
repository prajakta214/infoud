package com.infoud.assignment_1.student;

public class StudentDetails {
 
	private String name;
	private String address;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public StudentDetails(String name, String address, String email) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
	}
	public StudentDetails(String address, String email) {
		super();
		this.name = "Unknown";
		this.address = address;
		this.email = email;
	}

	public String printDetails(){
		return "Name: " + name + "\nAddress: "+address+ "\nEmail: " +email;
	}
	
}
