<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${ctxPath }/static/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${ctxPath }/static/js/jquery.js"></script>
<script type="text/javascript" src="${ctxPath }/static/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
  $(".click").click(function(){
  $(".tip").fadeIn(200);
  });
  
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});

});
</script>

<script type="text/javascript">
	$(function(){
		$("input[name='orderId']").click(function(){
			$("input[name='orderId']")[0].value="";
		});
		
		$("input[name='userId']").click(function(){
			$("input[name='userId']")[0].value="";
		});
		
		$("#reset").click(function(){
			$("input[name='orderId']")[0].value="";
			$("input[name='userId']")[0].value="";
		});
		
		$("select").change(function(){
			$.ajax({
				type:"get",
				url:"${ctxPath}/juery.do",
				data:{value:$(this).children('option:selected').val()},
				dataType:"json",
				success:function(data){
					var statusInfo = new Array(5);
					var $tbody = $("#tfbody");
					$tbody.html(""); 
					$.each(data,function(key,value){
						if(value.isPay==1){
							statusInfo[0]="已付款";
						}else{
							statusInfo[0]="待付款";
						}
						if(value.isSend==1){
							statusInfo[1]="已发货";
						}else{
							statusInfo[1]="待发货";
						}
						if(value.isReceive==1){
							statusInfo[2]="已接收";
						}else{
							statusInfo[2]="待接收";
						}
						if(value.isComment==1){
							statusInfo[3]="已评价";
						}else{
							statusInfo[3]="待评价";
						}
						if(value.isDel==1){
							statusInfo[4]="已删除";
						}else{
							statusInfo[4]="待删除";
						}
						var returnValue ="<tr><td></td><td>"+value.orderId+"</td><td>"+value.orderTime+"</td><td>"+statusInfo[0]+"</td><td>"+statusInfo[1]+"</td><td>"+statusInfo[2]+"</td><td>"+statusInfo[3]+"</td><td>"+statusInfo[4]+"</td><td>"+value.userId+"</td></tr>";
						$tbody.append(returnValue);
					});
				}
			});
		});
	});
	
</script>

<style type="text/css">
	.dfinput{
	    width: 300px;
	    height: 32px;
	    line-height: 32px;
	    border-top: solid 1px #a7b5bc;
	    border-left: solid 1px #a7b5bc;
	    border-right: solid 1px #ced9df;
	    border-bottom: solid 1px #ced9df;
	    background: url(${ctxPath }/static/images/inputbg.gif) repeat-x;
	    text-indent: 10px;
	    margin-right:5px;
	}
	
	.dftd{
		width: 60px;
	    line-height: 34px;
	    display: block;
	}
	
	.dfbutton{
	    width: 137px;
	    height: 35px;
	    background: url(${ctxPath }/static/images/btnbg.png) no-repeat;
	    font-size: 14px;
	    font-weight: bold;
	    color: #fff;
	    cursor: pointer;
	    margin-right:60px;
	}
	
	select{
		background: url(${ctxPath }/static/images/th.gif) repeat-x;
	    z-index: 2;
	    top: 3px;
	    cursor: pointer;
	    height: 28px;
	    outline:none;
	}
</style>


</head>
<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">订单列表</a></li>
    </ul>
    </div>
    <br>
    
    <div>
	    <div align="center">
	    	<form action="${ctxPath }/queryOrder" method="post">
				<table>
					<tr>
						<td class="dftd">订单编号：</td><td><input class="dfinput" type="text" name="orderId" value="${orderId }"> </td>
						<td class="dftd">用户ID：</td><td><input class="dfinput" type="text" name="userId" value="${userId }"> </td>
					</tr>
				</table>
				<br>
				<input type="submit" class="dfbutton" value="查询"/><input id="reset" type="reset" class="dfbutton" value="重置"/>
			</form>
	    
	    </div>
    	<br>
    	<br>
    
	    <table class="tablelist">
	    	<thead>
		    	<tr>
		    		<th>
		    			<select class="select3">
		    				<option value="4">全部</option>
						  	<option value ="0">待付款</option>
						  	<option value ="1">待发货</option>
						  	<option value="2">待接收</option>
						  	<option value="3">待评价</option>
						</select>
					</th>
		    		<th>订单编号</th>
			        <th>订单时间</th>
			        <th>付款情况</th>
			        <th>发货情况</th>
			        <th>接收情况</th>
			        <th>评价情况</th>
			        <th>删除情况</th>
			        <th>用户ID</th>
		        </tr>
	        </thead>
	        <tbody id="tfbody">
	        	<c:if test="${orderList != null }">
	        		<c:forEach var="order" items="${orderList }">
	        			<tr>
	        				<td></td>
	        				<td>${order.orderId }</td>
					        <td>${order.orderTime }</td>
					        <td>${order.isPay==1?"已付款":"待付款" }</td>
					        <td>${order.isSend==1?"已发货":"待发货" }</td>
					        <td>${order.isReceive==1?"已接收":"待接收" }</td>
					        <td>${order.isComment==1?"已评价":"待评价" }</td>
					        <td>${order.isDel==1?"已删除":"未删除" }</td>
					        <td>${order.userId }</td>
				        </tr> 
	        		</c:forEach>
	        	</c:if>
	        </tbody>
	    </table>
    
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>

</body>

</html>
