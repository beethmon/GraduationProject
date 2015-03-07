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


$('.uk-modal').on({
    'show.uk.modal': function(e){
        console.log("Modal is visible.");
        console.log(e);
    },
    'hide.uk.modal': function(){
        console.log("Element is not visible.");
        $(".uk-modal form input[type='reset']").click();
    }
});

/**
 * @description 工具
 *
 * 以下参数均需填写
 * @param {json} 数据
 * @param {location} 填充位置 填写选择符
 * @param {url} ajax地址
 * @param {pSize} 查询条数
 * @param {pindex} 页码
 * @param {colname} 填充的元素
 * @param {tname} 标题
 * @param {pageLocation} 翻页插件位置 填写选择符
 * @param {deafultDisplay} 填充方式
 *
 * @function {getData} ajax获取数据并填充
 * @function {fillDataWtih_UK_Panel} 填充方式
 * @function {fillDataWeithTable} 填充方式
 */
var dataProcessUtil = {
    //全局变量
    json : {},
    url : "",
    pSize:"",
    pIndex:"",
    query:{},
    location:{},
    //example :{"ccodes":"CCodes","sales_price":"单价(￥)","num":"库存(个/kg)","state":"状态"};
    colname: false,
    tname:"",
    pageLocation:"",
    defaultDisplay: function () {},

    getData:function(){
        $.ajax({
            url : this.url + this.pSize+"/"+this.pIndex,
            type : 'POST',
            dataType : 'json',
            data : this.query,
            success : function(data) {
                dataProcessUtil.json =data;
                console.log(data);
                dataProcessUtil.defaultDisplay();
                if(dataProcessUtil.pIndex<=1)
                    dataProcessUtil.initPage();
            }
        }).done(function() {
            console.log("success");
        }).fail(function() {
            console.log("error");
        }).always(function() {
            console.log("complete");
        });
    },

    // 数据填充
    /**
     * @description 填充数据 With_UK_Panel
     */
    fillingDataWith_UK_Panel: function () {
        // 获取json属性名
        var list = this.json["list"];
        var jsonAttrName = (function(attr) {
            var tmp = new Array();
            for ( var key in attr) {
                tmp.push(key);
            }
            return tmp;
        })(list[0]);
        // 寻找插入位置
        var dataContext = $(this.location);
        //移除原有容器
        dataContext.find("#context").remove();
        // 创建容器
        var context = $("<div id='context' class='uk-grid uk-grid-match'></div>");
        // 创建items
        for (var i = 0; i < list.length; i++) {
            var item = list[i];
            var itemContext = $("<div itemId='"+i+"' class='tm-item uk-width-small-1-2 uk-width-medium-1-3 uk-flex uk-scrollspy-init-inview uk-scrollspy-inview uk-animation-scale-up'></div>");
            // 创建uk-panel
            var panel = $("<a class='uk-panel uk-panel-box'>");
            var title = $("<h3 class='uk-panel-title'></h3>");
            var table = $("<table class='uk-table'></table>");
            // 数据填冲
            var attrs = typeof (this.colname)=="object"?this.colname: jsonAttrName;
            for ( var key in attrs) {
                // 假如没有displayAttr参数 key为数字，需到attrs里提取json属性名称作为key
                key = /^\d+$/.test(key) ? attrs[key] : key;
                var tr = $("<tr></tr>");
                tr.append($("<td></td>").html(attrs[key]));
                tr.append($("<td></td>").html(item[key]));
                table.append(tr);
            }
            title.html(item[this.tname]);
            // 完成结构
            panel.append(title);
            panel.append(table);
            itemContext.append(panel);
            context.append(itemContext);
            //itemContext.bind("click",function(){
            //    $.UIkit.modal("#update_info").show();
            //    dataProcessUtil.fillingModal($("#update_info"),item);
            //    console.log(item);
            //});
        }
        dataContext.append(context);
        this.bindModal();
        context.uk("gridMargin");
    },
    /**
     * @description 填充数据 With_
     */
    fillingDataWithTable : function(){
        // 获取json属性名
        var list = this.json["list"];
        var jsonAttrName = (function(attr) {
            var tmp = new Array();
            for ( var key in attr) {
                tmp.push(key);
            }
            return tmp;
        })(list[0]);
        // 寻找插入位置
        var dataContext = $(this.location);
        //移除原有容器
        dataContext.find("#context").remove();
        // 创建容器
        var context = $("<div id='context'></div>");
        // 创建表格
        var table = $("<table class='uk-table uk-table-hover uk-table-striped'></table>");
        var thead = $("<thead><tr></tr></thead>");
        var tbody = $("<tbody></tbody>");
        // 制作表头
        var attrs = typeof (this.colname)=="object"?this.colname: jsonAttrName;
        //是否有title
        if(this.tname!="")
            thead.append($("<td class=\"uk-width-1-4\"></td>").html("名称"));
        for ( var key in attrs) {
            thead.append($("<td></td>").html(attrs[key]));
        }
        // 填充数据
        for (var i = 0; i < list.length; i++) {
            var item = list[i];
            var id = "item" + (i + 1);
            var tr = $("<tr itemId='"+i+"' class='tm-item uk-scrollspy-init-inview uk-scrollspy-inview uk-animation-fade'></tr>");
            if(this.tname!="")
                tr.append($("<td></td>").html(item[this.tname]));
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
        this.bindModal();
    },
    /**
     * @description 初始化page插件
     */
    initPage : function(){
        $(".uk-pagination").remove();
        var pagePlugin = $("<ul class=\"uk-pagination\"></ul>");
        $(this.pageLocation).append(pagePlugin);
        var pagination = $.UIkit.pagination($(".uk-pagination"), {
            pages : this.json["pages"]
        });
        pagination.off('select.uk.pagination');
        pagination.on('select.uk.pagination', function(e, pageIndex) {
            dataProcessUtil.pIndex = (pageIndex+1);
            dataProcessUtil.getData();
            $.scrollTo(0,250);
        });
    },
    /**
     * @description 搜索并填充
     * @param qJson
     */
    search : function(qJson){
        if(typeof (qJson) != "undefinded")
            this.query = qJson;
        this.pIndex = 1;
        this.getData();
    },
    ///**
    // * @description 填充数据到表单
    // */
    //fillingModal: function(modal,json){
    //    console.log(json);
    //    $.ajax({
    //        url: this.url + this.pSize +"/"+1,
    //        type : 'POST',
    //        dataType : 'json',
    //        data : json,
    //        success : function(data){
    //            var item = data["list"][0];
    //            var jsonAttrName = (function(attr) {
    //                var tmp = new Array();
    //                for ( var key in attr) {
    //                    tmp.push(key);
    //                }
    //                return tmp;
    //            })(item);
    //            for(var key in jsonAttrName){
    //                var attr = jsonAttrName[key];
    //                var input = modal.find("input[name="+attr+"]");
    //                if(input.attr("type")!="radio"){
    //                    input.val(item[attr]);
    //                }else{
    //                    item[attr]>0?input.eq(0).attr("checked",1):input.eq(1).attr("checked",1);
    //                }
    //            }
    //        }
    //    }).done(function() {
    //        console.log("success");
    //    }).fail(function() {
    //        console.log("error");
    //    }).always(function() {
    //        console.log("complete");
    //    });
    //},
    /**
     * @description 填充数据到表单
     */
    bindModal: function(){
        $("[itemID]").each(function(i,e){
            $(e).bind("click",function(){
                $.UIkit.modal("#update_info").show();
                var list = dataProcessUtil.json["list"];
                console.log(list[i]);
                var item = list[i];
                var jsonAttrName = (function(attr) {
                    var tmp = new Array();
                    for ( var key in attr) {
                        tmp.push(key);
                    }
                    return tmp;
                })(item);
                for(var key in jsonAttrName){
                    var attr = jsonAttrName[key];
                    var input =$("#update_info").find("input[name="+attr+"]");
                    if(input.attr("type")!="radio"){
                        input.val(item[attr]);
                    }else{
                        item[attr]>0?input.eq(0).attr("checked",1):input.eq(1).attr("checked",1);
                    }
                }
            });
        });
    },
    commitSimpleObj: function (action,obj){
        $.ajax({
            url:dataProcessUtil.url+action,
            type : 'POST',
            dataType : 'json',
            data : obj,
            success : function(data) {
                if(data["isSuccess"]==true)
                    $.UIkit.notify({
                        message : "<i class='uk-icon-check'></i> 执行成功",
                        timeout : 2000,
                        pos     : 'top-center',
                        status : 'success'
                    });
                else
                    $.UIkit.notify({
                        message : "<i class='uk-icon-close'></i> 执行失败",
                        timeout : 2000,
                        pos     : 'top-center',
                        status : 'danger'
                    })
            }
        }).done(function() {
            console.log("success");
        }).fail(function() {
            alert("error");
        }).always(function() {
            $.UIkit.modal("#update_info").hide();
            $.UIkit.modal("#insert").hide();
            dataProcessUtil.search();
            console.log("complete");
        });
    },
    change:function(fun){
        if(fun!=this.defaultDisplay&&(fun==this.fillingDataWith_UK_Panel||fun==this.fillingDataWithTable)){
            this.defaultDisplay=fun;
            this.defaultDisplay();
        }
    }

};

