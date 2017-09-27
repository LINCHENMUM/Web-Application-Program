<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
<script type="text/javascript">
$(document).ready(function(){
	$("#btnajax").click(function(){
		$.ajax({
			url:"myself1.txt",
			type:"GET",
			success:function(result){
				$("#div1").html(result);},
			error:ajaxFailure
		});
		
	});
	
});

function ajaxFailure(xhs, status,exception){
	console.log(xhs);
	console.log(status);
	console.log(exception);
	$("body").prepend($("<div>").html(exception).addClass("error"));
	$("#div1").html("Sorry, it is error");
}
</script>
</head>
<body>
	<div id="div1">
		<h2>Lin Chen try the ajax again.</h2>
	</div>
	<div>
		<button id="btnajax">click to try the content no refresh</button>
	</div>
</body>
</html>