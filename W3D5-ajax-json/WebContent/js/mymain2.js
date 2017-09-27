$(document).ready(
function(){
	$("#username").blur(function(event){
		var name=$("#username").val();
		$.ajax("jsonServlet",{
			type:"GET",
			data:{username1:name}
		})
		.done(ajaxSuccess)
		.fail(ajaxFailure);
	});
});

function ajaxSuccess(responseText){
	$("#ajaxgetuserserverletresponse").addClass("success").html(responseText);
}

function ajaxFailure(xhs,status,exception){
	console.log(xhs);
	console.log(status);
	console.log(exception);
	$("body").prepend($("<div>").addClass("error").html(exception));
}