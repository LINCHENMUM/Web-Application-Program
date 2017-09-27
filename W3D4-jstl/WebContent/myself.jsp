<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String[][] day={{"Now","1","1"},{"Oct","10","1"},{"Dec","12","1"}};
request.setAttribute("Calendar", day);
%>
<table>
<tr>
<td>Month</td>
<td>A</td>
<td>B</td>
</tr>

<c:forEach items="${Calendar}" var ="daily" varStatus="st">
<tr>
<td>${daily[0]}</td>
<td>${daily[1]}</td>
<td>${daily[2]}</td>
</tr>
 </c:forEach>
 
</table>
<table border=1>
<tr>
<td>id</td>
<td>name</td>
<td>role</td>
</tr>
<c:forEach items="${emplist}" var="emp" varStatus="st">
<tr>
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.role}</td>
</tr>
</c:forEach>
<c:forEach items="${requestScope.emplist}" var="emp">
<tr>
<td><c:out value="${emp.id}"></c:out></td>
<td><c:out value="${emp.name}"></c:out></td>
<td><c:out value="${emp.role}"></c:out></td>
</tr>
</c:forEach>

</table>
<BR>
My message from servlet:${requestScope.message}
<BR>
<c:if test="${requestScope.message ne null }">
<c:out value="${requestScope.message}" escapeXml="true"></c:out>
</c:if>

<br>
<a href="${requestScope.url}">MUM</a>
<br>
<a href="<c:url value="${requestScope.url}"></c:url>">MUM2</a>

<hr>
<c:set var="id" value="5" scope="request"></c:set>
<c:out value="${requestScope.id}"></c:out>
<c:catch var="exception">
<%
int x=5/0;
%>
</c:catch>

<c:if test="${exception ne null }">
<p>
Exception is:${exception }<br>
Exception message is:
${exception.message }
</p>
</c:if>

</body>
</html>