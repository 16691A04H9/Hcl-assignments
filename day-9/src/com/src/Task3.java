package com.src;

import java.util.HashMap;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hs=new HashMap();
		hs.put("a1234", "SteveJobs");
		hs.put("a1235", "Scott McNealy");
		hs.put("a1236", "Jeff Bezos");
		hs.put("a1237", "Larry Ellison");
		hs.put("a1238", "Bill Gates");
		System.out.println(hs);
		System.out.println(hs.keySet());
		Set<String> k=hs.keySet();
		for(String key: k)
		{
			String n=key.toUpperCase();
			System.out.println(n);
		}
	}

}
