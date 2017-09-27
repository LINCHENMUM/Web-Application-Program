$(function(){
	$("#btn").click(function(event){
		$.ajax("xmlhttp_info.txt").done(success).fail(fail);
	});
	});
function success(response){
	$("p").html(response);
}

function fail(xhs,status,exception){
	console.log(xhs,status,exception);
	$("body").prepend($("<div>").html(exception));
}