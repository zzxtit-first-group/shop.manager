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
		$("input[name='userName']").click(function(){
			$("input[name='userName']")[0].value="";
		});
		
		$("input[name='telephone']").click(function(){
			$("input[name='telephone']")[0].value="";
		});
		
		$("#reset").click(function(){
			$("input[name='userName']")[0].value="";
			$("input[name='telephone']")[0].value="";
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

</style>
</head>
<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">员工基本信息</a></li>
    </ul>
    </div>
    <br>
    
    <div>
	    <div align="center">
	    	<form action="${ctxPath }/query" method="post">
				<table>
					<tr>
						<td class="dftd">用户名：</td><td><input class="dfinput" type="text" name="userName" value="${userName }"> </td>
						<td class="dftd">手机号：</td><td><input class="dfinput" type="text" name="telephone" value="${telephone }"> </td>
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
		    		<th>用户编号</th>
			        <th>用户名</th>
			        <th>姓名<i class="sort"></i></th>
			        <th>性别</th>
			        <th>籍贯</th>
			        <th>手机号</th>
			        <th>身份证号</th>
			        <th>操作</th>
		        </tr>
	        </thead>
	        <tbody>
	        	<c:if test="${userList != null }">
	        		<c:forEach var="user" items="${userList }">
	        			<tr>
	        				<td>${user.userCode }</td>
					        <td>${user.userName }</td>
					        <td>${user.realName }</td>
					        <td>${user.sex }</td>
					        <td>${user.address }</td>
					        <td>${user.telephone }</td>
					        <td>${user.idCard }</td>
					        <td><a href="${ctxPath }/delete?userCode=${user.userCode }" class="tablelink">删除</a> <a href="${ctxPath }/query?userCode=${user.userCode }" class="tablelink">修改</a></td>
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
