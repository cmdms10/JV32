<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% HttpSession hs = request.getSession(); %>
	<font size="7"><% out.print(hs.getAttribute("idMsg")); %></font>
	さんのマイページ
	<br><br>
	<a href="Logout">ログアウト</a>
</body>
</html>