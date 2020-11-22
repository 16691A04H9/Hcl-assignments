package com.src;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter no of employees to enter");
		n=s.nextInt();
		HashSet<Employee> hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter emp id");
			int eid=s.nextInt();
			System.out.println("enter emp name");
			String ename=s.next();
			System.out.println("enter emp salary");
			double d=s.nextDouble();
			System.out.println("enter age of emp");
			int a=s.nextInt();
			System.out.println("enter work exp");
			int ex=s.nextInt();
			Employee e=new Employee(eid,ename,a,d,ex);
			hs.add(e);
			
		}
		System.out.println(hs);
		Integer a=hs.stream().max((Double i,Double j)->i.salary<j.salary ? 1.0:-1.0)));
		System.out.println("hello",a);
		System.out.println(a);
		List<Integer> li=(List) hs.stream()
				.sorted((i,j)->(Integer)i.workingyears<(Integer)j.workingyears ?-1:1)
				.collect(Collectors.toList());
		System.out.println(li);
		List<Integer> li1=(List) hs.stream().filter((t)->t.workingyears< 2)
				.sorted((i,j)->(Integer)i.id<(Integer)j.id ?-1:1)
				.collect(Collectors.toList());
		System.out.println(li1);
		
	}

}
