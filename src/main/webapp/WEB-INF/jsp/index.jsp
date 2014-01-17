<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 

<html>
<body>
	<h2>Hello World!</h2>
	<form action="/login" method="POST">
		로그인 : <input type="text" name="identifier"/>
		비밀번호 : <input type="password" name="password"/>
		
		<input type="submit" value="로그인"/>
	</form>
</body>
</html>
