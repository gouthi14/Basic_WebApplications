import java.beans.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.legacy.connection.Connection;


public class reg extends HttpServlet {


	Connection conn;
	    PreparedStatement ps;
	     ResultSet rs;
	     public void service(HttpServletRequest request,HttpServletResponse response)
         throws ServletException,IOException{
	     String user=request.getParameter("name");
		        String pss=request.getParameter("psd");
	    
	        try{
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            conn=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:xe","system","goutham");
	        }
	        catch(Exception e)
	        {
	            System.out.println("error while loading");
	        }
	    
	  
	    
	        try{
	            
	      
	        String q="select * from validation";
	        Statement st=(Statement) ((java.sql.Connection) conn).createStatement();
	        rs=((java.sql.Statement) st).executeQuery(q);
	        String username=null;
	        String password=null;
	        while(rs.next())
	        {
	            username=rs.getString(1);
	            password=rs.getString(2);
	        }
	        if(username.equals(user)&&password.equals(pss))
	        {
	            System.out.println("index.jsp");
	        }
	        else
	        {
	            System.out.println("login fail");
	        }
	        
	        }
	    catch(Exception e){
	        
	    }}
	
	        
	

}

