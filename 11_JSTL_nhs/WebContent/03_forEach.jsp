<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>jstl core태그의 사용--forEach</h1>
<h1>forEach3: c: forTokens</h1>
<c:forTokens var="x" items="${yyy}" delims="/">
   ${x}<br>
</c:forTokens>

<h1>forEach3 : range</h1>
<c:forEach var="x" begin="0" end="5" step="2">
>>>>>>>${x }<br>
 </c:forEach>
 
 <c:forEach var="x" begin="1" end="5" >
 hello: ${x }
 </c:forEach>
 
 <h1>forEach2: Status</h1>
 <c:forEach var="person" items="${xxx}" varStatus="status">
  index:${status.index}<br>
  count:${status.count}<br>
  current:${status.current}<br>
  first:${status.first}<br>
  last:${status.last}<br>
 ${person.username }: ${person.age }<br>
 </c:forEach>
 
 <h1>foreach1</h1>
 <c:forEach var="p" items="${xxx}">
 ${p.username }<br>
 ${p.age}<br>
 </c:forEach>
 
 <br>
</body>
</html>