package com.inherit;

public class Contact {
	String contactperson;
	long mobile;
	String email;
	

	public String getContactperson() {
		return contactperson;
	}


	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	


	public Contact(String contactperson, long mobile, String email) {
		super();
		this.contactperson = contactperson;
		this.mobile = mobile;
		this.email = email;
	}


	public void printContact() {
		System.out.println(contactperson + " " + mobile + " "+ email);
	}

}

