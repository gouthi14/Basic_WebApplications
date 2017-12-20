<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<tittle>ASSIGNMENT</tittle>
</head>
<style>
h1{
font-family:Arial;
background-color:pink;
font-color:black;
text-align:center;
line-height:100px;
margin:0px
}
form{
font-family:Arial;
font-color:pink;
text-align:center;
}
</style>
<body>
<h1>JAVA LOGIN VALIDATION</h1><hr>
<br>
<pre>

<form action="welcome.jsp" method="post">
USER NAME:
<input type="text" name="name"><br><br>
PASSWORD:
<input type="password" name="psd"><br><br>
<input type="SUBMIT" value="submit">
<a href="newhtml.html"></a>
</pre>
</form>
</body>

</html>
