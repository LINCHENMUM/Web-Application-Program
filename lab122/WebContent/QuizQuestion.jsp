<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.wap.Quiz" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lab 12 Quiz</title>
</head>
<%
Quiz quiz=(Quiz)session.getAttribute("quiz");
String age=(String)session.getAttribute("age");
String exception=(String)session.getAttribute("exception");
String answer=(String)session.getAttribute("answer");
%>
<body>

</body>
</html>