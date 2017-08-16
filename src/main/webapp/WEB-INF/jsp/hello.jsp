<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>인사</title>
  <jsp:include page="corestyle.jsp"></jsp:include>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1>인사하기</h1>
<p>${message}</p>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
