<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>ログイン</h1>
	<form action="Login" method="post">
		ID：<input type="text" name="id" /><br>
		Password：<input type="password" name="password" /><br>
		<input type="submit" value="ログイン" />
	</form>
	<%
		HttpSession hs = request.getSession(false);
		if(hs.getAttribute("msg") == null){
			out.print("");
		}else{
			out.print(hs.getAttribute("msg"));
		}
		String msg = "";
	%>
	<br>
	<a href="UserRegister">新規ユーザ登録</a>
</body>
</html>