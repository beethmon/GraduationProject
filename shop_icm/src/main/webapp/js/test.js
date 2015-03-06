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
            var itemContext = $("<a  class='tm-item uk-width-small-1-2 uk-width-medium-1-3 uk-flex uk-scrollspy-init-inview uk-scrollspy-inview uk-animation-scale-up'></a>");
            // 创建uk-panel
            var panel = $("<div class='uk-panel uk-panel-box'>");
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
            itemContext.bind("click",function(){
                $.UIkit.modal("#update_info").show();

            });
        }
        dataContext.append(context);
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
            var tr = $("<tr class='tm-item uk-scrollspy-init-inview uk-scrollspy-inview uk-animation-fade'></tr>");
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
    search : function(qJson){
        if(typeof (qJson) != "undefinded")
            this.query = qJson;
        this.pIndex = 1;
        this.getData();
    },
    fillingModal: function(){}
};

