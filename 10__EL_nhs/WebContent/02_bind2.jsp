<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>2. bind2</h1>
<%
String xxx=(String)request.getAttribute("xxx");
String yyy=(String)session.getAttribute("yyy");
String zzz=(String)application.getAttribute("zzz");//ServletContext 
%>
일반 :<%=xxx %><br>
일반 : <%= yyy%><br>
일반 : <%= zzz%><br>
<hr>







EL request: ${request.xxx}<br><!-- 사용안됨-->
xxx:  ${xxx}<br>
yyy: ${yyy}<br> 
zzz: ${zzz}<br>
<hr>
EL : ${requestScope.xxx }<br><!-- 내장객체 이름이 다름  -->
EL : ${sessionScope.yyy }<br>
EL: ${applicationScope.zzz }<br>






</body>
</html>