<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//ここにJAVAコードを書ける
	out.write("abc");
%>

<!--
	以下構文は <?= $xy ?> と一緒
	変数の中身を出力してくれる。
	PHPなら <?php echo $xy ?> と一緒
 -->
<% request.getParameter("id"); %>
</body>
</html>