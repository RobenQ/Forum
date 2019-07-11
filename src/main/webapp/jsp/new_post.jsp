<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>发表新帖</title>
		<meta charset="utf-8"/>
		<link rel="stylesheet" href="../css/new_post.css" />
	</head>
	<body>
		<div id="div1">
			<h1>发表新帖</h1>
			<h3>欢迎<span id="name">周庆</span>登录！</h3>
		</div>
		<div id="div2">
			<form action="/forum/user/newPost" method="post">
				新帖版块：<select id="sel" name="sel">
							<option value ="java">Java</option>
							<option value =".NET">.NET</option>
							<option value ="python">Python</option>
						</select><br><br>
				帖子标题：<input type="text" id="title" name="title" /><br><br>
				详细内容：<textarea id="context" name="context"></textarea><br><br>
				<button type="submit" id="btn">确认发表</button>
			</form>
		</div>
	</body>
</html>