<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>구구단</title>
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
<h1>GuGuDan</h1>
${param.dan}단
<p>
<c:forTokens var="result" 
  items="${result}" delims=",">
${result}<br>
</c:forTokens>
</p>
<p>
<c:forEach var= "result" items = "${result}">
${result}<br>
</c:forEach>
</p>
<p>
  ${result}
</p>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
