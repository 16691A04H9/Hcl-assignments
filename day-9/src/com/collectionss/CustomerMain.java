package com.collectionss;

//import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter how many customer details:");
	int n=s.nextInt();
	TreeSet ts=new TreeSet(new CompartorClass());
	//int n=sc.nextInt();
	Customer c[]=new Customer[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the id");
		int id=s.nextInt();
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the Accountnumber");
		int acc=s.nextInt();
		System.out.println("Enter the Customer Address");
		String address=s.next();
		
		
		c[i]=new Customer(id,name,acc,address);
		ts.add(c[i]);
	}
	System.out.println(ts);
	}
}
