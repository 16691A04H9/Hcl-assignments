//package com.src;

public class Laptop {
	
	int lapid;
	String name;
	double price;
	public Laptop(int lapid, String name, double price) {
		super();
		this.lapid = lapid;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lapid=" + lapid + ", name=" + name + ", price=" + price + "]";
	}
	

}
