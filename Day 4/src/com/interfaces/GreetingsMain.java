package com.interfaces;

public class GreetingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greetings g=new English();
		g.morning();
		g.afternoon();
		g.evening();
		g.night();
		Greetings h=new Hindi();
		h.morning();
		h.afternoon();
		h.evening();
		h.night();
		Greetings t=new Telugu();
		t.morning();
		t.afternoon();
		t.evening();
		t.night();
				
	}

}
