<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="myHello.jsp" %>

<c:forEach var="i" begin="0" end="5">
Item: <c:out value="${i}"/>
</c:forEach>

<br>

<%--directive --%>
<%
Date dat=new Date();
%>
Today is:
<%
out.println(dat);
%><br>
<%=dat%>

<br>
<!-- Declaration1 -->
<%--declaration --%>
<%!

int i=0;
int getInt(){
	return i+10;
}

%>
<%
out.println(getInt());
%>
<%--Scriptlet --%>
<%
int i=0;
%>
page count is:
<%
out.println(i++);
%>

<%--expression --%>
<%=(2-1)*8 %>
<%
int j=2;
%>
page number is:
<%=++j %>
</body>
</html>