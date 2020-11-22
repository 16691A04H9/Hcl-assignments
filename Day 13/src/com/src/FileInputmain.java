package com.src;

import java.util.Scanner;

public class FileInputmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fileinput fi=new Fileinput();
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String name=s.next();
		fi.files(name);
		System.out.println("file created");
	}

}
