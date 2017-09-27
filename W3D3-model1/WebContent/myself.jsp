<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
TimeZone timezone=TimeZone.getDefault();
Calendar myCalendar=Calendar.getInstance(timezone,Locale.UK);
%>
My current time is:
<%=myCalendar.get(Calendar.HOUR_OF_DAY)%>:
<%=myCalendar.get(Calendar.MINUTE)%>:
<%=myCalendar.get(Calendar.SECOND)%>
</body>
</html>