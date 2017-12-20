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
String user=request.getParameter("uname");
String pass=request.getParameter("psd");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
Statement stmt=conn.createStatement();
ResultSet rs;
rs=stmt.executeQuery("select * from registeration where username='"+user+"'and password='"+pass+"'");

if(rs.next())
{
        response.sendRedirect("success.jsp");
}
        else
        {
        response.sendRedirect("fail.jsp");
        }
        conn.close();
        stmt.close();
        




 %>
