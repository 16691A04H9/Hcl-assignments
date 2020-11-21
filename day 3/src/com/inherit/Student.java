package com.inherit;

public class Student {
	String name;
	int roll;
	int m1,m2,m3;
}
class MyRecord extends Student
{
	public void Display()
	{
		int percent=(m1+m2+m3)/3;
		System.out.println(name+" "+roll+" "+percent+"%");
	}
}
