package com.exceptionextended;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter the two numbers :");
		Scanner scanner = new Scanner(System.in);
		try {

			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			if (num2 == 0)
				throw new Exception("Cannot divide by zero");
			int res = num1 / num2;
			System.out.println("The result is :" + res);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("Inside final block");
			scanner.close();
		}
	}

}
