<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lab 12 Quiz</title>
</head>
<body>
	<div>
		<h2>The Number Quiz</h2>
	</div>
	
	<form method="post" action="QuizTest">
	    <div>
	    	Your age: <input type="text" name="age" value=<%=request.getAttribute("age") %> required><br>
	    	<p style="color:red"><%=request.getAttribute("exception") %></p>
	    </div>
		<div>
			Your current score is
			<%=request.getAttribute("score")%>.
		</div>
		<div>Guess the next number in the sequence.</div>
		<div><%=request.getAttribute("question")%></div>
		<div>
			Your answer: <input type="text" name="answer">
		</div><br>
		<div>
		    <button type="submit" name="Submit">Submit</button>
			<button type="button" name="hint" onclick="alert('<%=request.getAttribute("hint")%>')">Hint?</button>
		</div>
	</form>
</body>
</html>
