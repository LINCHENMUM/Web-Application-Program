$(document).ready(function(){
	$("#username").blur(function(event){
		var name=$("#username").val();
		var age=10;
		var gender="M";
		$.post("jsonServlet",{username:name,age:age,gender:gender})
		.done(ajaxSuccess)
		.fail(ajaxFail);
	});
});

function ajaxSuccess(responseText){
	$("#ajaxgetuserserverletresponse").addClass("success").html(responseText);
	
}
function ajaxError(xhr,status,exception){
	console.log(xhr);
	console.log(status);
	console.log(exception);
	$("body").prepend($("<div>").addClass("error").html(exception+"--------error--------"));
}

function ajaxFail(xhr,status,exception){
	console.log(xhr);
	console.log(status);
	console.log(exception);
	$("body").prepend($("<div>").addClass("error").html(exception));
}
