<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
id는:<% 
out.print(request.getAttribute("id")); 
%><br>
비번은 : <% out.print(request.getAttribute("pw"));%>


</body>
</html>