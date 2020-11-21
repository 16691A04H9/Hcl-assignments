package com.calculator;
import java.util.Scanner;

import com.arithmetic.*;
import com.bitwise.*;
import com.relational.*;
import com.unary.*;
public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int c;
		do {
			System.out.println("1.Arithmetic");
			System.out.println("2.Bitwise");
			System.out.println("3.Relational");
			System.out.println("4.Unary");
			System.out.println("5.exit");
			c=s.nextInt();
			switch (c) 
			{
				case 1:
					Arithmetic a=new Arithmetic();
					int p,q;
					System.out.println("ENTER A VALUES");
					p=s.nextInt();
					System.out.println("Enter another value");
					q=s.nextInt();
					System.out.println("Addition");
					a.addition(p, q);
					System.out.println("SUBTRACTION");
					a.subtraction(p, q);
					System.out.println("MULTIPLICATION");
					a.multiplication(p, q);
					System.out.println("Division");
					a.division(p,q);
					System.out.println("modulo");
					a.modulo(p, q);
					break;
				case 2:
					Bitwise b=new Bitwise();
					int x,y;
					System.out.println("ENTER A VALUES");
					x=s.nextInt();
					System.out.println("Enter another value");
					y=s.nextInt();
					System.out.println("Bitwise and");
					b.bitwiseAnd(x, y);
					System.out.println("Bitwise Or");
					b.bitwiseOr(x, y);
					System.out.println("Bitwise Xor");
					b.bitwiseXor(x, y);
					System.out.println("Right SHIFT");
					b.rightShift(x, y);
					System.out.println("lEFT SHIFT");
					b.leftshift(x, y);
					break;
				case 3:
					Relational r =new Relational();
					int m,n;
					System.out.println("ENTER A VALUES");
					m=s.nextInt();
					System.out.println("Enter another value");
					n=s.nextInt();
					System.out.println("Greatest among two");
					r.greater(m, n);
					System.out.println("Least among two");
					r.lesser(m, n);
					break;
				case 4:
					Unary u=new Unary();
					int j;
					System.out.println("ENTER A VALUES");
					j=s.nextInt();
					u.postincrement(j);
					u.preincrement(j);
					u.postdecrement(j);
					u.predecrement(j);
					break;
				case 5:
					System.out.println("Thank You");
			}
		}while(c!=5);
		
	}

}
