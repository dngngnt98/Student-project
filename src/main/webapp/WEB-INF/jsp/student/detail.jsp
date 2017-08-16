<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>학생관리</title>
  <jsp:include page="../corestyle.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../header.jsp"></jsp:include>
<h1>학생 조회</h1>
<form action='update.do' method='POST' enctype='multipart/form-data'>
학생번호:<input type='text' name='no' value='${student.no}' readonly><br>
이름:<input type='text' name='name' value='${student.name}'><br>
전화번호:<input type='text' name='tel' value='${student.tel}'><br>
e-mail:<input type='text' name='email' value='${student.email}'><br>
재직여부:<input type='text' name='workingYn' value='${student.workingYn}'><br>
최종학력:<input type='text' name='lastEducation' value='${student.lastEducation}'><br>
학교이름:<input type='text' name='schoolName' value='${student.schoolName}'><br>
사진1:<input type='file' name='photo'><br>
<div>
  <c:forEach items='${student.photoList}' var='path'>
  <img class='photo1' src='photo/${path}'>
  </c:forEach>
</div>
<button>변경</button>
<button type='button' onclick='doDelete()'>삭제</button>
<button type='button' onclick='doList()'>목록</button>
</form>
<script>
function doDelete() {
  location.href = 'delete.do?no=${student.no}'
}
function doList() {
  location.href = 'list.do'
}
</script>
<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
    