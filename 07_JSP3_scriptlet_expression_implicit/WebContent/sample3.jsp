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
    String data= request.getParameter("aa");
    out.print(data);
    
    request.setAttribute("CCC", "ccc");
    session.setAttribute("AAA", "AAA");
    application.setAttribute("BBB", "BBb");
    out.print("홍길동");
%>

</body>
</html>