<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <style type="text/css">
  h1
  {
   height:100px;
   line-height:100px;
   text-align:center;
   background-color:#39CCCC;
  }
  
  
  </style>
   
  </head>
  
  <body>
   <h1>Spring Employee Details</h1><hr> <br>
   <table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>firstName</th><th>lastName</th><th>department</th><th>salary</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.firstName}</td>  
   <td>${emp.lastName}</td>  
   <td>${emp.department}</td> 
   <td>${emp.salary}</td> 
   <td><a href="Editemp/${emp.id}">Edit</a></td>  
   <td><a href="Deleteemp/${emp.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="Addemp.jsp">Add New Employee</a>  
  </body>
</html>
