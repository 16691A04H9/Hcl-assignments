package com.methods;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Customer[] customer = new Customer[4];
		int index = 0;
		while (true) {
			System.out.println("######BANK APPLICATION########");
			System.out.println(
					"1.Add Customer\n2.Delete Customer\n3.Update Customer\n4.Display All Customers\n5.Exit\nEnter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				customer[index++] = enterDetails();
				System.out.println("Cutomer details successfully entered");
				break;
			case 2:System.out.println("Enter the Customer Id to delete the details :");
				int id = sc.nextInt();sc.nextLine();
				boolean check = false;
				for(int i =0 ;i < 4;i++) {
					if(customer[i].getCusId() == id) {
						customer[i] =null;
						check = true;
						break;
					}
				if(!check) {
					System.out.println("Please enter the valid Customer id");
				}
				}
				System.out.println("Customer with id "+id+" deleted successfully");
				break;
			case 3:System.out.println("Enter the Customer id you want to update :");
				int cid = sc.nextInt();sc.nextLine();
				boolean check1 = false;
				for(int i =0; i< 4;i++) {
					if(customer[i].getCusId() == cid) {
						customer[i] = enterDetails();
						check1 = true;
						break;
					}
				}
				if(!check1) {
					System.out.println("Please enter the valid Customer id");
				}
			      System.out.println("Cusomer details updated successfully");
			      break;
			case 4:display(customer);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Please enter the valid input");
			}
		}
	}
	public static Customer enterDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer details in oder name,cusid,emailid,mobileno,address,accno :");
		
		String name = sc.nextLine();
		int cusId = sc.nextInt();sc.nextLine();
		String emailId = sc.nextLine();
		long mobileNo  = sc.nextLong();sc.nextLine();
		String address = sc.nextLine();
		int accNo = sc.nextInt();sc.nextLine();
		return new Customer(name, cusId, emailId, mobileNo, address, accNo);
	}
	public static void display(Customer[] customer) {
		if(customer.length == 0) {
			System.out.println("No cutomer details entered yet");
		}
		for(int i=0;i<4;i++) {
			if(customer[i] != null) {
				System.out.println(customer[i]);
			}
		}
	}

}
