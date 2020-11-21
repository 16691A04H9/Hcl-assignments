package com.inherit;

import java.util.Scanner;

public class RectangleBoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//System.out.println("Select any one of the following to find area");
		//int choice=s.nextInt();
		int choice;
		do
		{
			System.out.println("Select any one of the following to find area");
			System.out.println("1.Rectangle");
			System.out.println("2.Box");
			System.out.println("3.exit");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("enter rectangle length");
				int a=s.nextInt();
				System.out.println("enter rectangle breadth");
				int b=s.nextInt();
				Rectangle r=new Rectangle();
				r.area(a,b);
				break;
			}
			case 2:
			{
				System.out.println("enter box length");
				int p=s.nextInt();
				System.out.println("enter box breadth");
				int q=s.nextInt();
				System.out.println("enter box depth");
				int d=s.nextInt();
				
				Box B=new Box();
				B.area(p,q,d);
				break;
			}
			case 3:
				System.out.println("Thank You");
				break;
			}
			
		}while(choice==3);
	}

}
