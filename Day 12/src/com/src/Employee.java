package com.src;

public class Employee {
	int id;
	String name;
	int age;
	double salary;
	int year;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Employee(int id, String name, int age, double salary, int year) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", year=" + year + "]";
	}
	
}
