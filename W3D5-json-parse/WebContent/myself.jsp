<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"
	type="text/javascript"></script>
</head>
<body>
<h2>My first JSON exercise</h2>
<script type="text/javascript">
var jsonString='{"student":{"name":"LinChen","weight":"50KG","gender":"M","digital":[40,100,30]},"teacher":{"name":"Tina","gender":"F"},"message":[{"text":1},{"text":2},{"text":3}]}';
var javascriptObj=JSON.parse(jsonString);
alert(javascriptObj);
var digital=javascriptObj.student.digital[1];
console.log("digital:"+digital);
var studentname=javascriptObj.student.name;
console.log("student name:"+studentname);
var teacherGender=javascriptObj.teacher.gender;
console.log("teacher gender"+teacherGender);
var len=javascriptObj.message.length;
console.log("message length"+len);
var text=javascriptObj.message[len-1].text;
console.log("text:"+text);

var jsonObj={
	"student":{
		"name":"LinChen",
		"weight":"50KG",
		"gender":"M",
		"digital":[40,100,1000]
	},
	"teacher":{
		"name":"Tina",
		"gender":"F"
	},
	"message":[{"text":1},{"text":2},{"text":3}]
};
var jsonObjtoString=JSON.stringify(jsonObj);
alert(jsonObjtoString);
</script>
</body>
</html>