<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align: center">
		<div style="width:500px;margin:0 auto">
			<h1>简单用户注册</h1>
			<form action="${pageContext.request.contextPath }/user/simple/register/save" method="post" style="font-size: 1.5em;">
				用户名称:<input type="text" name="name" placeholder="请输入您的用户名!"/>
				<br>
				<br>
				<div style="font-size: 0.8em;">${message }</div>		
				<br>
				登陆密码:<input type="password" name="password" placeholder="请输入您的密码!"/>
				<hr>
				<input type="submit" value="注册"/>&emsp;<input type="reset" value="重置"/>
			</form>
		</div>
	</div>
	
</body>
</html>