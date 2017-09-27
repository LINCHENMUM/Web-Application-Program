$(document).ready(function() {

	$("button").click(validation);

});

function validation(event){
	event.preventDefault();
	$.ajax("LoginServlet", {
		"type" : "post",
		"data" : {
			"username" : $("input[name='username']").val(),
			"password" : $("input[name='password']").val(),
		}
	}).done(function(response) {
		if(response == "true") {
			$(".msg").html("Hi, "+$("input[name='username']").val()+". You logged in sussceefully!");
			$("form").hide();
		}
		else {
			$(".msg").html("Incorrect username or password! Please try again!");
		}
	}).fail(function() {
		console.log("Failed");
	})
}