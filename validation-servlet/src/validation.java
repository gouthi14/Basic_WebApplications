import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.legacy.connection.Connection;




public class validation extends HttpServlet {
	PreparedStatement ps;
    ResultSet rs;
	Connection con;

	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
			 String username=request.getParameter("name");
             String password=request.getParameter("psd");
             String USERNAME=null;
             String PASSWORD=null;
             
             try
             {
                   ps=((java.sql.Connection) con).prepareStatement("select * from validation where username=? and password=?");
                   ps.setString(1,USERNAME);
                   ps.setString(2,PASSWORD);
                   rs=ps.executeQuery();
                   while(rs.next()){
         USERNAME=rs.getString(1);
         PASSWORD=rs.getString(2);
            
                                      }  
                 
if(password.equals(PASSWORD)&&username.equals(USERNAME))
     {
         RequestDispatcher rd=request.getRequestDispatcher("welcome");
         rd.forward(request,response);
     }
     else
     {
         RequestDispatcher rd=request.getRequestDispatcher("welcome");
         out.println("<font-color='Red'><b>you have entered incorrect username or password</b></font>");
         rd.include(request,response);
     }
 }           catch (SQLException ex) {
                
             }finally{
     out.close();
             }
	}catch (Exception e){}

}
}

