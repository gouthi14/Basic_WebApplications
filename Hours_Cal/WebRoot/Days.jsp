<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Employee Hours</title>
<meta charset="windows-1252">
<meta name="viewport" content="width=device-width, intial-scale=1.0">
<style>
input[type=text]:focus {
    border: 3px solid #555;
}

<script>
function calc(){
  var n1=parseInt(document.getElementById('n1').value);
  var n2=parseInt(document.getElementById('n2').value);
   var n3=parseInt(document.getElementById('n3').value);
    var n4=parseInt(document.getElementById('n4').value);
	 var n5=parseInt(document.getElementById('n5').value);
	  var n6=parseInt(document.getElementById('n6').value);
	   var n7=parseInt(document.getElementById('n7').value);
  var oper=document.getElementById('operators').value;
  if(oper==='+'){
   document.getElementById('result').value=n1+n2+n3+n4+n5+n6+n7;
  }
}
</script>
</style>
</head>
<body background="C:\Users\gouthamgoud\Desktop\izeal_background/1.jpg"">
<form action="Calculate" method="post">
MONDAY:
<input type="text" name="monday" id="n1"/><br/><br/>
TUESDAY:
<input type="text" name="tuesday" id="n2"/><br/><br/>
WEDNESDAY:
<input type="text" name="wednesday" id="n3"/><br/><br/>
THURSDAY:
<input type="text" name="thursday" id="n4"/><br/><br/>
FRIDAY:
<input type="text" name="friday" id="n5"/><br/><br/>
SATDAY:
<input type="text" name="satday" id="n6"/><br/><br/>
SUNDAY:
<input type="text" name="sunday" id="n7"/><br/><br/>

<select id="operators">
<option value="+">+</option>
<option value="-">-</option>
</select>

<button onclick="calc();">Total Hours</button>
<input type="text" id="result"/>

</form>

</body>

</html>