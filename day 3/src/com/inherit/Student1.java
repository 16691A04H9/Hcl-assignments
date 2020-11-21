package com.inherit;

public class Student1 {
	String name;
	int roll;

static String address="Hyderabad";
}
class Record extends Student1
{
	public void display()
	{
		System.out.println(name+" "+roll+" "+address);
	}
}