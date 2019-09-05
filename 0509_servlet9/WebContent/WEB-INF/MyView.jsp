<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="MyServlet?id=aa&name=あいう">MyServlet</a>

	<form action="MyServlet" method="get">
		<input type="hidden" name="id" value="cc" />
		<input type="hidden" name="name" value="dd" />
		<input type="submit" />
	</form>

	<form action="MyServlet" method="post">
		<input type="hidden" name="id" value="ee" />
		<input type="hidden" name="name" value="ff" />
		<input type="submit" />
	</form>

	<%
		//java
	%>

	<%
		for(int i=0;i<10;i++){
			//outは暗黙変数
			//※暗黙変数・・・暗黙的に使える変数
			out.write(String.valueOf(i));
		}

		//HTTPリクエストパラメータの取得
		//PHPの$_GET["ID"] $_POST["id"]
		out.write(request.getParameter("id"));
		out.write(request.getParameter("name"));
		//->javaでは、GET?POSTの差を意識する必要がない。
		//$_REQUEST["id"]だね
	%>

	<p><%= request.getParameter("id") %></p>

	<% request.getAttribute("new_id"); %>
	<% request.getAttribute("new_name"); %>

	<%
		String new_id = String.valueOf(request.getAttribute("new_id"));
	%>
</body>
</html>