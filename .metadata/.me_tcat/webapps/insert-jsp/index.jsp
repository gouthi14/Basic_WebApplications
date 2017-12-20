<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    </head>
    <body>
        <h1> jsp page registration</h1><hr> 
        
        <form action="MyJsp.jsp" method="post">
            USERNAME:
            <input type="text" name="uname"/>
           
            <input type="submit" value="register"/>
        </form>
    </body>
</html>
