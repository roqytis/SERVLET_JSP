<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%-- EL 내장객체의 사용 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>연산기능</h1>
<% int x =11; %> 
<%= x  %>
<!-- el태그는 bind 객체(request,session등 )에 접근만 가능하며 일반 변수 사용이 안됨 : 주의 !!!!!!-->
x 일반변수  사용안됨=========   ${x}<br><!-- El태그  --><!-- bind 객체(request,session등 )에 접근만 가능하며 일반 변수 사용이 안됨 : 주의 !!!!!!-->
<!-- el 태그는 라이브러리 .jar 추가 없이 그냥 사용 가능 -->
${10+4}<br>
${10-4}<br>
${10/4}<br>
${10*4}<br>
<!--  -->

${10>=4}<br>
${10<=4}<br>
${10==4}<br>
${10!=4}<br>
<!-- 연산자 , 부등호 사용 가능  -->
${10!=4 && 4==4}<br>
</body>
</html>