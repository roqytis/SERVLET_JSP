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
   request.setAttribute("xxx", "홍길동");
%>
first.jsp<br>
아래화면은 top.jsp를 jsp:include 시킨 내용입니다.<br>
<hr>
<jsp:include page="include/top.jsp" flush="true"/><br>
<!-- flush true는 버퍼링 없이 데이터가 변경되면 include된 파일에 바로 반영시킴 -->
<hr>

다시 first.jsp내용입니다. 
</body>
</html>