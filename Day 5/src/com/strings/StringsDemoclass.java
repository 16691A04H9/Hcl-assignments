package com.strings;

public class StringsDemoclass {
	public String[] explode(String s) {
	    String[] arr = new String[s.length()];
	    for(int i = 0; i < s.length(); i++)
	    {
	        arr[i] = String.valueOf(s.charAt(i));
	    }
	    return arr;
	}
}
