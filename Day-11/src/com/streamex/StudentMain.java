package com.streamex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of students details to enter");
		int n=s.nextInt();
		ArrayList<Student> al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String sname;
			System.out.println("enter student name:");
			sname=s.next();
			int sid;
			System.out.println("enter id num");
			sid=s.nextInt();
			System.out.println("enter maths marks");
			int m1=s.nextInt();
			System.out.println("enter science marks");
			int m2=s.nextInt();
			System.out.println("enter social marks");
			int m3=s.nextInt();
			Student s1=new Student(sname,sid,m1,m2,m3);
			al.add(s1);
		}
		System.out.println(al);

		ArrayList al1=(ArrayList) al.stream()
				.filter(p->p.maths<40)
				.map(p->p)
				.collect(Collectors.toList());
		System.out.println(al1);
		ArrayList al2=(ArrayList) al.stream()
				.filter(p->p.science<40)
				.map(p->p)
				.collect(Collectors.toList());
		System.out.println(al2);
		ArrayList al3=(ArrayList) al.stream()
				.filter(p->p.social<40)
				.map(p->p)
				.collect(Collectors.toList());
		System.out.println(al1);
		ArrayList al4=(ArrayList) al.stream()
				.filter(p->p.total>150)
				.map(p->p)
				.collect(Collectors.toList());
		System.out.println(al4);
	}

}
