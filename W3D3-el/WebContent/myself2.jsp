<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
name:${param.name}<br>
password:${param.passowrd} <br>
name:${sessionScope.name1}; <br>
password:${pageScope.password1}<br>
requestattr:${requestScope.reqeustattr}
requestattr2:${request.getAttribute("reqeustattr")}

</body>
</html>