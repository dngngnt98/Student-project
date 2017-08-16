<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>인사</title>
  <style>
    p{
      font-size: 45px;
      color: red;
    }
  </style>
  <jsp:include page="corestyle.jsp"></jsp:include>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1>더하기 연산</h1>
<p>

${param.a} + ${param.b} : ${result}
<%--
  ${param.a} + ${param.b} : ${param.a+param.b}
 --%>

<%--
  ${a} + ${b} : ${a + b} 
 --%>
</p>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
