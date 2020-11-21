package com.inherit;

public class CompanyContact extends Contact {
	String cname;
	String website;
	String department;
	String city;
	String country;
	String address;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public CompanyContact(String contactperson, long mobile, String email, String cname, String website,
			String department, String city, String country, String address) {
		super(contactperson, mobile, email);
		this.cname = cname;
		this.website = website;
		this.department = department;
		this.city = city;
		this.country = country;
		this.address = address;
	}
	public void printContact() {
		System.out.println(cname + " " + website + " " + department + " " + city + " " + country + " " + address);
	}
}
