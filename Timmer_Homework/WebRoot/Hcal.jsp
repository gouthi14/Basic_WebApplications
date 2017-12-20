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

<%
String name=request.getParameter("name");
String m=request.getParameter("monday");
String tu=request.getParameter("tuesday");
String w=request.getParameter("wednesday");
String th=request.getParameter("thursday");
String f=request.getParameter("friday");
String sat=request.getParameter("saturday");
String su=request.getParameter("sunday");
String total=request.getParameter("total");
// int tu=Integer.parseInt("tuesday");
//int w=Integer.parseInt("wednesday");
//int th=Integer.parseInt("thursday");
//int f=Integer.parseInt("friday");
//int sat=Integer.parseInt("saturday");
//int su=Integer.parseInt("sunday");
//int total=Integer.parseInt("total");

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
Statement st=conn.createStatement();

 int i=st.executeUpdate("insert into Hourcall(name,monday,tuesday,wednesday,thursday,friday,saturday,sunday,totalHours) values('"+name+"','"+m+"','"+tu+"','"+w+"','"+th+"','"+f+"','"+sat+"','"+su+"','"+total+"')");


if(i!=0)
{
response.sendRedirect("success.jsp");
}
else
{
response.sendRedirect("fail.jsp");
}

conn.close();


%>