/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-03-06 01:20:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clothDownList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\">\r\n");
      out.write("\r\n");
      out.write("<title>UYK</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/staticfile/css/bootstrap.min.css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"Stylesheet\" href=\"/staticfile/static/css/clothDownCss/imageflow.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/staticfile/js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/staticfile/static/js/clothDownJs/imageflow.js\"></script>\r\n");
      out.write("<script src=\"/staticfile/js/jquery-3.1.1.js\"></script>\r\n");
      out.write("<script src=\"/staticfile/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: url('/staticfile/images/welcome.jpg');\r\n");
      out.write("\tbackground-size:100% 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav1 {\r\n");
      out.write("/* \tbackground-color: #ff6; */\r\n");
      out.write("background-color: rgb(242,224,210);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#leftDiv {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: 1000px;\r\n");
      out.write("/* \tbackground-color: #ff4; */\r\n");
      out.write("\tpadding-top: 50px;\r\n");
      out.write("\tpadding-left:60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#clothup, #clothdown, #shoes, #bag, #shiping {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("/* \tbackground-color: #f00; */\r\n");
      out.write("\tmargin: 50px auto;\r\n");
      out.write("\tline-height: 100px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#img1:hover {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("} \r\n");
      out.write("#img2:hover {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("} \r\n");
      out.write("#img3:hover {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("} \r\n");
      out.write("#img4:hover {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("} \r\n");
      out.write("#img5:hover {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("#titleDiv {\r\n");
      out.write("/* \tbackground-color: #ff3; */\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\tmargin: 10px auto;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 700px;\r\n");
      out.write("\ttop: 51px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#titlep {\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\tline-height: 100px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 1.6em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#show {\r\n");
      out.write("/* \tbackground-color: #ff3; */\r\n");
      out.write("\twidth: 1500px;\r\n");
      out.write("\theight: 800px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 250px;\r\n");
      out.write("\ttop: 251px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav id=\"nav1\" class=\"navbar navbar-default navbar-fixed-top\"\r\n");
      out.write("\t\trole=\"navigation\">\r\n");
      out.write("\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"togarde.action\">导航页面 &nbsp;||</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle \"\r\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\"> 季节 <b class=\"caret\"></b>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"clothTag?category=up&season=springAutumn&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothUpList\">春秋</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"clothTag?category=up&season=summer&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothUpList\">夏</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"clothTag?category=up&&season=winter&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothUpList\">冬</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\"> 风格 <b class=\"caret\"></b>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"clothTag?category=up&style=sport&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothUpList\">运动</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"clothTag?category=up&style=relax&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothUpList\">休闲</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"clothTag?category=up&style=work&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothUpList\">正式</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"toCreate\">添加单品</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div id=\"leftDiv\">\r\n");
      out.write("\t\t<div id=\"clothup\">\r\n");
      out.write("\t\t\t<a href=\"clothTag?category=up&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothUpList\"> <img id=\"img1\"\r\n");
      out.write("\t\t\t\tsrc=\"/staticfile/images/up.jpg\" width=\"80px\"\r\n");
      out.write("\t\t\t\theight=\"80px\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"shiping\">\r\n");
      out.write("\t\t\t<a href=\"clothTag?category=shipin&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothShipinList\"> <img id=\"img2\"\r\n");
      out.write("\t\t\t\tsrc=\"/staticfile/images/shipin.jpg\" width=\"80px\"\r\n");
      out.write("\t\t\t\theight=\"80px\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"bag\">\r\n");
      out.write("\t\t\t<a href=\"clothTag?category=bag&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothBagList\"> <img id=\"img3\"\r\n");
      out.write("\t\t\t\tsrc=\"/staticfile/images/bag.jpg\" width=\"80px\"\r\n");
      out.write("\t\t\t\theight=\"80px\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"shoes\">\r\n");
      out.write("\t\t\t<a href=\"clothTag?category=shoes&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothShoesList\"> <img id=\"img4\"\r\n");
      out.write("\t\t\t\tsrc=\"/staticfile/images/shoes.jpg\" width=\"80px\"\r\n");
      out.write("\t\t\t\theight=\"80px\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"clothdown\">\r\n");
      out.write("\t\t\t<a href=\"clothTag?category=down&userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&jsp=clothDownList\"> <img id=\"img5\"\r\n");
      out.write("\t\t\t\tsrc=\"/staticfile/images/down.jpg\" width=\"80px\"\r\n");
      out.write("\t\t\t\theight=\"80px\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"titleDiv\">\r\n");
      out.write("\t\t<p id=\"titlep\"></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"show\">\r\n");
      out.write("\t\t<div id=\"LoopDiv\">\r\n");
      out.write("    <input id=\"S_Num\" type=\"hidden\" value=\"8\" />\r\n");
      out.write("    <div id=\"starsIF\" class=\"imageflow\"> \r\n");
      out.write("    \t<!-- 下衣遍历展示 -->\r\n");
      out.write("\t    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!--效果html结束-->\r\n");
      out.write("  <div class=\"clear\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/clothDownList.jsp(176,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/clothDownList.jsp(176,5) '${clothList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${clothList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/pages/clothDownList.jsp(176,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("cloth");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<img src=\"http://");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cloth.url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" longdesc=\"clothInfo.action?clothId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cloth.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" width=\"550\" height=\"500\" alt=\"Picture\" />\r\n");
          out.write("\t    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}