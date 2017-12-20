<%@taglib uri="http://struts.apache.org/tags-html"prefix="html"%>
<h1>REGISTERATION FORM</h1>
<html:form action="reg" method="post">
<table>
<tr><td>ID</td><td><html:text property="id"/></td><td><html:errors property="id_e"/></td></tr>
<tr>
<td>NAME</td>
<td><html:text property="name"/></td>
<td><html:errors property="name_e"/></td>
</tr>
<tr>
<td>EMAIL</td>
<td><html:text property="email"/></td>

<td><html:errors property="email_e"/></td>
</tr>
<tr>
<td>ADDRESS</td>
<td><html:text property="address"/></td>
<td><html:errors property="address_e"/></td>
</tr>
<tr>
<td>GENDER:MALE</td>
<td><html:radio property="gender" value="male"/>
</td><td><html:errors property="gender_e"/></td>
</tr>
<tr>
<td>GENDER:FEMALE</td>
<td><html:radio property="gender" value="female"/></td>
<td></td></tr>
<tr>
<td>HOBIES</td>
<td><html:checkbox property="hobies" value="hobie1:"/>WATCHING TV</td>
<td><html:errors property="hobies_e"/></td>
</tr>
<tr>
<td><html:checkbox property="hobies" value="hobie2:"/>READING BOOKS</td>
<td></td></tr>
<tr>
<td><html:checkbox property="hobies" value="hobie3:"/>PLAYING GAMES</td>
<td></td></tr>
<tr>
<td><html:submit value="REGISTER"/></td>
</tr>
</table>
</html:form>

