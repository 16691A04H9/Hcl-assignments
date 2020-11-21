package com.inherit;

import java.util.Scanner;

public class BaseDerivedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1=s.nextInt();
		System.out.println("Enter number 2");
		int n2=s.nextInt();
		//BaseClass b=new BaseClass(n1,n2);
		//Scanner s=new Scanner(System.in);
		
		DerivedClass dc=new DerivedClass(n1,n2);
		dc.dispMax();
		dc.dispMin();
	}

}
