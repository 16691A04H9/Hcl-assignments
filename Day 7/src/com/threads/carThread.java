package com.threads;

import java.util.Random;

public class carThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				System.out.println("1 @ petrolpump");
			}
			Random r=new Random();
			int q=r.nextInt(6);
			counter c=new counter();
			c.count(q);
			int j=1;
			result w=new result(i,j);
		}
	}
}
 class carThread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				System.out.println("2 @ petrolpump");
			}
			Random r=new Random();
			int q=r.nextInt(6);
			counter c=new counter();
			c.count(q);
			int j=2;
			result w=new result(i,j);
		}
	}
}
 class carThread3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				System.out.println("3 @ petrolpump");
			}
			Random r=new Random();
			int q=r.nextInt(6);
			counter c=new counter();
			c.count(q);
			int j=3;
			result w=new result(i,j);
		}
	}
}
 class carThread4 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				System.out.println("4 @ petrolpump");
			}
			Random r=new Random();
			int q=r.nextInt(6);
			counter c=new counter();
			c.count(q);
			int j=4;
			//int j=1;
			result w=new result(i,j);
		}
	}
}
 class carThread5 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				System.out.println("5 @ petrolpump");
			}
			Random r=new Random();
			int q=r.nextInt(6);
			counter c=new counter();
			c.count(q);
			int j=5;
			result w=new result(i,j);
		}
	}
}
 class carThread6 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				System.out.println("6 @ petrolpump");
			}
			Random r=new Random();
			int q=r.nextInt(6);
			counter c=new counter();
			c.count(q);
			int j=6;
			result w=new result(i,j);
		}
	}
}
// class counter
// {
//	 public void count(int i)
//	 {
//		 int sum=0;
//		 for(int j=i;j<25;j++)
//		 {
//			 sum=sum+i;
//		 }
//	 }
// }
//class result
//{
//	result(int i,int j)
//	{
//		if(i==10)
//		{
//			System.out.println(j+"reached destination");
//		}
//	}
//	result(String i,String j,int k)
//	{
//		if(k==10)
//		{
//			System.out.println(i);
//		}
//	}
//}