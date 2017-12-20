<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>


<%
    String name=request.getParameter("uname");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
    PreparedStatement ps=conn.prepareStatement("insert into ggg values(?)");
    ps.setString(1,name);
    
int i=ps.executeUpdate();
if(i!=0)
out.println("Registration success");
else
out.println("registration fail");


conn.close();

    %>
