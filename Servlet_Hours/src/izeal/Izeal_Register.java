package izeal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Izeal_Register extends HttpServlet {
	int status=0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
    throws ServletException, IOException {  
response.setContentType("text/html");  
PrintWriter out=response.getWriter(); 
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String uname=request.getParameter("uname");
String email=request.getParameter("email");

String pass=request.getParameter("pass");
String cpass=request.getParameter("cpass");
String project=request.getParameter("project");
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
	PreparedStatement ps=conn.prepareStatement("insert into hours values(?,?,?,?,?,?,?)");
	ps.setString(1,fname);
	ps.setString(2,lname);
	ps.setString(3,uname);
	ps.setString(4,email);
	ps.setString(5,pass);
	ps.setString(6,cpass);
	ps.setString(7,project);
status=ps.executeUpdate();
	conn.close();
	ps.close();

} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


if(status!=0)
{
response.sendRedirect("Login.html");
}
else
{
response.sendRedirect("Fail.html");
}






    }
}