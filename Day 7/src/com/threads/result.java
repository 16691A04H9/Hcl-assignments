package com.threads;

public class result {
	result(int i,int j)
	{
		if(i==10)
		{
			System.out.println(j+" reached destination");
		}
	}
	result(String i,String j,int k)
	{
		if(k==10)
		{
			System.out.println(j+" from "+i+" reached destination");
		}
	}
}
