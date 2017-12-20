<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@page import="java.sql.*" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%
String user=null;
String USERNAME=null;


Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
PreparedStatement ps=conn.prepareStatement("select * from gender");

                      ResultSet rs=ps.executeQuery();
                      while(rs.next())
            user=rs.getString(1);
           out.print("this is ids="+user);
            
            conn.close();
            ps.close();
               


 %>

