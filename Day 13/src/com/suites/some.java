package com.suites;

public class some {
	private String message;
	public some(String message)
	{
		this.message=message;
	}
	public String appendMessage()
	{
		message="hello "+message;
		return message;
	}
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
}
