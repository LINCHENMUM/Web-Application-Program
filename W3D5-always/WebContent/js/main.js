$(function() {
	$("#btn1").click(getMethod);
});

function getMethod() {
	$.get("MyServlet").done(function() {
		alert("done!");
	}).error(function() {
		alert("error!");
	}).always(function() {
		$("#loader").hide();
	});
	$("#loader").show();
}

//$(function() {
//	$(document).ajaxStart(function() {
//		$("#loader").show();
//	}).ajaxStop(function() {
//		$("#loader").hide();
//	});
//
//	$("#btn1").click(function() {
//		$.get("http://foo.com").done(function() {
//			alert("done 1!");
//		}).error(function() {
//			alert("error 1!");
//		});
//		
//	});
//	
//	$("#btn2").click(function() {
//		$.get("MyServlet").done(function() {
//			alert("done 2!");
//		}).error(function() {
//			alert("error 2!");
//		});
//	});
//});
//
//
