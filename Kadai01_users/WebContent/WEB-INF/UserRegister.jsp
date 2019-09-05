<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ユーザ登録</h1>
	<form action="UserRegister" method="post">
		ID：<input type="text" name="id" /><br>
		Password：<input type="Password" name="password" /><br>
		<input type="submit" value="登録" />
	</form>
	<%
		HttpSession ghs = request.getSession(false);
		if(ghs.getAttribute("mssg") == null){
			out.print("");
		}else{
			out.print(ghs.getAttribute("mssg"));
		}
		String msg = "";
	%>
	<br>
	<a href="Login">戻る</a>
</body>
</html>