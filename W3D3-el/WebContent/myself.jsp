<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${1<2} 
${1+2} 
<form action="myself2.jsp" method=post>
name:<input name="name" type=text><br>
password:<input type=text name="passowrd">

<button type=submit>Submit</button>
<%
application.setAttribute("name","Lin Chen");
application.setAttribute("passowrd","123");
session.setAttribute("name1", "session");
pageContext.setAttribute("password1","pageContext");
request.setAttribute("requestattr", "requestattr");
pageContext.setAttribute("pagec", "pagecontext");
request.setAttribute("reqeustattr", "requestAttrnew");
%>
<br>
<a href="myself2.jsp">Click</a><br>

PageContext:${pagec}
</form>
</body>
</html>