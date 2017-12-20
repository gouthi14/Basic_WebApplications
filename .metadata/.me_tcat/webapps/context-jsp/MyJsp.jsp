<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
out.print("welcome "  +request.getParameter("uname"));
String driver=application.getInitParameter("dname");
out.print("DriverName is= "+driver);
%>