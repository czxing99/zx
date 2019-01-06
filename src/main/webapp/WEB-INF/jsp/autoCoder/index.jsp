<%--
  Created by IntelliJ IDEA.
  User: ax
  Date: 2018/12/15
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
    <title>Title</title>
    <script src="/${root}/js/jquery-3.2.1.min.js"></script>
</head>
<style type="text/css">
  *{
        margin: 0;
        padding: 0;
    }

    #leftdiv {
        float: left;
        width: 500px;
    }

    #rigthDiv {
        float: left;
        background-color: orange;
        margin-left: 500px;
    }
</style>

<body>
　
<input type="hidden"value="test"/>
<div id="leftdiv"style="height:800px;width:500px;overflow:auto">
    <table id="dbTabl"  border="1" cellspacing="0">
        <colgroup>
            <col style="width: 100%;"></col>


        </colgroup>
        <thead>
        <tr>
            <th>表名</th>
        </tr>
        </thead>

        <tbody>

        <c:forEach var="TableName" items="${page}">
            <tr>
                <td > ${TableName.tableName}</td>

            </tr>
        </c:forEach>

        </tbody>

    </table>
</div>

<div class="rigthDiv">
    <input type="text" id="tableName"/>
    <input type="text"id = "clazzName"/>
    <input type="button" id="save"value="生成"/>
   <table  style="font-size:11px;" border="1px" cellspacing="0px">
    <thead>
    <tr role="row">
        <th >
            序号
        </th>
        <th >
            列名
        </th>
        <th >
            类型
        </th>
        <th >
            长度
        </th>
        <th >
            是否主键
        </th>
        <th >
            po名称
        </th>
        <th >
            注释
        </th>
        <th >
            表名
        </th>
        <th >
            是否是数据列
        </th>
        <th class="sorting_disabled" rowspan="1" colspan="1" aria-label=""></th>
    </tr>
    </thead>
    <tbody id="columnList"></tbody>
</table>
</div>

</body>
</html>
<style type="text/css">
    .s1 {
        background-color: yellow;
    }
</style>
<script>
    jQuery(document).ready(function(){
       $("tbody tr").click(function(){
           var tableName = $.trim($(this).find('td').eq(0).text());
           $("#tableName").val(tableName);
           $(this).addClass("s1").siblings().removeClass("s1");
           $(this).find(":radio").attr("checked", true);
           $.ajax({
               type: "get",
               url: "/zx/autoCoder/getColumnName",
               dataType: "json",
               data:{'tableName':tableName},
               success: function (msg) {
                   $("#columnList").empty();
                   for(var i=0;i < msg.length;i++){
                       var tr = "";
                       var td = "";
                       for(var key in msg[i]){
                           if(key =='comment') {
                               td += "<td> <input type='textbox' value = '"+ msg[i][key]+"'/></td>";
                           }else{
                               td += "<td>"+ msg[i][key]+"</td>";
                           }
                       }
                       tr +="<tr>"+ td+"</tr>";
                       $("#columnList").append(tr);
                   }
               },
               error: function () {
                   alert("错误");
               }
           });
       });
       $("#save").click(function(){
           var trs = $('#columnList tr');
           var result  = [];
           for(var i=0;i<trs.length;i++){
               var tds = $(trs[i]).find('td');
               result.push({'id':$(tds[0]).html(),
                   'name':$(tds[1]).html(),
                   'type':$(tds[2]).html(),
                   'length':$(tds[3]).html(),
                   'comment':$(tds[5]).find("input").val(),
                   'beanName':$(tds[6]).html(),
                   'isKey':$(tds[4]).html(),
                   'isDataColumn':$(tds[7]).html()
               });
           }
           var  model ="";
           var clazzName =$('#clazzName').val();
           var memo = "";
           var tableName =$('#tableName').val();
           var simpleName ="";
           var menuId = "";
           console.log(result);
           $.ajax({
               type: "post",
               url: "/zx/autoCoder/auto",
               dataType: "json",
               data:{data : JSON.stringify(result),
                   model:model,
                   clazzName:clazzName,
                   memo:memo,
                   tableName:tableName,
                   simpleName:simpleName,
                   menuId:menuId},
               success: function (msg) {
                   alert(msg.success);
               },
               error: function (e) {
                   alert("错误");
               }
           });
       })

   })
</script>

