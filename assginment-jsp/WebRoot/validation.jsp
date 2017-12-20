<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@page import="java.sql.*" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<%
String username=null;
String password=null;
String name=request.getParameter("uname");
String pass=request.getParameter("psd");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("select * from go");
   if(rs.next())
         
       { 
       username=rs.getString(1);
         password=rs.getString(2);
         if( username.equals(name)&&password.equals(pass))
         
           {
         response.sendRedirect("welcome.html");
         }
        else
        {
       response.sendRedirect("fail.jsp");
        }
       
        }
         conn.close();
         stmt.close();
%>