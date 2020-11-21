package com.inherit;

public class EmployeeContact {
	String city;
	String country;
	int pin;
	String designation;
	String dob;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public EmployeeContact(String city, String country, int pin, String designation, String dob) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
		this.designation = designation;
		this.dob = dob;
	}

	public void printContact() {
		System.out.println(city + " " + pin + " " + designation + " " + dob);
	}
}
