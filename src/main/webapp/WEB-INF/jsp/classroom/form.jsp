<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>강의실관리</title>
</head>
<body>
	<h1>강의실 등록</h1>
	<form action="add.do" method="POST" enctype="multipart/form-data">
		이름:<input type="text" name="name"><br>
		사진1:<input type="file" name="photo"><br>
		사진2:<input type="file" name="photo"><br>
		사진3:<input type="file" name="photo"><br>
		<button>등록</button>
	</form>

</body>
</html>