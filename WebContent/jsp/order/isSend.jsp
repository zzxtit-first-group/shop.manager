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
    
	    <table class="tablelist">
	    	<thead>
		    	<tr>
		    		<th>订单编号</th>
			        <th>订单时间</th>
			        <th>付款情况</th>
			        <th>发货情况</th>
			        <th>用户ID</th>
		        </tr>
	        </thead>
	        <tbody id="tfbody">
	        	<c:if test="${orderList != null }">
	        		<c:forEach var="order" items="${orderList }">
	        			<tr>
	        				<td>${order.orderId }</td>
					        <td>${order.orderTime }</td>
					        <td>${order.isPay==1?"已付款":"待付款" }</td>
					        <td>${order.isSend==1?"已发货":"待发货" }</td>
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
