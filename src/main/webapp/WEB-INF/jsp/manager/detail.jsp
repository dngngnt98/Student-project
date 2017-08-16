<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>매니저관리</title>
  <jsp:include page="../corestyle.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../header.jsp"></jsp:include>
<h1>매니저 조회</h1>
<form action='update.do' method='POST' enctype='multipart/form-data'>
번호:<input type='text' name='no' value='${manager.no}' readonly><br>
이름:<input type='text' name='name' value='${manager.name}'><br>
전화:<input type='text' name='tel' value='${manager.tel}'><br>
이메일:<input type='text' name='email' value='${manager.email}'><br>
암호:<input type='password' name='password'><br>
직위:<input type='text' name='position' value='${manager.position}'><br>
팩스:<input type='text' name='fax' value='${manager.fax}'><br>
패스:<input type='path' name='path' value='${manager.path}'><br>
<button>변경</button>
<button type='button' onclick='doDelete()'>삭제</button>
<button type='button' onclick='doList()'>목록</button>
</form>
<script>
function doDelete() {
  location.href = 'delete.do?no=${manager.no}'
}
function doList() {
  location.href = 'list.do'
}
</script>
<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
    