package com.threads;

public class Mythread extends Thread {
	//int sum;
public void run()
{
	for(int i=0;i<10;i++)
	{
		//s//um=sum+i;
		System.out.println(i+"run part");
	}
}
}
class Mythread2 extends Thread
{
	public void run()
	{
		for(int i=100;i>90;i--)
		{
		System.out.println(i+"run part 2");
		}
	}
}