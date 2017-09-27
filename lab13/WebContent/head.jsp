<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='mytag' uri='/WEB-INF/tlds/tlddemo.tld'%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSTL and Custom Tags Lecture</title>
    </head>
    <body>  
    <mytag:Head strColor='blue' strWords='Hello Words'/>
    <mytag:Label strForeColor='red' strText='Hello'/>
</body>
</html>
