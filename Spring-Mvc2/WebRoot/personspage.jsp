<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  

  
  <body>
   <h1>Person's information</h1> <br>
   <table>
   <tr>
   <td>ID</td>
   <td>FristName</td>
   <td>LastName</td>
   <td>Amount</td>
   </tr>
   <c:forEach items="${list}" var="person">
   <tr>
   <td>
   <c:out value="${person.id}"></c:out>
   </td>
   <td>
   <c:out value="${person.firstName}"></c:out>
   </td>
   <td>
   <c:out value="${person.lastName}"></c:out>
   </td>
   <td>
   <c:out value="${person.amount}"></c:out>
   </tr>
   </c:forEach>
   
   
   </table>
  </body>
</html>
