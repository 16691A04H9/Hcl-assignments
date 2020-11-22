package com.streamex;

public class BetterStringMain {

	public static void main(String[] args) 
	{
		BetterStringEx bs=((a,b)->a.length()>b.length()?a:b); //lambda expression for deciding which string is maximum
		String l=bs.betterString("pavithra", "vellaichamy");
		BetterStringEx.print();  //calling the method
		System.out.println(l);
		BetterStringEx bs1=((a,b)->a);  //lambda expression for taking string 1 
		String l1=bs1.betterString("Pavithra","vellaichamy");
		BetterStringEx.print();  //calling the method
		System.out.println(l1);
	}

}
