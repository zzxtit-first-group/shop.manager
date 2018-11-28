<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${ctxPath }/static/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="${ctxPath }/static/js/jquery.js"></script>

<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson .header").click(function(){
		var $parent = $(this).parent();
		$(".menuson>li.active").not($parent).removeClass("active open").find('.sub-menus').hide();
		
		$parent.addClass("active");
		if(!!$(this).next('.sub-menus').size()){
			if($parent.hasClass("open")){
				$parent.removeClass("open").find('.sub-menus').hide();
			}else{
				$parent.addClass("open").find('.sub-menus').show();	
			}
			
			
		}
	});
	
	// 三级菜单点击
	$('.sub-menus li').click(function(e) {
        $(".sub-menus li.active").removeClass("active")
		$(this).addClass("active");
    });
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('.menuson').slideUp();
		if($ul.is(':visible')){
			$(this).next('.menuson').slideUp();
		}else{
			$(this).next('.menuson').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span>信息管理</div>
    
    <dl class="leftmenu">
        
	    <dd>
		    <div class="title">
		    <span><img src="${ctxPath }/static/images/leftico01.png" /></span>管理信息
		    </div>
	    	<ul class="menuson">
	    		<c:if test="${resMsg.data.userType eq '00' }">
	    			<li>
			            <div class="header">
			            <cite></cite>
			            <a href="${ctxPath }/userlist" target="rightFrame">用户管理</a>
			            <i></i>
			            </div>
			            <ul class="sub-menus">
			            <li><a href="${ctxPath }/jsp/user/addUser.jsp" target="rightFrame">添加用户</a></li>
			            <li><a href="${ctxPath }/list" target="rightFrame">用户列表</a></li>
			            </ul>
			        </li>
	    		</c:if>
	    		
	    		<c:if test="${resMsg.data.userType eq '01' }">
	    			<li>
			            <div class="header">
			            <cite></cite>
			            <a href="#">订单管理</a>
			            <i></i>
			            </div>
			            <ul class="sub-menus">
				            <li><a href="${ctxPath }/orderList" target="rightFrame">订单列表</a></li>
				            <li><a href="${ctxPath }/noSend.do" target="rightFrame">发货单列表</a></li>
				            <li><a href="${ctxPath }/send.do" target="rightFrame">已发货订单</a></li>
			            </ul>
			        </li>
        
			        <li>
			            <div class="header">
			            <cite></cite>
			            <a href="#">商品管理</a>
			            <i></i>
			            </div>                
			            <ul class="sub-menus">
			            <li><a href="javascript:;">文件数据</a></li>
			            <li><a href="javascript:;">学生数据列表</a></li>
			            <li><a href="javascript:;">我的数据列表</a></li>
			            <li><a href="javascript:;"></a></li>
			            </ul>
			        </li>

	    		</c:if>
	    		
	        </ul>    
	    </dd>
    
    </dl>
    
</body>
</html>
