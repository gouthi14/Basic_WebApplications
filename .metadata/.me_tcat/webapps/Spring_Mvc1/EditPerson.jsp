<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  
  <body>
    <h1>Person</h1> <br>
    <p>You have Editde person with Id ${id}</p>
    <%=new java.util.Date()%>
    
  </body>
</html>
