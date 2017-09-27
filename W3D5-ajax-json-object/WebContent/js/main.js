$(document).ready(function(){
	$("#country").change(function(event){
		var country=$("#country").val();
		$.get("ajaxJson",{country:country})
		.done(ajaxSuccess)
		.fail(ajaxFail);
	});
	
	$("#state").change(function(event){
		var state=$("select#state").val();
		$.get("selectcity",{state:state})
		.done(citySuccess)
		.fail(cityFail);
	});
});

function citySuccess(responseJson){
	var $city=$("select#city");
	$city.find("option").remove();
	
	$.each(responseJson,function(key,value){
		$("<option>").val(key).text(value).appendTo($city);
	});
}

function cityFail(xhs,status,exception){
	console.log(xhs,status,exception);
	$("body").prepend($("<div>").addClass("error").html(exception));
}

function ajaxSuccess(responseJson){
	var $state=$("select#state");
	
	$state.find("option").remove();
	$.each(responseJson,function(key,value){
		$("<option>").val(key).text(value).appendTo($state);
	});
	
}

function ajaxFail(xhs,status,exception){
	console.log(xhs);
	console.log(status,excepiton);
	$("body").prepend($("<div>").html(exception).addClass(error));
}
