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
  h1{
   height:100px;
   line-height:100px;
   text-align:center;
   background-color:#0074d9;
  }
  
  
  </style>
   

  </head>
  
  <body>
    <h1>EDIT INFORMATION OF EMPLOYEE</h1> <hr/> <br>
    <form:form method="post" action="/Spring-Mvc-Emp/edit">
    <table>
    <tr>
    <td><form:input path="id"/>
    
    
    </td>
    
    </tr>
    <tr>
    <td><form:input path="firstName"/>
    </td>
    </tr>
    <tr>
    <td><form:input path="lastName"/>
    </td>
    </tr>
    <tr>
    <td><form:input path="department"/>
    </td>
    </tr>
    <tr>
    <td><form:input path="salary"/>
    </td>
    </tr>
    <tr>
    <td> </td>
    <td><input type="submit" value="Edit Save"/>
    </td>
    </tr>
    
    </table>
    </form:form>
    
  </body>
</html>
