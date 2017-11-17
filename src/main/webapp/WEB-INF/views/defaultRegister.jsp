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
			<form action="default/register" method="post" style="font-size: 1.5em;">
				用户名称:<input type="text" name="name" placeholder="请输入您的用户名!"/>
				<br>
				登陆密码:<input type="password" name="password" placeholder="请输入您的密码!"/>
				<br>
				电子邮箱:<input type="text" name="email" placeholder="请输入您的邮箱!"/>
				<br>
				职&emsp;&emsp;业:<select name="profession" style="height:30px;width:180px;">
					<option value="student" selected="selected">学生</option>
					<option value="teacher">老师</option>
					<option value="nojob">无业游民</option>
				</select>
				<hr>
				<div style="font-size: 0.8em;">${message }</div>
				<input type="submit" value="注册"/>&emsp;<input type="reset" value="重置"/>
			</form>
		</div>
	</div>
	
</body>
</html>