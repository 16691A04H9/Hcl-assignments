package com.exceptionextended;

import java.util.Scanner;

public class UserDefinedException {
	public static void isValid(int age) throws CustomException {
		if (age > 19)
			throw new CustomException("Age must be below 19");
	}
	public static void main(String[] args) {
		System.out.println("Enter the age to check eligible for juniours cricket club");
		Scanner scanner = new Scanner(System.in);

		try {
			int age = scanner.nextInt();
			isValid(age);
			System.out.println("Your are eligible for the club.");
		} catch (CustomException e) {
			CustomException.printMsg();
		} finally {
			scanner.close();
		}
	}

}
