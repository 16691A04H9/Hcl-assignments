package com.interfaces;

public interface Greetings {
	default void morning()
	{
		
	}
	default void afternoon()
	{
		
	}
	default void evening()
	{
		
	}
	default void night()
	{
		
	}
}
class English implements Greetings
{
	public void morning()
	{
		System.out.println("Good morning");
	}
	public void afternoon()
	{
		System.out.println("Good Afternoon");
	}
	public void evening()
	{
		System.out.println("Good Evening");
	}
	public void night()
	{
		System.out.println("Good night");
	}
}
class Hindi implements Greetings
{
	public void morning()
	{
		System.out.println("Shubhoday");
	}
	public void afternoon()
	{
		System.out.println("Shubdopahar");
	}
	public void evening()
	{
		System.out.println("Shubhsandhya");
	}
	public void night()
	{
		System.out.println("Shubhratri");
	}
}
class Telugu implements Greetings
{
	public void morning()
	{
		System.out.println("Shubodayam");
	}
	public void afternoon()
	{
		System.out.println("Namaskaram");
	}
	public void evening()
	{
		System.out.println("Namaskaram");
	}
	public void night()
	{
		System.out.println("Namaskaram");
	}
}