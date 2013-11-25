package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hello_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/views/header.jsp");
    _jspx_dependants.add("/views/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t<div class=\"navbar navbar-fixed-top navbar-default\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\tdata-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\">\t</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span> \r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand col-sm-offset-3\"\r\n");
      out.write("\t\t\t\t\thref=\"http://www.hp.com/country/us/en/hho/welcome.html\"><img\r\n");
      out.write("\t\t\t\t\tsrc=\"images/hp/hp-logo.gif\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"hello.htm\"><h4>Home</h4></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><h4>Catalog</h4></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><h4>Contact US</h4></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><h4>About US</h4></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div style=\"float:right\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" align=\"right\" class=\"span4\" placeholder=\"Search at HP...\" />\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary\">Search</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head><title>");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</title></head>\r\n");
      out.write("  <body>\r\n");
      out.write("  </br></br></br></br>\r\n");
      out.write("  \r\n");
      out.write("  <div style=\"float:right\">\r\n");
      out.write("  <ul class=\"nav nav-pills\">\r\n");
      out.write("  <li><button class=\"btn btn-default\"><a href=\"login.htm\">Log In</a></button></li>\r\n");
      out.write("  <li><button class=\"btn btn-default\" ><a href=\"signUp.htm\">Sign Up</a></button></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"container well\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"col-md-4\">\r\n");
      out.write("  <h2>Shop HP for Home</h2>\r\n");
      out.write("  <p>Laptops</br>Tablets</br>Desktops</br>All-in-One PCs</br>Printers</br>Ink, Toner & Paper</br>HP + Beats Audio</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"col-md-8\">\r\n");
      out.write("  <h2></h2>\r\n");
      out.write("  <p><img src=\"images/hp/HP-Home.jpg\"></p>\r\n");
      out.write("  </div>\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"col-md-4\">\r\n");
      out.write("  <div class=\"thumbnail\">\r\n");
      out.write("  <img alt=\"home1\" src=\"images/hp/HP-Home1.jpg\">\r\n");
      out.write("  <div class=\"caption\">\r\n");
      out.write("  <h2>This is Crazy</h2>\r\n");
      out.write("  <p>\r\n");
      out.write("  Shop HP for printers</br>\r\n");
      out.write("  Starting at just $29.99\r\n");
      out.write("  </p>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"col-md-4\">\r\n");
      out.write("  <div class=\"thumbnail\">\r\n");
      out.write("  <img alt=\"home1\" src=\"images/hp/HP-Home2.jpg\">\r\n");
      out.write("  <div class=\"caption\">\r\n");
      out.write("  <h2>Mix it UP</h2>\r\n");
      out.write("  <p>\r\n");
      out.write("  The notebook you need </br>\r\n");
      out.write("  becomes the tablet you want.\r\n");
      out.write("  </p>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("   <div class=\"col-md-4\">\r\n");
      out.write("  <div class=\"thumbnail\">\r\n");
      out.write("  <img alt=\"home1\" src=\"images/hp/HP-Home3.jpg\">\r\n");
      out.write("  <div class=\"caption\">\r\n");
      out.write("  <h2>Let's play</h2>\r\n");
      out.write("  <p>\r\n");
      out.write("  The ENVY Phoenix 810 and Windows 8.1 deliver </br>\r\n");
      out.write("  The power and prowess to dominate.\r\n");
      out.write("  </p>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("    <br>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"font-awesome/css/font-awesome.css\" />\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container well\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-3\">\r\n");
      out.write("<h3>&nbsp;&nbsp;&nbsp;&nbsp;About HP</h3>\r\n");
      out.write("<p>\r\n");
      out.write("<ul>\r\n");
      out.write("<li>Investor relations</li>\r\n");
      out.write("<li>Global citizenship</li>\r\n");
      out.write("<li>Events</li>\r\n");
      out.write("<li>HP Labs</li>\r\n");
      out.write("<li>Jobs</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-3\">\r\n");
      out.write("<h3>&nbsp;&nbsp;&nbsp;&nbsp;Social Media</h3>\r\n");
      out.write("<p>\r\n");
      out.write("<ul>\r\n");
      out.write("<li>Consumer Support forum</li>\r\n");
      out.write("<li>Enterprise Business community</li>\r\n");
      out.write("<li>Corporate blogs</li>\r\n");
      out.write("<li>\r\n");
      out.write("<a href=\"http://www.linkedin.com/company/hewlett-packard\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("<a href=\"http://www.facebook.com/HP\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("<i class=\"fa fa-google-plus\"></i>\r\n");
      out.write("<i class=\"fa fa-apple\"></i>\r\n");
      out.write("<a href=\"http://www.youtube.com/HP\"><i class=\"fa fa-youtube\"></i></a>\r\n");
      out.write("<a href=\"https://www.facebook.com/jakatesaurabh?fref=ts\"><i class=\"fa fa-skype\"></i></a>\r\n");
      out.write("</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-3\">\r\n");
      out.write("<h3>&nbsp;&nbsp;&nbsp;HP Partners</h3> \r\n");
      out.write("<p>\r\n");
      out.write("<ul>\r\n");
      out.write("<li>Become a partner</li>\r\n");
      out.write("<li>Find a reseller</li>\r\n");
      out.write("<li>PartnerOne</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-3\">\r\n");
      out.write("<h3>Customer Support</h3> \r\n");
      out.write("<p>\r\n");
      out.write("<ul>\r\n");
      out.write("<li>Download drivers</li>\r\n");
      out.write("<li>Authorized service providers</li>\r\n");
      out.write("<li>Training & Certification</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent(null);
    // /views/hello.jsp(5,15) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("title");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }
}
