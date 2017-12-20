<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head><tittle>IZEAL EMPLOYEE APPLICATION</tittle>
<style>
*
body {
    background-color: lightblue;
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
//border:1px red solid;
width:160px;
height:40px;
background-color:#4682b4;
text-align:center;
margin-right:1px;
line-height:40px;
float:left;
}
li:hover{
//background-color:#CD853F;
cursor:pointer;
}
h1{
font-family:Arial;
font-color:Green;
//background-color:#AFEEEE;
text-align:center;
line-hight:100px;
margin:0px;
}
h2{
font-family:Arial;
font-color:Gold;
//background-color:#808080;
text-align:right;
}
table
{
font-family:Arial;
text-align:center;
background-color:#F0F8FF;
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
<li><a href="#"></a>Services</li>
<li><a href="#">Careers</a></li>
<li><a href="#">Contact Us</a></li>
</ul>
<table>
                               <tr><td><form action="./regster" method="Post"></td></tr>
                                          <tr><td>FIRSTNAME:</td></tr>
                                          <tr><td><INPUT type="text" name="fname"/></td></tr>
										   <tr><td>LASTNAME:</td></tr>
                                          <tr><td><INPUT type="text" name="lname"/></td></tr>
                                          <tr><td>EMAIL:</td></tr>
                                          <tr><td><INPUT type="text" name="email"/></td></tr>
                                          <tr><td>PASSWORD:</td></tr>
                                          <tr><td><input type="password" name="pass"/></td></tr>
                                          <tr><td>confirmPASSWORD:<tr><td>
						                  <tr><td><INPUT type="password" name="cpass"/></td></tr><br>
										  
										    <tr><td><input type="radio" name="Project" value="OptiSelect">OptiSelect</td></tr><br><br>
   <tr><td><input type="radio" name="Project" value="Production Process Management">Production Process Management</td></tr><br><br>
   <tr><td><input type="radio" name="Project" value="other"> Other</td></tr><br>
										  <tr><td><input type="submit" value="REGISTER"/></td></tr>

</form>
</table>


</body>
</html>
