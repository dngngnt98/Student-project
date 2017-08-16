<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>학생 관리</title>
  <jsp:include page="../corestyle.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../header.jsp"></jsp:include>
<h1>학생 목록</h1>
<a href='form.do'>새학생</a>
<!-- class='type09' -->
<table class='type09'>
<thead>
  <tr>
  <th scope="cols">학생번호</th>
  <th scope="cols">이름</th>
  <th scope="cols">재직여부</th>
  </tr>
</thead>
<tbody>
<c:forEach items="${list}" var="item">
<tr>
  <td>${item.no}</td>
  <td><a href='detail.do?no=${item.no}'>${item.name}</a></td>
  <td>${item.workingYn}</td>
</tr>
</c:forEach>
</tbody>
</table>
<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
    