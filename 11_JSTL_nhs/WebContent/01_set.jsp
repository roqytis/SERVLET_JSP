<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--0. JSTL 사용   LIB폴더에 .JAR 두가지 포함되어 있어야 함   -->
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--1. JSTL 사용 :  CORE LIB사용하기위한선언  -->
      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>jstl core 태그의 사용</h1>
<c:if test="<%=true %>">aaa</c:if>
xxx:${xxx}<br>

<c:set var="aaa" value="${xxx}" scope="application"></c:set><!-- xxx= 홍길동   application.setAttribute("aaa", "홍길동")-->
<!-- EL태그사용 xxx를 bind하여 application에 aaa이름으로 set함 -->

이름: ${aaa}<br>
request의 이름:<c:out value="${xxx}"></c:out><br>
application의 이름: <c:out value="${aaa}"></c:out>
${xxx=='bbb'}<br>
</body>
</html>