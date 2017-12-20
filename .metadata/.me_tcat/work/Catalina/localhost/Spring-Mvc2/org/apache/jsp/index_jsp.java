package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head><tittle>IZEAL INC</tittle>\r\n");
      out.write("<style>\r\n");
      out.write("header, slider figure img, slider, body, ul, h1, h2, h3,p {\r\n");
      out.write("    display: block; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes slider{\r\n");
      out.write("0%{\r\n");
      out.write("left:0%;\r\n");
      out.write("}\r\n");
      out.write("10%{\r\n");
      out.write("left:0%;\r\n");
      out.write("}\r\n");
      out.write("12%{\r\n");
      out.write("left:-100%;\r\n");
      out.write("}\r\n");
      out.write("22%{\r\n");
      out.write("left:-100%;\r\n");
      out.write("}\r\n");
      out.write("24%{\r\n");
      out.write("left:-200%;\r\n");
      out.write("}\r\n");
      out.write("34%{\r\n");
      out.write("left:-200%;\r\n");
      out.write("}\r\n");
      out.write("36%{\r\n");
      out.write("left:-300%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("46%{\r\n");
      out.write("left:-300%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("48%{\r\n");
      out.write("left:-400%;\r\n");
      out.write("}\r\n");
      out.write("58%{\r\n");
      out.write("left:-400%;\r\n");
      out.write("}\r\n");
      out.write("60%{\r\n");
      out.write("left:-300%;\r\n");
      out.write("}\r\n");
      out.write("70%{\r\n");
      out.write("left:-300%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("72%{\r\n");
      out.write("left:-200%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("82%{\r\n");
      out.write("left:-200%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("84%{\r\n");
      out.write("left:-100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("94%{\r\n");
      out.write("left:-100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("96%{\r\n");
      out.write("left:0%;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#slider{\r\n");
      out.write("overflow:hidden;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#slider figure img{\r\n");
      out.write("width:20%;\r\n");
      out.write("float=left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#slider figure{\r\n");
      out.write(" position: relative;\r\n");
      out.write("    width: 500%;\r\n");
      out.write("    height: 150%;\r\n");
      out.write("    top: 0px;\r\n");
      out.write("    left: 0px;\r\n");
      out.write("    z-index: 0; \r\n");
      out.write("\t\r\n");
      out.write("\tfont-size:0;\r\n");
      out.write("animation:slider 20s infinite;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("*\r\n");
      out.write("body {\r\n");
      out.write("    background-color: lightblue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//margin:0px;\r\n");
      out.write("\r\n");
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
      out.write("background-color:#4682b4;\r\n");
      out.write("text-align:center;\r\n");
      out.write("margin-right:1px;\r\n");
      out.write("line-height:40px;\r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write("li:hover{\r\n");
      out.write("background-color:#CD853F;\r\n");
      out.write("cursor:pointer;\r\n");
      out.write("}\r\n");
      out.write("h1{\r\n");
      out.write("font-family:Arial;\r\n");
      out.write("font-color:Green;\r\n");
      out.write("background-color:#AFEEEE;\r\n");
      out.write("text-align:center;\r\n");
      out.write("line-hight:100px;\r\n");
      out.write("margin:0px;\r\n");
      out.write("}\r\n");
      out.write("h2{\r\n");
      out.write("font-family:Arial;\r\n");
      out.write("font-color:Gold;\r\n");
      out.write("background-color:#808080;\r\n");
      out.write("text-align:right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p{\r\n");
      out.write("font-size: 18px;\r\n");
      out.write("font-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h3{\r\n");
      out.write("font-family:Arial;\r\n");
      out.write("font-color:Gold;\r\n");
      out.write("background-color:#808080;\r\n");
      out.write("text-align:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>WEL COME TO IZEAL INC<h1><hr>\r\n");
      out.write("<h2>MANAGER: MR.VISHNU</h2><hr>\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a href=\"file:///F:/Desktop/Izeal_home.html\">Home</a></li>\r\n");
      out.write("<li><a href=\"http://www.izealinc.com/izealinc_solutions.html\">Solutions</a></li>\r\n");
      out.write("<li><a href=\"http://www.izealinc.com/izealinc_consulting_services.html\">Services</a></li>\r\n");
      out.write("<li><a href=\"http://www.izealinc.com/izealinc_careers.html\">Careers</a></li>\r\n");
      out.write("<li><a href=\"timer_project.jsp\">Register</a></li>\r\n");
      out.write("<li><a href=\"#\">Login</a></li>\r\n");
      out.write("<li><a href=\"http://www.izealinc.com/izealinc_contactus.html\">Contact Us</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<div id=\"slider\">\r\n");
      out.write("<figure>\r\n");
      out.write("<img src=\"C:\\Users\\gouthamgoud\\Desktop\\izeal_background/640C58C0-0C6F-4E45-8695-F76E3CC3FA57.JPG\"/>\r\n");
      out.write("<img src=\"C:\\Users\\gouthamgoud\\Desktop\\izeal_background/0CE786F0-7015-492F-815D-4FE438768985.JPG\"/>\r\n");
      out.write("<img src=\"C:\\Users\\gouthamgoud\\Desktop\\izeal_background/67AAFB5D-C231-4E01-BB0F-83BA73FDBDC8.JPG\"/>\r\n");
      out.write("<img src=\"C:\\Users\\gouthamgoud\\Desktop\\izeal_background/1.jpg\"/>\r\n");
      out.write("<img src=\"C:\\Users\\gouthamgoud\\Desktop\\izeal_background/background_city2.jpg\"/>\r\n");
      out.write("</figure>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>iZeal Inc Overview</h3><br><br>\r\n");
      out.write("\r\n");
      out.write("<p>IZeal Inc., is a recognized premier provider of strategic staffing and software solutions across USA and India.\r\n");
      out.write("The team at iZeal, Inc., has specialty staffing experience to offer our partners both clients and consultants.\r\n");
      out.write("At iZeal, we have an energetic team of professionals, who constantly strive to exceed the expectations of clients and customers.\r\n");
      out.write("Our logo says it all - we deliver the BEST. Be it resources or solutions, we go hand-in-hand with the cutting edge technologies.\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<p>iZeal, Inc., is also a provider of Internet Outsourcing Solutions.\r\n");
      out.write("We offer qualified IT professionals from that will work for our clients via Internet from their home countries instantly without complicated immigration procedures.\r\n");
      out.write("Webmasters, web developers, web designers, software developers, Business Analysts, QA Testers, graphic designers, etc.<p>\r\n");
      out.write("\r\n");
      out.write("<p>With proven methodologies, exceptional project management, solid performance metrics, and our cutting-edge development center, \r\n");
      out.write("iZeal's Technology Solution Team provides end-to-end web development services that can be tailored to meet your unique business needs.</p>\r\n");
      out.write("\r\n");
      out.write("<p>We are proud of our state-of-the-art development center-secure facilities that can be custom-configured to any client's unique technical environment.\r\n");
      out.write("Our expertise in development and delivery gives you freedom from project staffing issues, internal space constraints, equipment purchases, and more. \r\n");
      out.write("You can focus on your core business while we focus on delivering innovative solutions to your web development needs.</p>\r\n");
      out.write(" \r\n");
      out.write("<p> With its team of staffing professionals, technology thought leaders, certified usability analysts, \r\n");
      out.write(" interface designers, and system architects, providing services that focus on user adoption\r\n");
      out.write(" technology solutions, and business results, iZeal, Inc has become one of the fastest growing solutions provider in the United States.\r\n");
      out.write(" </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
