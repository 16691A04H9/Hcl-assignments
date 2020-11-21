package com.inherit;

public class DerivedClass extends BaseClass {
	public DerivedClass(int n1, int n2) {
		super(n1, n2);
		// TODO Auto-generated constructor stub
	}
	public void dispMax()
	{
		if(n1>n2)
		{
			System.out.println(n1+" is greater");
		}
		else if(n1<n2)
		{
			System.out.println(n2+" is greater");
		}
		else
		{
			System.out.println("Equal");
		}
	}
	public void dispMin()
	{
		if(n1<n2)
		{
			System.out.println(n1+" is lesser");
		}
		else if(n1>n2)
		{
			System.out.println(n2+" is greater");
		}
	}

}
