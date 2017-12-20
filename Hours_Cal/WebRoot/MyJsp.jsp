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

int mon=request.getInitParameter("monday");
int tue=request.getParameter("tuesday");
int wed=request.getParameter("wednesday");

int  thu=request.getParameter("thursday");
int  fri=request.getParameter("friday");
int sat=request.getParameter("satday");
int  sun=request.getParameter("sunday");
int  total=request.getParameter("total");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
PreparedStatement ps=conn.prepareStatement("insert into cal values(?,?,?,?,?,?,?)");
ps.set(1,mon);
ps.setString(2,tue);
ps.setString(3,wed);
ps.setString(4,thu);
ps.setString(5,fri);
ps.setString(6,sat);
ps.setString(7,sun);
ps.executeQuery();
conn.close();
ps.close();
out.print("inseration done");



%>