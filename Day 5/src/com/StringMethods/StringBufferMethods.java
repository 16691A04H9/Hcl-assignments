package com.StringMethods;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hola";
		StringBuffer s=new StringBuffer(s1);	
		String s2="Namaskar";
		StringBuffer p=new StringBuffer(s2);
		System.out.println(s.append(7));
		System.out.println(s.append("Bonjour"));
		System.out.println(p.appendCodePoint(8));
		System.out.println(p.capacity());
		System.out.println(p.charAt(4));
		System.out.println(s.delete(0, 8));
		System.out.println(p.deleteCharAt(6));
		System.out.println(s.reverse());
		System.out.println(s.reverse());
		s.setCharAt(0,'B');
		s.setCharAt(1, 'o');
		s.setCharAt(2, 'n');
		System.out.println(s);
		p.setLength(8);
		System.out.println(p);
		System.out.println(p.length());
		System.out.println(s.toString());
		
		
	}

}
