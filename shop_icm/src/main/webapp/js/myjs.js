//form to json
(function($){
    $.fn.serializeJson=function(){
        var serializeObj={};
        var array=this.serializeArray();
        var str=this.serialize();
        $(array).each(function(){
            if(serializeObj[this.name]){
                if($.isArray(serializeObj[this.name])){
                    serializeObj[this.name].push(this.value);
                }else{
                    serializeObj[this.name]=[serializeObj[this.name],this.value];
                }
            }else{
                serializeObj[this.name]=this.value;
            }
        });
        return serializeObj;
    };
})(jQuery);

//全局变量
var json;

//侧边栏
$(function() {
	console.log("test");
	var toggle = $(".tm-toggle-icon");
	var page = $(".tm-page");
	var sidebar = $(".tm-sidebar");
	var flag = false;
	$(".tm-sidebar").bind("mouseenter", function() {
		flag = true;
		page.css("left", "210px");
		toggle.css("opacity", 0);
		setTimeout(function() {
			if (flag)
				sidebar.css("z-index", 1003);
		}, 300);
	});
	$(".tm-sidebar").bind("mouseleave", function() {
		flag = false;
		sidebar.css("z-index", 1001);
		page.css("left", "0px");
		toggle.css("opacity", 1);
	});
});

// 数据提取
function getDataWithAjax(url, query, fun_do) {
	$.ajax({
		url : url,
		type : 'POST',
		dataType : 'json',
		data : query,
		success : function(data) {
			fun_do(data);
			return data;
		}
	}).done(function() {
		console.log("success");
	}).fail(function() {
		console.log("error");
	}).always(function() {
		console.log("complete");
	});
}

// 数据填充
/**
 * @description 填充数据
 * @param {location}
 *            插入位置 string
 * @param {json}
 *            数据 json
 * @param {displayAttrs}
 *            显示的列 Array<string,string>
 */
function fillingDataWith_UK_Panel(location, json, tname, displayAttrs) {
	$("#context").remove();
	// 获取json属性名
	var data = json;
	var list = json["list"];
	var jsonAttrName = (function(attr) {
		var tmp = new Array();
		for ( var key in attr) {
			tmp.push(key);
		}
		return tmp;
	})(list[0]);

	// 寻找插入位置

	var dataContext = $(location);
	// 创建容器
	var context = $("<div id='context' class='uk-grid uk-grid-match'></div>");
	// 创建items

	for (var i = 0; i < list.length; i++) {
		var item = list[i];
		var itemContext = $("<a  class='tm-item uk-width-small-1-2 uk-width-medium-1-3 uk-flex uk-scrollspy-init-inview uk-scrollspy-inview uk-animation-scale-up'></a>");
		// 创建uk-panel
		var panel = $("<div class='uk-panel uk-panel-box'>");
		var title = $("<h3 class='uk-panel-title'></h3>");
		var table = $("<table class='uk-table'></table>");
		// 数据填冲
		if (typeof (displayAttrs) == "undefined") {
			for ( var key in jsonAttrName) {
				var tr = $("<tr></tr>");
				tr.append($("<td></td>").html(jsonAttrName[key]));
				tr.append($("<td></td>").html(item[jsonAttrName[key]]));
				table.append(tr);
			}
		} else {
			for ( var key in displayAttrs) {
				var tr = $("<tr></tr>");
				tr.append($("<td></td>").html(displayAttrs[key]));
				tr.append($("<td></td>").html(item[key]));
				table.append(tr);
			}
		}
		title.html(item[tname]);
		// 完成结构
		panel.append(title);
		panel.append(table);
		itemContext.append(panel);
		context.append(itemContext);
        itemContext.bind("click",function(){
            $.UIkit.modal("#update_info").show();
            fillingDataInModal(item);
        });
	}
	dataContext.append(context);
	context.uk("gridMargin");
}

function fillingDataWithTable(location, json, tname, displayAttrs) {
	$("#context").remove();
	var data = json;
	var list = json["list"];
	var jsonAttrName = (function(attr) {
		var tmp = new Array();
		for ( var key in attr) {
			tmp.push(key);
		}
		return tmp;
	})(list[0]);
	// 寻找插入位置
	var dataContext = $(location);
	// 创建容器
	var context = $("<div id='context'></div>");
	// 创建表格
	var table = $("<table class='uk-table uk-table-hover uk-table-striped'></table>");
	var thead = $("<thead><tr></tr></thead>");
	var tbody = $("<tbody></tbody>");
	// 制作表头
	var attrs = typeof (displayAttrs) == "undefined" ? jsonAttrName
			: displayAttrs;
	thead.append($("<td class=\"uk-width-1-4\"></td>").html("名称"));
	for ( var key in attrs) {
		thead.append($("<td></td>").html(attrs[key]));
	}
	// 填充数据
	for (var i = 0; i < list.length; i++) {
		var item = list[i];
		var id = "item" + (i + 1);
		var tr = $("<tr class='tm-item uk-scrollspy-init-inview uk-scrollspy-inview uk-animation-fade'></tr>");
		tr.append($("<td></td>").html(item[tname]));
		for ( var key in attrs) {
            // 假如没有displayAttr参数 key为数字，需到attrs里提取json属性名称作为key
			key = /^\d+$/.test(key) ? attrs[key] : key;
			tr.append($("<td></td>").html(item[key]));
		}
		tbody.append(tr);
	}
	// 完成结构
	table.append(thead);
	table.append(tbody);
	context.append(table);
	dataContext.append(context);
}

//填充数据到表格
function fillingDataInModal(data){
    console.log("fillingDataInModal");
    console.log(data);
}

function dataEscape(arr) {
    $("td:contains('状态')+td").each(function(i,e){
        var element = $(e);
        element.html()>0?element.html("有效"):element.html("无效");
    });
}

// 翻页插件
function pageInit(url, query, tjson, displayFun) {
	$(".uk-pagination").remove();
	var pagePlugin = $("<ul class=\"uk-pagination\"></ul>");
	$("#page-context").append(pagePlugin);
	var pagination = $.UIkit.pagination($(".uk-pagination"), {
        pages       : tjson["pages"]
    });
	pagination.off('select.uk.pagination');
	pagination.on('select.uk.pagination', function(e, pageIndex) {
		console.log('You have selected page: ' + (pageIndex + 1));
		getDataWithAjax(url + (pageIndex + 1), query, function(data) {
            json = data;
			$.scrollTo(0,250);
			console.log(query);
            if(typeof (displayFun) != "undefinded")
                defaultDisplay("#data-context", data, tname, colname);
            else
                displayFun("#data-context", data, tname, colname);
            dataEscape();
		});
	});
    dataEscape();
}

function search(url, query, tname, colname, displayFun) {
	getDataWithAjax(url + 1, query, function(data) {
        json = data;
        if(typeof (displayFun) != "undefinded")
            defaultDisplay("#data-context", data, tname, colname);
        else
            displayFun("#data-context", data, tname, colname);
		pageInit(url, query, data, displayFun);
	});
}


