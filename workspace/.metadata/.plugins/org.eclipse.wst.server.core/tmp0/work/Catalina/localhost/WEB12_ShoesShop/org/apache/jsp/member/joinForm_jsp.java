/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.23
 * Generated at: 2024-05-20 08:18:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class joinForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/C:/Users/hi/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/WEB12_ShoesShop/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602841572000L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1715303525000L));
    _jspx_dependants.put("jar:file:/C:/Users/hi/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/WEB12_ShoesShop/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/fmt.tld", Long.valueOf(1602841572000L));
    _jspx_dependants.put("/member/../header.jsp", Long.valueOf(1716186163438L));
    _jspx_dependants.put("/member/sub_image_menu.jsp", Long.valueOf(1716176756777L));
    _jspx_dependants.put("/member/../footer.jsp", Long.valueOf(1716167384580L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/header_footer.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/section.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"script/member.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("	<header>\r\n");
      out.write("		<nav id=\"top_menu\">\r\n");
      out.write("			<div id=\"logo\"><img src=\"images/logo.png\" width=\"180\" height=\"100\"></div>\r\n");
      out.write("				\r\n");
      out.write("			<div class=\"gnb\">\r\n");
      out.write("			");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				<a href=\"\">CART</a>\r\n");
      out.write("				<a href=\"\">MY PAGE</a>\r\n");
      out.write("				<a href=\"\">고객센터</a>\r\n");
      out.write("			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"hmenu\"><div></div>	<div></div><div></div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<nav id=\"category_menu\">\r\n");
      out.write("				<a href=\"\">Heels</a>\r\n");
      out.write("				<a href=\"\">Boots</a>\r\n");
      out.write("				<a href=\"\">Sandal</a>\r\n");
      out.write("				<a href=\"\">Sneakers</a>\r\n");
      out.write("				<a href=\"\">Sleeper</a>\r\n");
      out.write("		</nav>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<div class=\"sub_img\">\r\n");
      out.write("	<img src=\"images/member/sub_img.jpg\"/>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"sub_page\"> <!-- nav 와 article 의 부모 시작-->\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("<!-- nav 와 article 의 부모 시작 -->\r\n");
      out.write("\r\n");
      out.write("		<nav class=\"sub_menu\">\r\n");
      out.write("			");
      if (_jspx_meth_c_005fchoose_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		</nav>");
      out.write("\r\n");
      out.write("	<article>\r\n");
      out.write("		<form action=\"shop.do?command=join\" method=\"post\" name=\"joinForm\">\r\n");
      out.write("			<h2>Join Us</h2>\r\n");
      out.write("			<h3>Basic Info</h3>\r\n");
      out.write("			<div class=\"field\">\r\n");
      out.write("				<label>User ID</label>\r\n");
      out.write("				<div>\r\n");
      out.write("					<input type=\"text\" name=\"userid\" size=\"12\">\r\n");
      out.write("					<input type=\"hidden\" name=\"reid\">\r\n");
      out.write("					<input type=\"button\" value=\"중복 체크\" onClick=\"idcheck()\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"field\">\r\n");
      out.write("				<label>Password</label><input type=\"password\" name=\"pwd\"></div>\r\n");
      out.write("			<div class=\"field\">	\r\n");
      out.write("				<label>Retype Password</label><input type=\"password\" name=\"pwdCheck\"></div>\r\n");
      out.write("			<div class=\"field\"><label>Name</label><input type=\"text\" name=\"name\"></div>\r\n");
      out.write("			<div class=\"field\"><label>Phone</label><input type=\"text\" name=\"phone\"></div>\r\n");
      out.write("			<div class=\"field\"><label>E-Mail</label><input type=\"text\" name=\"email\"></div>\r\n");
      out.write("			\r\n");
      out.write("			<h3>Optional Info</h3>\r\n");
      out.write("			<div class=\"field\">\r\n");
      out.write("				<label>Zip Code</label>\r\n");
      out.write("				<div>\r\n");
      out.write("					<input type=\"text\" name=\"zip_num\" readonly>\r\n");
      out.write("					<input type=\"button\" value=\"우편번호 찾기\" onClick=\"post_zip()\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"field\">\r\n");
      out.write("				<label>Address</label><input type=\"text\" size=\"50\" name=\"address1\" readonly/>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"field\">\r\n");
      out.write("				<label>detail Address</label><input type=\"text\" size=\"50\" name=\"address2\"/>\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("			<div class=\"btn\">\r\n");
      out.write("				<input type=\"button\" value=\"회원가입\" onClick=\"go_save()\">\r\n");
      out.write("				<input type=\"button\" value=\"메인으로\" onClick=\"location.href='shop.do?command=index'\">\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		</form>\r\n");
      out.write("	\r\n");
      out.write("	</article>\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"clear\"></div>\r\n");
      out.write("	<footer>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<div id=\"copy\">All contents Copyright 2021 HJKang.co Inc. all rights reserved<br>\r\n");
      out.write("   Contact mail: abc@abc.com Tel: +82 02 1234 1234 Fax: +82 02 1233 1233 &nbsp;\r\n");
      out.write("	</footer>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("				");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /member/../header.jsp(27,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginUser}", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<a href=\"shop.do?command=loginForm\">LOGIN</a>\r\n");
          out.write("					<a href=\"shop.do?command=contract\">JOIN</a>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.name}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.userid}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(")</a>\r\n");
          out.write("					<a href=\"shop.do?command=logout\">LOGOUT</a>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f1_reused = false;
    try {
      _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f1.setParent(null);
      int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
      if (_jspx_eval_c_005fchoose_005f1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("				");
          if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      _jspx_th_c_005fchoose_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
      // /member/sub_image_menu.jsp(13,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginUser}", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<div><a href=\"\">LOGIN</a></div>\r\n");
          out.write("					<div><a href=\"\">JOIN</a></div>\r\n");
          out.write("					<div><a href=\"\" onClick=\"\">Find Id/Pw</a></div>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f1_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f1.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
      int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<div><a href=\"\">update MEMBER</a></div>\r\n");
          out.write("					<div><a href=\"\">LOGOUT</a></div>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      _jspx_th_c_005fotherwise_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f1_reused);
    }
    return false;
  }
}
