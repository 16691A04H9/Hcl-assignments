package com.src;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		for (int i = 0; i < 100; i++) {
			al.add(i);
		}
		System.out.println(al);
		long start=System.nanoTime();
		System.out.println(al.get(49));
		long finish=System.nanoTime();
		long ard=finish-start;
		System.out.println(ard);
		LinkedList ll=new LinkedList();
		for(int i=0;i<100;i++)
		{
			ll.add(i);
		}
		System.out.println(ll);
		long start1=System.nanoTime();
		System.out.println(ll.get(49));
		long finish1=System.nanoTime();
		long lld=finish1-start1;
		System.out.println(lld);
		if(ard<lld)
		{
			System.out.println("For retrieving arrayList is best");
		}
		else
		{
			System.out.println("For retrieving linkedlist is best");
		}
		long start2=System.nanoTime();
		al.add(49,1001);
		long finish2=System.nanoTime();
		System.out.println(al);
		long ard2=finish2-start2;
		System.out.println(ard2);
		long start3=System.nanoTime();
		ll.add(49,1001);
		long finish3=System.nanoTime();
		System.out.println(ll);
		long lld2=finish3-start3;
		System.out.println(lld2);
		if(ard2<lld2)
		{
			System.out.println("For addition/deletion arraylist is best");
		}
		else
		{
			System.out.println("For addition/deletion linkedlist is best");
		}
	}

}
