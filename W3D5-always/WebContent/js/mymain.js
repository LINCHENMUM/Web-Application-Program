$(function() {
	$(document).ajaxStart(function() {
		$("#load").show();
	}).ajaxStop(function() {
		$("#load").hide()
	});
	$("#btn1").click(function() {
		$.get("http://www.google.com").done(function() {
			alert("Google good")
		}).fail(function() {
			alert("Google fail")
		}).always(function(){$("#laod").hide();});
		$("#loader").show();
	});
	$("#btn2").click(function() {
		$.get("alwayServlet").done(function() {
			alert("my servlet good")
		}).fail(function() {
			alert("my servlet fail")
		});
	});
	$("#btn3").click(function(){
		$.get("alwayServlet").always(function(){
			$("#load").show();
		});
	});
});