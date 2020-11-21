package com.strings;

import java.util.Scanner;
import java.util.Arrays;

public class StringsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] letters = new String[5][5];
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXY";

		for (int i = 0; i < letters.length; ++i) {
			for (int j = 0; j < letters[i].length; ++j) {
				char letter = alphabet.charAt(i * letters.length + j);
				if (letter == 'Q') {
					letters[i][j] = letter + "/Z";
				} else {
					letters[i][j] = String.valueOf(letter);
				}
			}
		}
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				System.out.print(letters[i][j] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("Enter your message");
		Scanner s = new Scanner(System.in);
		String message, message1;
		message = s.nextLine();
		message = message.toUpperCase();
		message = message.replaceAll("[^a-zA-Z]", " ");
		//System.out.println(message);
		System.out.println("please enter keyword");
		String keyword;
		keyword = s.next();
		keyword = keyword.toUpperCase();
		message1 = message.replaceAll(" ", "");
		//System.out.println(message1);
		StringsDemoclass sdc = new StringsDemoclass();
		String ch[] = sdc.explode(message1);
		char[] keysort = keyword.toCharArray();
		////
		int arr = keyword.length() * keyword.length();
		//System.out.println(arr);
		char[] numbers = new char[arr];
		for (int i = 0; i < keyword.length(); i++) {
			numbers[i] = (char) keysort[i];
		}
		// Printing array
		Arrays.sort(keysort);
//		for (char c : keysort) {
//			System.out.println(c);
//		}

		int l = 7;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				for (int k = 0; k < letters.length; k++) {
					if (letters[j][k].equals(ch[i])) {
						numbers[l] = (char) j;
						l++;
						numbers[l] = (char) k;
						l++;
					}
				}
			}
		}
//		for (int q : numbers) {
//			System.out.println(q);
//		}
		int key[][] = new int[7][7];
		// l=0;
		for (int j = 0; j < 7; j++) {
			for (int i = 0; i < 7; i++) {
				key[j][i] = numbers[j * 7 + i];
			}
		}
//		for (int i = 0; i < key.length; i++) {
//			for (int j = 0; j < key.length; j++) {
//				System.out.print(key[i][j] + " ");
//			}
//			System.out.println("\n");
//		}
		int[] ch8 = new int[keyword.length()];
		int ch7[] = new int[keyword.length()];
		for (int i = 0; i < keyword.length(); i++) {
			ch7[i] = key[0][i];
			ch8[i] = key[0][i];
		}
		Arrays.sort(ch7);// sorted
		String data = "";
		//System.out.println(keyword.length());
		for (int i = 0; i < keyword.length(); i++) {
			int count = 0;
			for (int j = 0; j < keyword.length(); j++) {
				if (ch7[i] == ch8[j]) {
					int index = count;
					String hello = "";
					//System.out.println(index);
					for (int x = 1; x < keyword.length(); x++) {
						hello = hello + key[x][index];
					}
					if (hello.charAt(keyword.length() - 2) == '0') {
						String data1 = "";
						for (int y = 0; y < keyword.length() - 2; y++) {
							data1 = data1 + hello.charAt(y);
						}
						data = data + data1 + " ";
					} else {
						data = data + hello + " ";
					}
				} else
					count = count + 1;
			}
		}
		System.out.println(data);
	}
}
