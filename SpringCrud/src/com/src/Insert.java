package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void studAdd(CRUD ds,Student c) throws SQLException, ClassNotFoundException
	{		
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		int i=st.executeUpdate("insert into customer values('"+c.getName()+"','"+c.getId()+"')");
        System.out.println(i+" rows Added Successfully");
	}
}
