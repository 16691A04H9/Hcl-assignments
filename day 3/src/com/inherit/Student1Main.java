package com.inherit;

import java.util.Scanner;

public class Student1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Record r=new Record();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		r.name=s.next();
		System.out.println("Enter roll");
		r.roll=s.nextInt();
		r.display();
	}

}
