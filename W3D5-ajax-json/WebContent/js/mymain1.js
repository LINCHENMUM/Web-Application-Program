$(document).ready(function(){
	$("#username").blur(function(event){
		var name=$("#username").val();
		$.ajax('jsonServlet',{
			type:"GET",
			data: {username1:name},
			success:function(responseText){
				$("#ajaxgetuserserverletresponse").text(responseText);
			},
			error:ajaxFailure
		});
	});
});

function ajaxFailure(xhs,status,exception){
	console.log(xhs);
	console.log(status);
	console.log(exception);
	$("body").prepend($("<div>").html(exception).addClass("error"));
}
