<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>강의실관리</title>
  <jsp:include page="../corestyle.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../header.jsp"></jsp:include>
<h1>강의실 목록</h1>
<a href='form.do'>새강의실</a>
<table border='1'>
<thead>
  <tr><th>번호</th><th>이름</th></tr>
</thead>
<tbody>
<c:forEach items="${list}" var="item">
<tr>
  <td>${item.no}</td>
  <td><a href='detail.do?no=${item.no}'>${item.name}</a></td>
</tr>
</c:forEach>
</tbody>
</table>
<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
    