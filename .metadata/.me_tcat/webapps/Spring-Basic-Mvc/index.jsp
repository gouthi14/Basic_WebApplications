<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <style type="text/css">
   
   h1{
   height:100px;
   line-heght:100px;
   text-align:center;
   background-color:#ff851b;
   }
   a{
   text-align:center;
   background-color:#85144b;
   }
   </style>

  </head>
  
  <body>
   <h1>THIS IS BASIC SPRING MVC APPLICATION</h1><hr/><br>
   
   <a href="Hello.html">CLICK ME</a>
  </body>
</html>
