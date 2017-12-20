package izeal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hours_Login extends HttpServlet {
	int status=0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
    throws ServletException, IOException {  
response.setContentType("text/html");  
PrintWriter out=response.getWriter(); 
String username=null;
String password=null;
String user=request.getParameter("uname");
String pass=request.getParameter("psd");
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
	Statement stmt=conn.createStatement();
	ResultSet rs;
	rs=stmt.executeQuery("select *from hours where username='"+user+"'and password='"+pass+"'");
	if(rs.next())
	{
	        response.sendRedirect("success.jsp");
	}
	        else
	        {
	        response.sendRedirect("faill.jsp");
	        }
	        conn.close();
	        stmt.close();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}




}

}
