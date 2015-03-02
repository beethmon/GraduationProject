var commodity_query = {
	cname: '可乐'
};
getDataWithAjax('commodity/json/16/1',function(data){
	console.log(JSON.stringify(data))
});
