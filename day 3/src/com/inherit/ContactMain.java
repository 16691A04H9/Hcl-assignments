package com.inherit;

//import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c=new Contact("hello", 978456258, "hello@gmail.com");
		//Scanner s=new Scanner(System.in);
		c.printContact();
		EmployeeContact e=new EmployeeContact("Hyd", "India", 512364, "Manager", "01-02-96");
		e.printContact();
		CompanyContact cc=new CompanyContact("hcl", 0, "www.hcl.com", "IT", "chennai", "india", "Chennai,tamilnadu", null, null);
		cc.printContact();
	}

}
