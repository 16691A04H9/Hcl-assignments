package com.streamex;

public class Student {
	String name;
	int id;
	int maths;
	int science;
	int social;
	int total=maths+science+social;
	int percentage=total/3;
	char grade;
	{
	if(total>250)
	{
		grade='a';
	}
	else if(total>230 && total<250)
	{
		grade='b';
	}
	else if(total>200 && total<230)
	{
		grade='c';
	}
	else if(total>150 && total<200)
	{
		grade='d';
	}
	else
	{
		grade='f';
	}
	}
	public Student(String name, int id, int maths, int science, int social) {
		super();
		this.name = name;
		this.id = id;
		this.maths = maths;
		this.science = science;
		this.social = social;
		this.total=maths+science+social;
		//char grade;
		{
		if(total>250)
		{
			grade='a';
		}
		else if(total>230 && total<250)
		{
			grade='b';
		}
		else if(total>200 && total<230)
		{
			grade='c';
		}
		else if(total>150 && total<200)
		{
			grade='d';
		}
		else
		{
			grade='f';
		}
		
		}
		percentage=total/3;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", maths=" + maths + ", science=" + science + ", social="
				+ social + ", total=" + total + ", grade=" +grade + ", percentage=" + percentage + "]";
	}
	
}
