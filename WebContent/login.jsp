<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath }" scope="session"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录后台管理系统</title>
<link href="${ctxPath }/static/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${ctxPath }/static/js/jquery-3.3.1.min.js"></script>
<script language="JavaScript" src="${ctxPath }/static/js/jquery.js"></script>
<script src="${ctxPath }/static/js/cloud.js" type="text/javascript"></script>

<script language="javascript">
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })  
});  
</script> 
<script type="text/javascript">
	$(function(){
		$("input[name='login']").click(function(){
			$.ajax({
				type:"post",
				url:"${ctxPath}/login.do",
				data:{userName:$("input[name='userName']").val(),password:$("input[name='password']").val()},
				dataType:"json",
				success:function(data){
					if(data.resCode==200){
						window.location="jsp/common/main.jsp";
					}else{
						$("span:last").text(data.resMsg);
					}
				}
			});
		});
	});


</script>
</head>

<body style="background-color:#1c77ac; background-image:url(${ctxPath }/static/images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>欢迎登录后台管理界面平台</span>    
    <ul>
    <li><a href="#">回首页</a></li>
    <li><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    </ul>    
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox">
    
    <ul>
    <li><input name="userName" type="text" class="loginuser" value="admin" onclick="JavaScript:this.value=''"/></li>
    <li><input name="password" type="text" class="loginpwd" value="密码" onclick="JavaScript:this.value=''"/></li>
    <li><input name="login" type="button" class="loginbtn" value="登录"/><label><input name="" type="checkbox" value="" checked="checked" />记住密码</label><label><a href="#">忘记密码？</a></label></li>
    <li><span></span></li>
    </ul>
    
    </div>
    
    </div>
    
</body>

</html>
