package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head><tittle> java class registeration</tittle>\r\n");
      out.write("<style>\r\n");
      out.write("*\r\n");
      out.write("{\r\n");
      out.write("margin:0px;\r\n");
      out.write("}\r\n");
      out.write("ul{\r\n");
      out.write("\r\n");
      out.write("list-style:none\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("text-decoration:none;\r\n");
      out.write("color:white;\r\n");
      out.write("}\r\n");
      out.write("li{\r\n");
      out.write("//border:1px red solid;\r\n");
      out.write("width:160px;\r\n");
      out.write("height:40px;\r\n");
      out.write("background-color:red;\r\n");
      out.write("text-align:center;\r\n");
      out.write("margin-right:1px;\r\n");
      out.write("line-height:40px;\r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write("li:hover{\r\n");
      out.write("background-color:yellow;\r\n");
      out.write("cursor:pointer;\r\n");
      out.write("}\r\n");
      out.write("h1{\r\n");
      out.write("font-family:Arial;\r\n");
      out.write("font-color:Green;\r\n");
      out.write("background-color:yellow;\r\n");
      out.write("text-align:center;\r\n");
      out.write("line-hight:100px;\r\n");
      out.write("margin:0px;\r\n");
      out.write("}\r\n");
      out.write("h2{\r\n");
      out.write("font-family:Arial;\r\n");
      out.write("font-color:red;\r\n");
      out.write("background-color:green;\r\n");
      out.write("text-align:right;\r\n");
      out.write("}\r\n");
      out.write("table\r\n");
      out.write("{\r\n");
      out.write("font-family:Arial;\r\n");
      out.write("text-align:center;\r\n");
      out.write("background-color:pink;\r\n");
      out.write("line-hieght:100px;\r\n");
      out.write("font-color:green;\r\n");
      out.write("table-align:center;\r\n");
      out.write("}\r\n");
      out.write("form{\r\n");
      out.write("text-align:center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>WELCOME TO GOUTHAM'S PAGE</h1><hr>\r\n");
      out.write("<h2>INSTRUCTER MR.VENKAT</h2><hr>\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a href=\"#\">HOME</a></li>\r\n");
      out.write("<li><a href=\"#\">CLASS TIMES</a></li>\r\n");
      out.write("<li><a href=\"#\">CONTACT</a></li>\r\n");
      out.write("<li><a href=\"#\">TECHNOLOGIES</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</body>\r\n");
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
