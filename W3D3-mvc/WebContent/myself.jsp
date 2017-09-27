<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Cookie1-requestgetparam:<%=request.getParameter("errormsg")%><br>
Cookie2-only cookie: ${errormsg}<br>
Cookie3-request:${requestScope.errormsg}<br>
Cookie4-session:${sessionScope.errormsg}<br>
Cookie5-application:${applicationScope.errormsg}<br>
<form action="login" method=post>
user name:<input type=text name="username"><br>
password:<input type=text name="password"><br>
<button type=submit name="submit">Login</button>
</form>
<%--Read cookie --%>
<%
Cookie[] cookies=request.getCookies();
Cookie cookie=null;
for(int i=0;i<cookies.length;i++){
	cookie=cookies[i];
	out.println(cookie.getName());
	out.println("<br>");
	out.println(cookie.getValue());
}
%>
</body>
</html>