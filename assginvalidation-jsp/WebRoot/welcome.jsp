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
String pass=request.getParameter("psd");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
PreparedStatement ps=conn.prepareStatement("insert into validation values(?,?)");
ps.setString(1,name);
ps.setString(2,pass);
ps.executeQuery();
conn.close();
ps.close();
out.print("inseration done");



%>