<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%
Connection conn;
PreparedStatement ps;
Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
 ps=conn.prepareStatement("insert into validation(USERNAME,PASSWORD) values('ggg','sss')");
 ps.executeQuery();
                     
                     conn.close();
                     ps.close();
                     
%>