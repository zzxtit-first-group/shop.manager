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

</head>
<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">用户列表</a></li>
    </ul>
    </div>
    <br>
    
    <div>
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
