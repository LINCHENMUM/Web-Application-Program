<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Using the XMLHttpRequest object</h2>

	<button id="btn" type="button">Change Content</button>

	<p id="demo"></p>

	<script type="text/javascript">
		window.onload = function() {
			document.getElementById("btn").onclick = function() {
				var xhttp = new XMLHttpRequest();
				xhttp.onreadystatechange = function() {
					if (this.readyState == 4 && this.status == 200) {
						document.getElementById("demo").innerHTML = this.responseText;
					}
				};
				xhttp.open("GET", "xmlhttp_info.txt", true);
				xhttp.send();
			}
		}
	</script>

</body>
</html>