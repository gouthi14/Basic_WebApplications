<%@ page language="java" import="java.util.Date" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
  </head>
  
  <body> 
   <h1>&quot;"Person</h1> <br>
  <p>hey Deleted a person with id ${id} at</p>
  <%=new java.util.Date() %>

</html>
