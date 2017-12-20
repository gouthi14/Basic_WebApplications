package izeal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Storing_Data extends HttpServlet {
	
	

	 public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException,IOException{
		 
response.setContentType("text/html");
PrintWriter out=response.getWriter();
try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection conn=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe","system","goutham");
  String name1=request.getParameter("fname");
     String name2=request.getParameter("lname");
     String mail=request.getParameter("email");
     String psd=request.getParameter("pass");
     String cpsd=request.getParameter("cpass");
     String project=request.getParameter("project");
     
     PreparedStatement ps=conn.prepareStatement("insert into timer_project values(?,?,?,?,?)");
             ps.setString(1,name1);
             ps.setString(2,name2);
             ps.setString(3,mail);
             ps.setString(4,psd);
             ps.setString(5,cpsd);
             ps.setString(5,project);
             int i=ps.executeUpdate();
             if(i!=0)
             out.println("registeration success");
             else
             out.println("registeration fail");
             }catch(Exception e){out.close();}
             }

	}

	


 


