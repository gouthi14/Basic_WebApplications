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
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String mail=request.getParameter("mail");
String user=request.getParameter("uname");
String pass=request.getParameter("pass");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into registeration(firstname,lastname,email,username,password) values('"+fname+"','"+lname+"','"+mail+"','"+user+"','"+pass+"')");

if(i!=0)
{
response.sendRedirect("login.jsp");
}
else
{
response.sendRedirect("reg.jsp");
}


PreparedStatement ps=conn.prepareStatement;
i=("insert into EM_Details values(?,?,?,?,?,?)");
ps.setString(1,fname);
ps.setString(2,lname);
ps.setString(3,email);
ps.setString(4,pass);
ps.setString(5,cpass);
ps.setString(6,project);
ps.executeQuery();



%>