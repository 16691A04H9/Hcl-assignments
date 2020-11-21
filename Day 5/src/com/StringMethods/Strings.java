package com.StringMethods;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="World";
		String c="welcome";
		System.out.println(a.charAt(2));
		System.out.println(b.codePointBefore(2));
		System.out.println(a.codePointCount(0, 2));
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.concat(b));
		System.out.println(a.toUpperCase());  
		System.out.println(b.toLowerCase());
		System.out.println(a.trim());
		System.out.println(a.startsWith("Sa"));  
		System.out.println(b.endsWith("n"));
		System.out.println(a.length());
		int z=10;  
		String s=String.valueOf(z);  
		System.out.println(z+10); 
		String s1="Hello,welcome.Hello ,how are you?";    
		String replaceString=s1.replace("Hello","Hey");//replaces    
		System.out.println(replaceString);
		System.out.println(c.intern());
		System.out.println(c.lastIndexOf(6));
		System.out.println(a.matches("Hey"));
		System.out.println(s1.replaceFirst("Hello", "Bye"));
		
		
		
	}

}
