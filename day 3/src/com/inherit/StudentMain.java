package com.inherit;

import java.util.Scanner;

public class StudentMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRecord m=new MyRecord();
		//Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name");
		m.name=sc.next();
		System.out.println("Enter student roll");
		m.roll=sc.nextInt();
		System.out.println("Enter marks of subject 1");
		m.m1=sc.nextInt();
		System.out.println("Enter marks of subject 2");
		m.m2=sc.nextInt();
		System.out.println("Enter marks of subject 3");
		m.m3=sc.nextInt();
		System.out.println("Your result is:");
		m.Display();
		System.out.println("Thank you");
	}

}
