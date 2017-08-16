<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>학생관리</title>
</head>
<body>
	<h1>학생 등록</h1>
	<form action="add.do" method="POST" enctype="multipart/form-data">
		이름:<input type="text" name="name"><br>
		전화번호:<input type="text" name="tel"><br>
		e-mail:<input type="text" name="email"><br>
		재직여부:<input type="text" name="workingYn"><br>
		최종학력:<input type="text" name="lastEducation"><br>
		학교이름:<input type="text" name="schoolName"><br>
		우편번호:<input type="text" name="postNumber"><br>
		기본주소:<input type="text" name="primaryAddress"><br>
		상세주소:<input type="text" name="detailAddress"><br>
		사진1:<input type="file" name="photo"><br>
		<button>등록</button>
	</form>
</body>
</html>