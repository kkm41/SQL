<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>092_JSPServletEx.jsp</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String gender = request.getParameter("gender");
String content = request.getParameter("content");
String [] itemName = request.getParameterValues("item");
String job = (String)request.getParameter("job");

%>
<h2>
아이디 : <%=id %><br/>
암호 : <%=pwd %><br/>
성별 : <%=gender %><br/>
하고싶은말 : <%=content %><br/>
구입한 상품 : 
<%
	for(String item : itemName)
		out.print(item + " ");
%><br/>
직업 : <%=job %><br/>

</h2>

</body>
</html>