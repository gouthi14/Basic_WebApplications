<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>Employee Hours</title>
<style type="text/css">
*
body {
 height: 100%; 
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}



margin:0px;

ul{

list-style:none
}
a{
text-decoration:none;
color:#FFEBCD;
font-family:"Times New Roman", Georgia, Serif;
font-size:20px;
list-style:none;
}
li{

border:1px #FFEBCD solid;
width:160px;
height:40px;
background-color:#4682b4;
text-align:center;
margin-right:1px;
line-height:40px;
float:left;
list-style:none;
}
li:hover{
background-color:#CD853F;
}
h1{
font-family:"Times New Roman", Georgia, Serif;
color:#008080;

text-align:center;
line-hight:100px;
margin:0px;
}
h2{
font-family:"Times New Roman", Georgia, Serif;
text-align:right;
color: 	#008080;
}
</style>
</head>
<body background="C:\Users\gouthamgoud\Desktop\izeal_background\f5c6819827ad701e67b01e058effd28e.jpg">

<h1>WELCOME TO IZEAL INC<h1><hr>
<h2>MANAGER: MR.VISHNU</h2><hr>
<ul>
<li><a href="file:///C:/Users/gouthamgoud/Desktop/Izeal_inc.html">Home</a></li>
<li><a href="http://www.izealinc.com/izealinc_solutions.html">Solutions</a></li>
<li><a href="http://www.izealinc.com/izealinc_consulting_services.html">Services</a></li>
<li><a href="http://www.izealinc.com/izealinc_careers.html">Careers</a></li>
<li><a href="file:///C:/Users/gouthamgoud/Documents/timer_project.html">Register</a></li>
<li><a href="file:///C:/Users/gouthamgoud/Desktop/Login.html">Login</a></li>
<li><a href="http://www.izealinc.com/izealinc_contactus.html">Contact Us</a></li>
</ul>
<br/> <br/>

<form action="Log.jsp">
<table align="center" > 
<tr><td>LASTNAME</td><td> 
<input type="text" name="lname"> 
</td></tr> <br/>


<tr><td>PASSWORD</td> 
<td><input type="password" name="pass"> 
</td></tr> <br/><br/><br/>
 <tr><td><input type="submit" value="Login"/></td></tr>
 </table>

</body>

</html>