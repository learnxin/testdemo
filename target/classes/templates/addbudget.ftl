<#assign base=request.contextPath/>
<#--<#assign base="${springMacroRequestContext.contextPath}"/>-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <title>新增预算</title>
    <meta name="description" content="Static &amp; Dynamic Tables"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>

    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <script src="${base}/static/jquery.min.js?v=2.1.4"></script>
</head>
<body >
    <p>yyfrua ${base}</p>
</body>
<script type="text/javascript">
    $(function () {
        $.ajax({
            async : true,
            url : "http://localhost:8081/process/getMonthSubject.do",
            type : "GET",
            dataType : "jsonp", // 返回的数据类型，设置为JSONP方式
            jsonp : 'jsonpCallback', //指定一个查询参数名称来覆盖默认的 jsonp 回调参数名 callback
            jsonpCallback: 'jsonpCallback', //设置回调函数名
            success: function(response, status, xhr){
            //success: function(data){
                console.log('状态为：' + status + ',状态是：' + xhr.statusText);
                console.log(response);
            }
        });
        /*$.ajax({
            async : true,
            url : "https://ccdcapi.alipay.com/validateAndCacheCardInfo.json",
            type : "GET",
            data:{"_input_charset":"utf-8","cardNo":"6228480059770488670","cardBinCheck":"true"},
            dataType : "jsonp", // 返回的数据类型，设置为JSONP方式
            jsonp : 'jsonpCallback', //指定一个查询参数名称来覆盖默认的 jsonp 回调参数名 callback
            jsonpCallback: 'jsonpCallback', //设置回调函数名
            success: function(response, status, xhr){
            //success: function(data){
                console.log('状态为：' + status + ',状态是：' + xhr.statusText);
                console.log(response);
            }
        });*/

        /*$.getJSON("http://localhost:8081/process/getMonthSubject.do?jsonpCallback=jsonpCallback&callback=?", function(data) {

            console.log(data)
        });*/
    })


</script>
</html>
