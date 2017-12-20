<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fail.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
	h1
	{
	font-family:Arial;
	font-color:red;
	background-color:red;
	}
	
	a
	{
	height:50px;
	text-decoration:none;
	text-align:center;
	line-height:50px;
	}
	</style>

  </head>
  
  <body>
   <h1>INVALID USERNAME OR PASSWORD</h1>
   <h1>or</h1>
   <h1>REGISTER HERE</h1>
  <a href="reg.jsp">REGISTERATION:</a><hr/>
  </body>
</html>
