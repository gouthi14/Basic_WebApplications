<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
h1{
font-size:40;
margin:0px;
text-align:center;
height:150px;
font-family:times new roman;
font-color:Pink;
background-color:pink;
text-align:center;
line-height:100px;
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
    <h1>hello welcome to GOUTHAM'S page</h1><hr/> <br>
    <a href="login.jsp">LOGIN:</a><hr/><br/><br/>
    <a href="reg.jsp">REGISTERATION:</a><hr/>
  </body>
</html>
