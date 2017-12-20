<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head><tittle>IZEAL INC</tittle>
<style>

@keyframes slider{
0%{
left:0%;
}
10%{
left:0%;
}
12%{
left:-100%;
}
22%{
left:-100%;
}
24%{
left:-200%;
}
34%{
left:-200%;
}
36%{
left:-300%;

}
46%{
left:-300%;
}

48%{
left:-400%;
}
58%{
left:-400%;
}
60%{
left:-300%;
}
70%{
left:-300%;
}

72%{
left:-200%;
}

82%{
left:-200%;
}

84%{
left:-100%;
}

94%{
left:-100%;
}

96%{
left:0%;
}
}

#slider{
overflow:hidden;

}

#slider figure img{
width:20%;
float=left;
}

#slider figure{
 position: relative;
    width: 500%;
    height: 150%;
    top: 0px;
    left: 0px;
    z-index: 0; 
	
	font-size:0;
animation:slider 20s infinite;

}

*
body {
    background-color: lightblue;
}



//margin:0px;

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
background-color:#CD853F;
cursor:pointer;
}
h1{
font-family:Arial;
font-color:Green;
background-color:#AFEEEE;
text-align:center;
line-hight:100px;
margin:0px;
}
h2{
font-family:Arial;
font-color:Gold;
background-color:#808080;
text-align:right;
}

p{
font-size: 18px;
font-family: "Times New Roman", Times, serif;
font-style: normal;
}

h3{
font-family:Arial;
font-color:Gold;
background-color:#808080;
text-align:left;
}

</style>
</head>
<body>
<h1>WEL COME TO IZEAL INC<h1><hr>
<h2>MANAGER: MR.VISHNU</h2><hr>
<ul>
<li><a href="file:///F:/Desktop/Izeal_home.html">Home</a></li>
<li><a href="http://www.izealinc.com/izealinc_solutions.html">Solutions</a></li>
<li><a href="http://www.izealinc.com/izealinc_consulting_services.html"></a>Services</li>
<li><a href="http://www.izealinc.com/izealinc_careers.html">Careers</a></li>
<li><a href="file:///C:/Users/gouthamgoud/Documents/timer_project.html">Register</a></li>
<li><a href="#">Login</a></li>
<li><a href="http://www.izealinc.com/izealinc_contactus.html">Contact Us</a></li>
</ul>
<br><br><br>
<div id="slider">
<figure>
<img src="C:\Users\gouthamgoud\Desktop\izeal_background/640C58C0-0C6F-4E45-8695-F76E3CC3FA57.JPG"/>
<img src="C:\Users\gouthamgoud\Desktop\izeal_background/0CE786F0-7015-492F-815D-4FE438768985.JPG"/>
<img src="C:\Users\gouthamgoud\Desktop\izeal_background/67AAFB5D-C231-4E01-BB0F-83BA73FDBDC8.JPG"/>
<img src="C:\Users\gouthamgoud\Desktop\izeal_background/1.jpg"/>
<img src="C:\Users\gouthamgoud\Desktop\izeal_background/background_city2.jpg"/>
</figure>

</div>



<h3>iZeal Inc Overview</h3><br><br>

<p>IZeal Inc., is a recognized premier provider of strategic staffing and software solutions across USA and India.
The team at iZeal, Inc., has specialty staffing experience to offer our partners both clients and consultants.
At iZeal, we have an energetic team of professionals, who constantly strive to exceed the expectations of clients and customers.
Our logo says it all - we deliver the BEST. Be it resources or solutions, we go hand-in-hand with the cutting edge technologies.
</p>

<p>iZeal, Inc., is also a provider of Internet Outsourcing Solutions.
We offer qualified IT professionals from that will work for our clients via Internet from their home countries instantly without complicated immigration procedures.
Webmasters, web developers, web designers, software developers, Business Analysts, QA Testers, graphic designers, etc.<p>

<p>With proven methodologies, exceptional project management, solid performance metrics, and our cutting-edge development center, 
iZeal's Technology Solution Team provides end-to-end web development services that can be tailored to meet your unique business needs.</p>

<p>We are proud of our state-of-the-art development center-secure facilities that can be custom-configured to any client's unique technical environment.
Our expertise in development and delivery gives you freedom from project staffing issues, internal space constraints, equipment purchases, and more. 
You can focus on your core business while we focus on delivering innovative solutions to your web development needs.</p>
 
<p> With its team of staffing professionals, technology thought leaders, certified usability analysts, 
 interface designers, and system architects, providing services that focus on user adoption
 technology solutions, and business results, iZeal, Inc has become one of the fastest growing solutions provider in the United States.
 </p>


</body>
</html>
