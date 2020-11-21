package com.StringMethods;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ipl";
		String s1="Dubai";
		String s2="Abudhabi";
		StringBuilder p=new StringBuilder(s);
		StringBuilder p1=new StringBuilder(s1);
		StringBuilder p2=new StringBuilder(s2);
		System.out.println(p.append(true));
		System.out.println(p.append(7));
		System.out.println(p.append("hello"));
		System.out.println(p1.capacity());
		System.out.println(p2.codePointAt(2));
		System.out.println(p2.codePointCount(2, 6));
		System.out.println(p2.charAt(3));
		System.out.println(p2.insert(3, 2));
		System.out.println(p1.reverse());
		System.out.println(p1.substring(2));
		
	}

}
