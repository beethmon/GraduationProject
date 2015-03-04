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
			console.log(flag);
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
	console.log("进行数据填充");
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

	console.log(jsonAttrName);
	// 寻找插入位置

	var dataContext = $(location);
	// 创建容器
	var context = $("<div id=\"context\" class=\"uk-grid uk-grid-match\"></div>");
	// 创建items

	for (var i = 0; i < list.length; i++) {
		console.log("item填充" + (i + 1));
		var item = list[i];
		var id = "item" + (i + 1);
		var itemContext = $("<div id=\""
				+ id
				+ "\" class=\"uk-width-small-1-2 uk-width-medium-1-3 uk-flex\"></div>");
		// 创建uk-panel
		var panel = $("<div class=\"uk-panel uk-panel-box\">");
		var title = $("<h3 class=\"uk-panel-title\"></h3>");
		var table = $("<table class=\"uk-table\"></table>");
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
	}
	dataContext.append(context);
	context.uk("gridMargin");
}

function fillingDataWithTable(location, json, tname, displayAttrs) {
	console.log("进行数据填充");
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
	var context = $("<div id=\"context\"></div>");
	// 创建表格
	var table = $("<table class=\"uk-table uk-table-hover uk-table-striped\"></table>");
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
	console.log(attrs);
	for (var i = 0; i < list.length; i++) {
		var item = list[i];
		var id = "item" + (i + 1);
		console.log(item);
		var tr = $("<tr id=\"" + id + "\"></tr>");
		tr.append($("<td></td>").html(item[tname]));
		for ( var key in attrs) {
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

function dataEscape(arr) {
	for ( var index in arr) {
		var item = arr[index];
		for ( var key in item) {
			if (key == "state") {
				item[key] = item[key] == 1 ? "在售" : "下架";
			}
		}
	}
}

// 翻页插件
function pageInit(url, query, json, displayFun2) {
	var pagePlugin = $(".uk-pagination");
	var pagination = $.UIkit.pagination(pagePlugin, {
		pages : json["pages"]
	});
	pagination.on('select.uk.pagination', function(e, pageIndex) {
		console.log('You have selected page: ' + (pageIndex + 1));
		getDataWithAjax(url + (pageIndex + 1), query, function(data) {
			dataEscape(data["list"]);
			defaultDisplay("#data-context", data, tname, colname);
			window.scrollTo(0,0);
		});
	});
}

function search(url, query, tname, colname, displayFun) {
	getDataWithAjax(url + 1, query, function(data) {
		dataEscape(data["list"]);
		displayFun("#data-context", data, tname, colname);
		pageInit(url, query, data, displayFun);
	})
}
