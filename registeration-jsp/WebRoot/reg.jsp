<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'reg.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	h1
	{
	margin:0px;
	height:50px;
	font-color:Red;
	text-align:center;
	line-height:50px;
	background-color:red;
	}
	form
	{
	text-align:center;
	background-color:pink;
	
	}
	
	
	</style>

  </head>
  
  <body>
  <h1>WELCOME TO GOUTHAM'S PAGE</h1><hr/>
    <h1>PLEASE REGISTER FOR LOGIN</h1><hr/><br>
    <pre>
    <form action="register.jsp" method="post">
    FIRSTNAME:
    <input type="text" name="fname"/><br/>
    LASTNAME:
    <input type="text" name="lname"/><br/>
    EMAIL:
    <input type="text" name="mail"/><br/>
    USERNAME:
    <input type="text" name="uname"/><br/>
    PASSWORD:
    <input type="password" name="pass"/><br/>
    <input type="submit" value="REGISTER"/>
    
    </form>
    </pre>
  </body>
</html>
