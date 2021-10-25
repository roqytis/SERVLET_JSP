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
String mesg=(String)request.getAttribute("request");
String mesg2=(String)session.getAttribute("session");
String mesg3=(String)application.getAttribute("aplication");
%>
<hr border="2">
1>><%= mesg %>
2>><%= mesg2 %>
3>><%= mesg3 %>

<hr>
request:<%=request.getAttribute("request") %>
session:<%=session.getAttribute("session") %>
application:<%=application.getAttribute("application") %>
</body>
</html>