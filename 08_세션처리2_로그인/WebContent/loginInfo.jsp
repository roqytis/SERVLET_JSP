<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   String userid=(String)session.getAttribute("userid");
%>
<h1>로그인</h1>
안녕하세요.<%= userid %>님 좋은 하루 되세요<br>
<a href="LoginInfoServlet">회원정보-mypage</a>
</body>
</html>