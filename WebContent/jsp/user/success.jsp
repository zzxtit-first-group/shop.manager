<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
			*{
				margin: 0px;
				padding: 0px;
			}
			
			#myDiv{
				width:1179px; 
				height:150px; 
				text-align:center; 
				padding-top:150px;
			}
			
			p{
				margin:5px;
			    font-size: 22px;
    			color: #222;
			}
			
			a{
				color: #4c92fc;
				font-size: 15px;
				text-decoration:none;
			}
		</style>
</head>
<body>
		<div id="myDiv">
			<img src="${ctxPath }/static/images/success.png" />
			<br />
			<p>成功添加用户</p>
			<a href="${ctxPath }/jsp/user/addUser.jsp">请继续</a>
		</div>
	</body>
</html>