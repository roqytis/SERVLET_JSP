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
<c:if test="${xxx=='홍길동' }">홍길동이 맞음</c:if>

<c:choose>
     <c:when test="${xxx == '홍길동'}">홍길동임</c:when>
     <c:when test="${xxx == '이순신'}">이순신</c:when>
     <c:when test="${xxx == '유관순'}">유관순</c:when>
     <c:otherwise>자료가 없음</c:otherwise>
</c:choose>
</body>
</html>