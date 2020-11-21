package com.exceptionextended;

public class ObjectReference {

	public static void main(String[] args) {
		try {
			Addition addition = new Addition();
			addition = null;
			int sum = addition.add(2, 3);
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
