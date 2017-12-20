package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Hours_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Employee Hours</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("*\r\n");
      out.write("body {\r\n");
      out.write("height: 100%; \r\n");
      out.write("    background-position: center;\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("margin:0px;\r\n");
      out.write("\r\n");
      out.write("ul{\r\n");
      out.write("\r\n");
      out.write("list-style:none\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("text-decoration:none;\r\n");
      out.write("color:#FFEBCD;\r\n");
      out.write("font-family:\"Times New Roman\", Georgia, Serif;\r\n");
      out.write("font-size:20px;\r\n");
      out.write("list-style:none;\r\n");
      out.write("}\r\n");
      out.write("li{\r\n");
      out.write("\r\n");
      out.write("border:1px #FFEBCD solid;\r\n");
      out.write("width:160px;\r\n");
      out.write("height:40px;\r\n");
      out.write("background-color:#4682b4;\r\n");
      out.write("text-align:center;\r\n");
      out.write("margin-right:1px;\r\n");
      out.write("line-height:40px;\r\n");
      out.write("float:left;\r\n");
      out.write("list-style:none;\r\n");
      out.write("}\r\n");
      out.write("li:hover{\r\n");
      out.write("background-color:#CD853F;\r\n");
      out.write("}\r\n");
      out.write("h1{\r\n");
      out.write("font-family:Times New Roman\", Georgia, Serif;\r\n");
      out.write("font-color:Green;\r\n");
      out.write("font-color:#FFEBCD;\r\n");
      out.write("text-align:center;\r\n");
      out.write("line-hight:100px;\r\n");
      out.write("margin:0px;\r\n");
      out.write("}\r\n");
      out.write("h2{\r\n");
      out.write("font-family:Times New Roman\", Georgia, Serif;\r\n");
      out.write("text-align:right;\r\n");
      out.write("font-color:#FFEBCD;\r\n");
      out.write("}\r\n");
      out.write("table{\r\n");
      out.write("font-family:Times New Roman\", Georgia, Serif;\r\n");
      out.write("font-size:20px;\r\n");
      out.write("font-color:#FFEBCD;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function validateForm() {\r\n");
      out.write("    var x = document.forms[\"myForm\"][\"fname\"].value;\r\n");
      out.write("    if (x == \"\") {\r\n");
      out.write("        alert(\"Name must be filled out\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function calc(){\r\n");
      out.write("  var n1=parseInt(document.getElementById('n1').value);\r\n");
      out.write("  var n2=parseInt(document.getElementById('n2').value);\r\n");
      out.write("   var n3=parseInt(document.getElementById('n3').value);\r\n");
      out.write("    var n4=parseInt(document.getElementById('n4').value);\r\n");
      out.write("\t var n5=parseInt(document.getElementById('n5').value);\r\n");
      out.write("\t  var n6=parseInt(document.getElementById('n6').value);\r\n");
      out.write("\t   var n7=parseInt(document.getElementById('n7').value);\r\n");
      out.write("  var oper=document.getElementById('operators').value;\r\n");
      out.write("  if(oper==='+'){\r\n");
      out.write("   document.getElementById('result').value=n1+n2+n3+n4+n5+n6+n7;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"C:\\Users\\gouthamgoud\\Desktop\\izeal_background/web_design_lg_b.jpg\">\r\n");
      out.write("\r\n");
      out.write("<h1>WEL COME TO IZEAL INC<h1><hr>\r\n");
      out.write("<h2>MANAGER: MR.VISHNU</h2><hr>\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a href=\"file:///C:/Users/gouthamgoud/Desktop/Izeal_inc.html\">Home</a></li>\r\n");
      out.write("<li><a href=\"http://www.izealinc.com/izealinc_solutions.html\">Solutions</a></li>\r\n");
      out.write("<li><a href=\"http://www.izealinc.com/izealinc_consulting_services.html\">Services</a></li>\r\n");
      out.write("<li><a href=\"http://www.izealinc.com/izealinc_careers.html\">Careers</a></li>\r\n");
      out.write("<li><a href=\"file:///C:/Users/gouthamgoud/Documents/timer_project.html\">Register</a></li>\r\n");
      out.write("<li><a href=\"file:///C:/Users/gouthamgoud/Desktop/Login.html\">Login</a></li>\r\n");
      out.write("<li><a href=\"http://www.izealinc.com/izealinc_contactus.html\">Contact Us</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<h1>Calculating work hours for MAY</h1><hr/><br/>\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a href=\"file:///C:/Users/gouthamgoud/Desktop/Calculating_Hours.html\">MAY'6TH</a></li>\r\n");
      out.write("<li><a href=\"file:///C:/Users/gouthamgoud/Desktop/Calculating_Hours.html\">MAY'13TH</a></li>\r\n");
      out.write("<li><a href=\"file:///C:/Users/gouthamgoud/Desktop/Calculating_Hours.html\">MAY'20TH</a></li>\r\n");
      out.write("<li><a href=\"file:///C:/Users/gouthamgoud/Desktop/Calculating_Hours.html\">MAY'27TH</a></li>\r\n");
      out.write("<li><a href=\"file:///C:/Users/gouthamgoud/Desktop/Calculating_Hours.html\">JUNE'3</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<br/>\r\n");
      out.write("<table align=\"center\" >\r\n");
      out.write("<form action=\"Hcal.jsp\">\r\n");
      out.write("Enter your Name:\r\n");
      out.write("<input type=\"text\" name=\"name\" ><br> \r\n");
      out.write("\r\n");
      out.write("<tr><th>Work Day of Week</th><th>Hours</th></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Monday</td><td> \r\n");
      out.write("<input type=\"text\" id=\"n1\" name=\"monday\" size=\"3\" maxlength=\"4\" value=\"\" > \r\n");
      out.write("</td></tr> <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr><td>Tuesday</td> \r\n");
      out.write("<td><input type=\"text\" id=\"n2\" name=\"tuesday\" size=\"3\" maxlength=\"4\" value=\"\" > \r\n");
      out.write("</td></tr> <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr><td>Wednesday</td> \r\n");
      out.write("<td><input type=\"text\" id=\"n3\" name=\"wednesday\" size=\"3\" maxlength=\"4\" value=\"\" > \r\n");
      out.write("</td></tr> <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr><td>Thursday</td> \r\n");
      out.write("<td><input type=\"text\" id=\"n4\" name=\"thursday\" size=\"3\" maxlength=\"4\" value=\"\" > \r\n");
      out.write("</td></tr> <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr><td>Friday</td> \r\n");
      out.write("<td><input type=\"text\" id=\"n5\" name=\"friday\" size=\"3\" maxlength=\"4\" value=\"\"> \r\n");
      out.write("</td></tr> <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr><td>Saturday</td> \r\n");
      out.write("<td><input type=\"text\" id=\"n6\" name=\"saturday\" size=\"3\" maxlength=\"4\" value=\"\" > \r\n");
      out.write("</td></tr> <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr><td>Sunday</td> \r\n");
      out.write("<td><input type=\"text\" id=\"n7\" name=\"sunday\" size=\"3\" maxlength=\"4\" value=\"\" > \r\n");
      out.write("</td></tr><br/> \r\n");
      out.write("<tr><td>\r\n");
      out.write("<select id=\"operators\" align=\"center\">\r\n");
      out.write("<option value=\"+\">+</option>\r\n");
      out.write("</select>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("<button onclick=\"calc();\">Total Hours</button>\r\n");
      out.write("<input type=\"text\" name=\"total\" id=\"result\"/><br/><br/>\r\n");
      out.write("<input type=\"submit\" value=\"Submit\">\r\n");
      out.write(" </td></tr>\r\n");
      out.write(" </form>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
