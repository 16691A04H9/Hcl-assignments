package com.exceptionextended;

import java.util.Scanner;

@SuppressWarnings("serial")
class ItemNotFound extends Exception {
	public ItemNotFound(String msg) {
		super(msg);
	}
}

@SuppressWarnings("serial")
class InvalidInput extends Exception {
	public InvalidInput(String msg) {
		super(msg);
	}
}

public class Question5 {
	public static void f(int num) throws ItemNotFound,ItemNotFound {
		try {
			if (num > 0)
				throw new InvalidInput("number should be less than zero");
			
			g(new int[] { -20, -50, -60 }, num);
		} catch (InvalidInput e) {
			System.err.println(e);
			g(new int[] { -20, -50, -60 }, num);

		}

	}

	public static void g(int[] arr, int item) throws ItemNotFound {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {

				flag = true;
			}
		}
		if (!flag) {
			throw new ItemNotFound("Item not found in array");
		} else
			System.out.println("Item found in array");
	}

	public static void main(String[] args) {
		System.out.println("Enter search element to find in the array :");
		Scanner scanner = new Scanner(System.in);
		try {
			int num = scanner.nextInt();
			f(num);
		} catch (ItemNotFound e) {
			System.err.println(e);
		}
		finally {
			scanner.close();
		}
	}
}
