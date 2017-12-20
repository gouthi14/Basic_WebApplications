package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Employee Hours</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("*\r\n");
      out.write("body {\r\n");
      out.write(" height: 100%; \r\n");
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
      out.write("font-family:\"Times New Roman\", Georgia, Serif;\r\n");
      out.write("color:#008080;\r\n");
      out.write("\r\n");
      out.write("text-align:center;\r\n");
      out.write("line-hight:100px;\r\n");
      out.write("margin:0px;\r\n");
      out.write("}\r\n");
      out.write("h2{\r\n");
      out.write("font-family:\"Times New Roman\", Georgia, Serif;\r\n");
      out.write("text-align:right;\r\n");
      out.write("color: \t#008080;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"C:\\Users\\gouthamgoud\\Desktop\\izeal_background\\f5c6819827ad701e67b01e058effd28e.jpg\">\r\n");
      out.write("\r\n");
      out.write("<h1>WELCOME TO IZEAL INC<h1><hr>\r\n");
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
      out.write("<br/> <br/>\r\n");
      out.write("\r\n");
      out.write("<form action=\"Log.jsp\">\r\n");
      out.write("<table align=\"center\" > \r\n");
      out.write("<tr><td>LASTNAME</td><td> \r\n");
      out.write("<input type=\"text\" name=\"lname\"> \r\n");
      out.write("</td></tr> <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr><td>PASSWORD</td> \r\n");
      out.write("<td><input type=\"password\" name=\"pass\"> \r\n");
      out.write("</td></tr> <br/><br/><br/>\r\n");
      out.write(" <tr><td><input type=\"submit\" value=\"Login\"/></td></tr>\r\n");
      out.write(" </table>\r\n");
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
