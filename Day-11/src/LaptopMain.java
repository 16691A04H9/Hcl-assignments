//package com.src;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
public class LaptopMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many laptop details you want to enter :");
		int n=sc.nextInt();
		ArrayList<Laptop> al=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter id of laptop :");
			int id=sc.nextInt();
			System.out.println("enter name of laptop :");
			String na=sc.next();
			System.out.println("enter price of laptop :");
			double dou=sc.nextDouble();
			
			Laptop l=new Laptop(id,na,dou);
			
			
			al.add(l);
			
		}
		
		System.out.println(al);
		
		
		ArrayList al1=(ArrayList) al.stream()
				.filter(p->p.price<30000.0)// filtered data
				.map(p->p)//fetching laptops
				.collect(Collectors.toList());//collecting objects to list
		
		System.out.println(al1);
		

	}

}
