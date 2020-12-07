package com.src;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CrudMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new AnnotationConfigApplicationContext(CRUDContext.class);
		CRUD s=(CRUD) context.getBean("mysql");
		System.out.println("1. Add customer");
		System.out.println("2. Delete customer");
		System.out.println("3. Update customer");
		System.out.println("4. Display customer");
		System.out.println("Enter your Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				Student c=new Student();
				System.out.println("Enter customer name");
				c.setName(sc.next());
				System.out.println("Enter customer address");
				c.setId(sc.next());
				Insert.studAdd(s,c);
				break;
			}
			case 2:
			{
				System.out.println("Enter customer name to be deleted");
				String name=sc.next();
				Delete.studDelete(s,name);
				break;
			}
			case 3:
			{
				System.out.println("Enter customer name");
				String name=sc.next();
				Update.studUpdate(s,name);
				break;
			}
			case 4:
			{
				System.out.println("Enter customer name");
				String name=sc.next();
				Display.studDisplay(s,name);
				break;
			}
			default:
				System.out.println("Invalid Choice!!");
				break;
		}
		
	}

}
