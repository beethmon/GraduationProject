$(function(){
	console.log("test");
	var toggle = $(".tm-toggle-icon");
	var page = $(".tm-page");
	var sidebar = $(".tm-sidebar");
	var flag = false;
	$(".tm-sidebar").bind("mouseenter",function(){
		flag = true;
		page.css("left","210px");
		toggle.css("opacity",0);
		setTimeout(function(){
			console.log(flag);
			if(flag)
				sidebar.css("z-index",1003);
		},300);
	});
	$(".tm-sidebar").bind("mouseleave",function(){
		flag = false;
		sidebar.css("z-index",1001);
		page.css("left","0px");
		toggle.css("opacity",1);
	});
});

//数据提取
function getDataWithAjax(url,query,fun_do){
	$.ajax({
		url: url,
		type: 'POST',
		dataType: 'json',
		data: query,
		success : function(data) {
			fun_do(data);
		}
	})
	.done(function() {
		console.log("success");
	})
	.fail(function() {
		console.log("error");
	})
	.always(function() {
		console.log("complete");
	});
}

