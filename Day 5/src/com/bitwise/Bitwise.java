package com.bitwise;

public class Bitwise {
	public void bitwiseAnd(int a,int b)
	{
		int c=a&b;
		System.out.println(c);
	}
	public void bitwiseOr(int a,int b)
	{
		int c=a|b;
		System.out.println(c);
	}
	public void bitwiseXor(int a,int b)
	{
		int c=a^b;
		System.out.println(c);
	}
	public void leftshift(int a,int b)
	{
		int c=a<<b;
		System.out.println(c);
	}
	public void rightShift(int a,int b)
	{
		int c=a>>b;
		System.out.println(c);
	}
}
