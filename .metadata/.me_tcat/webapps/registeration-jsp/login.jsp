<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
margin:0px;
height:100px;
font-family:times new roman;
font-color:Pink;
background-color:green;
text-align:center;
line-height:100px;
}
form
{
text-align:center;
background-color:blue;
}
</style>

  </head>
  
  <body>
   <h1>please login with USERNAME AND PASSWORD:</h1><hr/> <br>
   <form action="welcome.jsp" method="post">
   USERNAME:
   <input type="text" name="uname"/><br/><br/>
   PASSWORD:
   <input type="password" name="psd"/><br/><br>
   <input type="submit" value="SUBMIT"/>
   </form>
  </body>
</html>
