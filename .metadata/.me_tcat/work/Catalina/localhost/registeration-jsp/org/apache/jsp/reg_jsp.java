package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'reg.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\th1\r\n");
      out.write("\t{\r\n");
      out.write("\tmargin:0px;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\tfont-color:Red;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tline-height:50px;\r\n");
      out.write("\tbackground-color:red;\r\n");
      out.write("\t}\r\n");
      out.write("\tform\r\n");
      out.write("\t{\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tbackground-color:pink;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  <h1>WELCOME TO GOUTHAM'S PAGE</h1><hr/>\r\n");
      out.write("    <h1>PLEASE REGISTER FOR LOGIN</h1><hr/><br>\r\n");
      out.write("    <pre>\r\n");
      out.write("    <form action=\"register.jsp\" method=\"post\">\r\n");
      out.write("    FIRSTNAME:\r\n");
      out.write("    <input type=\"text\" name=\"fname\"/><br/>\r\n");
      out.write("    LASTNAME:\r\n");
      out.write("    <input type=\"text\" name=\"lname\"/><br/>\r\n");
      out.write("    EMAIL:\r\n");
      out.write("    <input type=\"text\" name=\"mail\"/><br/>\r\n");
      out.write("    USERNAME:\r\n");
      out.write("    <input type=\"text\" name=\"uname\"/><br/>\r\n");
      out.write("    PASSWORD:\r\n");
      out.write("    <input type=\"password\" name=\"pass\"/><br/>\r\n");
      out.write("    <input type=\"submit\" value=\"REGISTER\"/>\r\n");
      out.write("    \r\n");
      out.write("    </form>\r\n");
      out.write("    </pre>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
