package izeal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hours_Calculation extends HttpServlet {
	int status=0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
    throws ServletException, IOException {  
response.setContentType("text/html");  
PrintWriter out=response.getWriter(); 
String name=request.getParameter("name");
String mon=request.getParameter("Monday");
String tus=request.getParameter("Tuesday");
String wed=request.getParameter("Wednesday");

String thu=request.getParameter("Thursday");
String fri=request.getParameter("Friday");
String sat=request.getParameter("Saturday");
String sun=request.getParameter("Sunday");
String total=request.getParameter("Total");
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
	PreparedStatement ps=conn.prepareStatement("insert into hours2 values(?,?,?,?,?,?,?.?,?)");
	ps.setString(1,name);
	ps.setString(2,mon);
	ps.setString(3,tus);
	ps.setString(4,wed);
	ps.setString(5,thu);
	ps.setString(6,fri);
	ps.setString(7,sat);
	ps.setString(8,sun);
	ps.setString(9,total);
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
response.sendRedirect("Success2.html");
}
else
{
response.sendRedirect("Fail.html");
}






    }


}


