
<%@taglib uri="http://struts.apache.org/tags-html"prefix="html"%>
<html>

  
  <body>
    <html:form action="/register" method="post">
   
    First Name:
    <html:text property="firstName"/><html:errors property="fname"/><br/>
    Last Name:
    <html:text property="lastName"/><html:errors property="lname"/><br/>
    User Name:
    <html:text property="userName"/><html:errors property="username"/><br/>
    Password:
    <html:password property="password"/><html:errors property="password"/><br/>
    Email:
    <html:text property="eamil"/><html:errors property="email"/><br/>
    Phone Number:
    <html:text property="phoneNumber"/><html:errors property="phone"/><br/>
                <html:submit>REGISTER</html:submit>
 
    </html:form>
  </body>
</html>
