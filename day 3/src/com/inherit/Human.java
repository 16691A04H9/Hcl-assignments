package com.inherit;

public class Human {
	String name1;
	String name2;
	String gender1;
	String gender2;

	public void find(int h1, int h2) {
		//int q=h1;
		
		if (h1 > h2) {
			System.out.println("Man is elder");
		} else {
			System.out.println("woMan is elder");
		}
	}
}

class Man extends Human {
	int age1;
}

class Woman extends Human {
	int age2;
}
