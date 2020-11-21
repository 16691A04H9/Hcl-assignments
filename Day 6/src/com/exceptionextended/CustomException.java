package com.exceptionextended;

import java.util.Scanner;

@SuppressWarnings("serial")
public class CustomException extends Exception {
	private static String msg;

	public CustomException(String msg) {
		
		CustomException.msg = msg;
	}

	public static void printMsg() {
		System.err.println(msg);
	}

	public static void main(String[] args) {
		System.out.println("Enter the age to check eligible for juniours cricket club");
		Scanner scanner = new Scanner(System.in);

		try {
			int age = scanner.nextInt();
			if (age > 19)
				throw new CustomException("Age must be below 19");
			System.out.println("Your are eligible for the club.");
		} catch (CustomException e) {
			printMsg();
		} finally {
			scanner.close();
		}
	}

}
