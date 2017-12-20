
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gouthamgoud
 */
public class App extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response)  
          throws ServletException,IOException
  {
      
      response.setContentType("text/html");
      
      PrintWriter out=response.getWriter();
      
      try
      {
          
      
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");

      Statement stmt=conn.createStatement();
     String str="insert into qualification values('abc',11)";
     
     stmt.execute(str);
     conn.close();
                   }
      catch(Exception e)
      {
          System.out.println(e);
         
      }
      }
      
  }

