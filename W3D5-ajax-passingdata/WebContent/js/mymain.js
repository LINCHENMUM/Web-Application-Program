$(document).ready(function() {
	$("button").click(validate);
});

function validate(event) {
	event.preventDefault();
	
	var username = $("#username").val();
	var password = $("#password").val();
	$.get("mylogin", {
		username : username,
		password : password
	}).done(loginSuccess).fail(loginFail);
}

function loginSuccess(responseText) {
	alert(responseText);
	alert(responseText == "true");
	if (responseText == "true") {
		$("#result").addClass("success").html(
				"Hi " + $("input[id='username']").val() + ", Welcome! you login successfully!");
		$("form").hide();
	} else {
		$("#result").addClass("fail").html("Incorrect username or password, please try again");
	}
}

function loginFail(xhs, status, exception) {
	console.log(xhs, status, exception)
	$("body").prepend($("<div>").addClass(fail).html(exception));
}