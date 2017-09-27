<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Beer</title>
</head>
<body>
	<p>Beer Selection Advice</p>
	<c:forEach var="item" items="${styles}" >
		<br>try:${item}
    </c:forEach>
</body>
</html>
