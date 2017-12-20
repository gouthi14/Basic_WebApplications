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
String LASTNAME=null;
String PASSWORD=null;
String name=request.getParameter("lname");
String pas=request.getParameter("pass");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
Statement stmt=conn.createStatement();
ResultSet rs;
rs=stmt.executeQuery("select * from EM_Details where FIRSTNAME='"+name+"'and PASSWORD='"+pas+"'");

if(rs.next())
{
        response.sendRedirect("fail.jsp");
}
        else
        {
        response.sendRedirect("Hours.jsp");
        }
        conn.close();
        stmt.close();
        




 %>
