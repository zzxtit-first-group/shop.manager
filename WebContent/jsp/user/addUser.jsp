<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<style type="text/css">
  *{
	    font-size: 9pt;
        margin:0;
        padding:0;
    }


	.place{
	    height: 40px;
		background: url(${ctxPath }/static/images/righttop.gif) repeat-x;
	}
		
	.place span{
		line-height: 40px;
	    font-weight: bold;
	    float: left;
	    margin-left: 12px;
	}
	
	ul{
	    display: block;
	    margin: 0;
	    padding: 0;
	    list-style: none;
	}
	
	.placeul li {
	    float: left;
	    line-height: 40px;
	    padding-left: 7px;
	    padding-right: 12px;
	    background: url(${ctxPath }/static/images/rlist.gif) no-repeat right;
	}
	
	a{
		text-decoration: none;
	    color: #000;
	    outline: none;
	}

	.formbody{
		    padding: 10px 18px;
	}

	.formtitle{
		border-bottom: solid 1px #d0dee5;
	    line-height: 35px;
        position: relative;
	    height: 35px;
	    margin-bottom: 28px;
	}
	
	.formtitle span{
	    font-weight: bold;
	    font-size: 14px;
	    border-bottom: solid 3px #66c9f3;
	    float: left;
	    position: absolute;
	    z-index: 100;
	    bottom: -1px;
	    padding: 0 3px;
	    height: 30px;
	    line-height: 30px;
	}
	
	.dfinput{
		width: 244px;
	    color: #666;
	    margin: 0;
	    padding: 9px 0 9px 14px;
	    font-size: 14px;
	    height: 15px;
	    line-height: 15px;
	    font-family: "Arial","SimSun","宋体";
	    outline-style: none;
	}
	
	.dftd{
		font-size: 20px;
	}
	
	label{
		display: inline-block;
		width: 122px;
		font-size: 18px;
	}
	
	.btn{
		width: 137px;
	    height: 35px;
	    background: url(${ctxPath }/static/images/btnbg.png) no-repeat;
	    font-size: 14px;
	    font-weight: bold;
	    color: #fff;
	    cursor: pointer;
	    border: 0px;
	}
</style>
</head>

<body>

	<div class="place">
    	<span>位置：</span>
	    <ul class="placeul">
	    	<li><a href="#">首页</a></li>
	    	<li><a href="#">添加用户</a></li>
	    </ul>
    </div>
    
    <div class="formbody">
    
    	<div class="formtitle">
    		<span>基本信息</span>
    	</div>
    
    	<div align="center">
			<form action="${ctxPath }/addUser" method="post">
				<table>
					<tr><td class="dftd">用户编号：</td><td><input type="text" name="userCode" class="dfinput" value=""/></td></tr>
					<tr><td class="dftd">用户名：</td><td><input type="text" name="userName" class="dfinput" value=""/></td></tr>
					<tr><td class="dftd">密码：</td><td><input type="password" name="password" class="dfinput" value=""/></td></tr>
					<tr><td class="dftd">姓名：</td><td><input type="text" name="realName" class="dfinput" value=""/></td></tr>
					<tr><td class="dftd">性别：</td><td><label><input type="radio" name="sex" value="男"/>男</label><label><input type="radio" name="sex" value="女"/>女</label></td></tr>
					<tr><td class="dftd">籍贯：</td><td><input type="text" name="address" class="dfinput" value=""/></td></tr>
					<tr><td class="dftd">手机号：</td><td><input type="text" name="telephone" class="dfinput" value=""/></td></tr>
					<tr><td class="dftd">身份证号：</td><td><input type="text" name="idCard" class="dfinput" value=""/></td></tr>
					<tr><td class="dftd">用户类型：</td><td><label><input type="radio" name="userType" value="00"/>管理员</label><label><input type="radio" name="userType" value="01"/>普通会员</label></td></tr>
				</table>
				<br />
				<br />
				<input type="submit" class="btn" value="确认添加" />
			</form>
		</div>
    </div>


</body>

</html>
