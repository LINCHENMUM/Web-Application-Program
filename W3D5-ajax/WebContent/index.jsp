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
	$(document).ready(function() {
		$("button").click(function() {
			$.ajax({
				url : "mydata.txt", //Change mydata.txt to be any file not exist
				"type" : "GET",
				success : function(result) {
					$("#div1").html(result);
				},
				"error" : ajaxFailure
			});
		});
	});

	function ajaxFailure(xhr, status, exception) {
		console.log(xhr);
		console.log(status);
		console.log(exception);
		$("body").prepend($("<div>").html(exception).addClass("error"));
		$("#div1").html(
				"Sorry,failed to retrieve Data. Seems Tina isn't that good!");
	}
</script>

</head>
<body>
	<div id="div1">
		<h2>Let jQuery AJAX Change This Text</h2>
	</div>

	<button>Get External Content</button>
</body>
</html>