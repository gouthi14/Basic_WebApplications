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
int i;
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String email=request.getParameter("email");

String pass=request.getParameter("pass");
String cpass=request.getParameter("cpass");
String project=request.getParameter("project");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
Statement st=conn.createStatement();

 i=st.executeUpdate("insert into EM_Details(firstname,lastname,email,password,confirmpassword,project) values('"+fname+"','"+lname+"','"+email+"','"+pass+"','"+cpass+"','"+project+"')");


if(i!=0)
{
response.sendRedirect("Login.jsp");
}
else
{
response.sendRedirect("fail.jsp");
}

conn.close();


%>