package beanclass;

import java.beans.Statement;
import java.sql.DriverManager;

import com.sun.corba.se.pept.transport.Connection;

import java.sql.*;

public class dao {

	public void insertData(String firstName,String lastName,String userName,String password,String email,String phoneNumber)
	throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
	try
	{
		try
		{
			Statement stmt=(Statement) ((java.sql.Connection) conn).createStatement();
			int value=((java.sql.Statement) stmt).executeUpdate("insert into User_Details(first_name,last_name,password,email,phone_number) values ('"+firstName+"','"+lastName+"','"+userName+"','"+password+"','"+email+"','"+phoneNumber+"')");
			
			System.out.println("one row effected"+value);
		
		}catch(SQLException ex)
		{
			System.out.println("not executed"+ex);
		
		}
		conn.close();
		
	}catch(Exception e)
	{
	System.out.println(e);
	}
	}

	
		
	}
	

