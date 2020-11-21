package com.library;

public interface IBook {
	abstract void Stringtitle();
	abstract void dayTaken();
	//abstract void days(int a);
	//abstract void author();
}
abstract class ABook implements IBook
{
	abstract void author();
	abstract int daysOverdue(int a);
	abstract boolean isOverdue(int b);
	abstract int computerFine(int d);
}
 class Book extends ABook implements IBook
{
//	int days;
//	public int getDays() {
//		return days;
//	}
//	public void setDays(int days) {
//		this.days = days;
//	}
	public void Stringtitle()
	{
		System.out.println("Wings of fire");
	}
	public void author()
	{
		System.out.println("APJ ");
	}
	public void dayTaken()
	{
		System.out.println("Enter no of days taken");
	}
	@Override
	int daysOverdue(int a) {
		// TODO Auto-generated method stub
		int date=0;
		//int date1;
		if(a>(date+14))
		{
			int c=a-(date+14);
			System.out.println("Overdue");
			return c;
		}
		else
		{
			int c=(date+14)-a;
			System.out.println("NO overdue");
		return c;
		}
	}
	@Override
	boolean isOverdue(int a) {
		// TODO Auto-generated method stub
		int date=0;
		//int date1;
		int c=(date+14)-a;
		if(c>0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	@Override
	int computerFine(int a) {
		// TODO Auto-generated method stub
		int date=0;
		int c=a-(date+14);
		if(c>0)
		{
			return 10*c;
		}
		else
		{
		return 0;
		}
	}
	
}
 class RefBook extends ABook implements IBook
{
//	int days;
//	public int getDays() {
//		return days;
//	}
//	public void setDays(int days) {
//		this.days = days;
//	}
	public void Stringtitle()
	{
		System.out.println("digital design");
	}
	public void dayTaken()
	{
		System.out.print("Enter no of days taken");
	}
	@Override
	int daysOverdue(int a) {
		// TODO Auto-generated method stub
		int date=0;
		//int date1;
		if(a>(date+2))
		{
			int c=a-(date+2);
			System.out.println("Overdue");
			return c;
		}
		else
		{
			int c=(date+2)-a;
			System.out.println("NO overdue");
		return c;
		}
	}
	@Override
	boolean isOverdue(int a) {
		// TODO Auto-generated method stub
		int date=0;
		//int date1;
		int c=(date+2)-a;
		if(c>0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	@Override
	int computerFine(int a) {
		// TODO Auto-generated method stub
		int date=0;
		int c=a-(date+2);
		if(c>0)
		{
			return 10*c;
		}
		else
		{
		return 0;
		}
	}
	@Override
	void author() {
		// TODO Auto-generated method stub
		
	}

}
class AudioBook extends ABook implements IBook
{
//	int days;
//	
//	public int getDays() {
//		return days;
//	}
//
//	public void setDays(int days) {
//		this.days = days;
//	}

	@Override
	public void Stringtitle() {
		// TODO Auto-generated method stub
		System.out.println("Sp balu audio");
	}

	@Override
	public void author() {
		// TODO Auto-generated method stub
		System.out.println("S P BALASUBRAMANYAM");
	}

	@Override
	public void dayTaken() {
		// TODO Auto-generated method stub
		System.out.println("Enter no of days taken");
	}
	@Override
	int daysOverdue(int days) {
		// TODO Auto-generated method stub
		int date=0;
		//int date1;
		if(days>(date+14))
		{
			int c=days-(date+14);
			System.out.println("Overdue");
			return c;
		}
		else
		{
			int c=(date+14)-days;
			System.out.println("NO overdue");
		return c;
		}
	}
	@Override
	boolean isOverdue(int days) {
		// TODO Auto-generated method stub
		int date=0;
		//int date1;
		int c=(date+14)-days;
		if(c>0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	@Override
	int computerFine(int days) {
		// TODO Auto-generated method stub
		int date=0;
		int c=days-(date+14);
		if(c>0)
		{
			return 20*c;
		}
		else
		{
		return 0;
		}
	}

}