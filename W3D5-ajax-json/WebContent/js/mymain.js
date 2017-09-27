$(document).ready(function(){
	$('#username').blur(function(event){
		var name=$('#username').val();
		$.get('jsonServlet',{
			username:name
		},function(responseText){
			$('#ajaxgetuserserverletresponse').text(responseText);
		});
	});
});
		

