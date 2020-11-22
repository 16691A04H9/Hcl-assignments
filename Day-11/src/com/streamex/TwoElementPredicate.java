package com.streamex;

public interface TwoElementPredicate 
{
	public Object betterEntry(Object a,Object b);
	public static void display()
	{
		System.out.println("The output is : ");
	}
}
class Car 
{
	private String carname;
	private int price;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [carname=" + carname + ", price=" + price + "]";
	}
}
class Employee
{
	private String empname;
	private int salary;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", salary=" + salary + "]";
	}
	
}
