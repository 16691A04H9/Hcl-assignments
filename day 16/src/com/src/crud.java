package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class crud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/hcldb";
		System.out.println("enter user name");
		String user = s.next();
		String password = s.next();
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement st = con.createStatement();
			int i;
			do {

				System.out.println("enter your choice");
				System.out.println("1.add student");
				System.out.println("2.Remove student");
				System.out.println("3.update stduent");
				System.out.println("4.display student");
				System.out.println("5.exit");
				i = s.nextInt();
				switch (i) {
				case 1:
					System.out.println("enter id");
					int s1=s.nextInt();
					System.out.println("enter name");
					String sname=s.next();
					int rowsInserted = st.executeUpdate("insert into students values("+s1+",'"+sname+"')");
					if (rowsInserted > 0) {
						System.out.println("A new student was inserted successfully!");
					}
					break;
				case 2:
					String sql1 = "DELETE FROM students WHERE sname=?";

					PreparedStatement statement1 = con.prepareStatement(sql1);
					statement1.setString(1, "akshith");
					int rowsDeleted = statement1.executeUpdate();
					if (rowsDeleted > 0) {
						System.out.println("A user was deleted successfully!");
					}
					break;
				case 3:
					String sql11 = "UPDATE students SET sname=? where sid=?";

					PreparedStatement statement11 = con.prepareStatement(sql11);
					statement11.setString(1, "chiru");
					statement11.setString(2, "2");

					int rowsUpdated = statement11.executeUpdate();
					if (rowsUpdated > 0) {
						System.out.println("An existing student was updated successfully!");
					}
					break;
				case 4:
					ResultSet rs=st.executeQuery("select * from students"); 
					while (rs.next()){
					    System.out.println(rs.getInt("sid")+" "+rs.getString("sname"));
					}
				case 5:
					System.out.println("exit");
					break;
				}
			} while (i != 5);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
