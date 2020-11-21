package com.src;

import java.util.HashMap;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1, "One");
		hs.put(2, "Two");
		hs.put(3, "Three");
		hs.put(4, "Four");
		hs.put(5, "Five");
		hs.put(6, "Six");
		hs.put(7, "Seven");
		hs.put(8, "Eight");
		hs.put(9, "Nine");
		hs.put(10, "Ten");
		hs.put(11, "Eleven");
		hs.put(12, "Twelve");
		hs.put(13, "Thirteen");
		hs.put(14, "Fourteen");
		hs.put(15, "Fifteen");
		hs.put(16, "Sixteen");
		hs.put(17, "Seventeen");
		hs.put(18, "Eighteen");
		hs.put(19, "Nineteen");
		hs.put(20, "Twenty");
		@SuppressWarnings("resource")
		Scanner s=new Scanner("System.in");
		System.out.println(hs);
		Integer n=(Integer)s.nextInt();
		System.out.println(hs.get(n));
		}

}
