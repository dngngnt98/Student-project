<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>매니저관리</title>
</head>
<body>
	<h1>매니저 등록</h1>
	<form action="add.do" method="POST">
		이름:<input type="text" name="name"><br>
		전화번호:<input type="text" name="tel"><br>
		e-mail:<input type="text" name="email"><br>
		직위:<input type="text" name="position"><br>
		팩스:<input type="text" name="fax"><br>
		경로:<input type="text" name="path"><br>
		<button>등록</button>
	</form>
</body>
</html>