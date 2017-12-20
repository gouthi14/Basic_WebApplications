<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head><tittle>IZEAL EMPLOYEE APPLICATION</tittle>
<style type="text/css">

body{
width:200px;
height:100px;
}


{
margin:0px;
}
ul{

list-style:none
}
a{
text-decoration:none;
color:white;
}
li{
border:1px lightbule solid;
width:160px;
height:40px;
font-size: 18px;
font-family:Arial;
font-color:Black;
text-align:center;
margin-right:1px;
line-height:40px;
float:left;
}
li:hover{

cursor:pointer;
}
h1{
font-family:Arial;
font-color:Green;

text-align:center;
line-hight:100px;
margin:0px;
}
h2{
font-family:Arial;
font-color:Gold;

text-align:right;
}
table
{
font-family:Arial;
text-align:center;

line-hieght:100px;
font-color:green;
table-align:center;
}
form{
text-align:center;
}
</style>
</head>
<body background="C:\Users\gouthamgoud\Desktop\izeal_background/1.jpg">
<h1>IZEAL EMPLOYEE REGISTERATION<h1><hr>
<h2>MANAGER: MR.VISHNU</h2><hr>
<ul>
<li><a href="file:///F:/Desktop/Izeal_home.html">Home</a></li>
<li><a href="#">Solutions</a></li>
<li><a href="#">Services</a></li>
<li><a href="#">Careers</a></li>
<li><a href="#">Contact Us</a></li>
</ul>
   <table>
                               <tr><td><form action="Izeal.jsp" method="Post"></td></tr>
                                          <tr><td>FIRSTNAME:</td></tr>
                                          <tr><td><input type="text" name="fname"></td></tr>
										   <tr><td>LASTNAME:</td></tr>
                                          <tr><td><input type="text" name="lname"></td></tr>
                                          <tr><td>EMAIL:</td></tr>
                                          <tr><td><input type="text" name="email"></td></tr>
                                          <tr><td>PASSWORD:</td></tr>
                                          <tr><td><input type="password" name="pass"></td></tr>
                                          <tr><td>confirmPASSWORD:</td></tr>
						                  <tr><td><input type="password" name="cpass"></td></tr>
										    <tr><td><input type="radio" name="project" value="OptiSelect">OptiSelect</td></tr>
   <tr><td><input type="radio" name="project" value="Production Process Management">Production Process Management</td></tr>
   <tr><td><input type="radio" name="project" value="other"> Other</td></tr>
										  <tr><td><input type="submit" value="REGISTER"></td></tr>
						 </form>

</table>


</body>
</html>
