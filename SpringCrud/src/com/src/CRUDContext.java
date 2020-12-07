package com.src;
import org.springframework.context.annotation.Bean;
public class CRUDContext {
	@Bean(name="mysql")
	public CRUD getCRUDMysql()
	{
		 String driver="com.mysql.cj.jdbc.Driver";
		 String url="jdbc:mysql://localhost:3306/hcldb";
		String user="root";
		String password="Akshi@123";
		CRUD e= new CRUD(password, password, password, password);
		e.setDriverclass(driver);
		e.setUrl(url);
		e.setUsername(user);
		e.setPassword(password);
		return e;
	}
}
