package com.exception;
import java.lang.Throwable;
import java.util.Scanner;
public class ThrowableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int[] a={11,21,31,41,75};
		int a1=10;
		int b=0;
		Exception ex=new Exception();
		try
		{
		int c= a1/b;
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println(e.getLocalizedMessage());

		e.printStackTrace();

		System.out.println(e.toString());
		}
		try
		{

		System.out.println(9/0);
		}
		
		catch(ArithmeticException e) {

		ex.addSuppressed(new ArithmeticException()); System.out.println(ex.getSuppressed());

}
	}
}
