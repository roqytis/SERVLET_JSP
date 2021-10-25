<%@page import="java.util.Arrays" %>
<%@page import="java.util.List" %>

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
 List<String> list=
 Arrays.asList("홍길동", "이순신","유관순");
 for(String s: list){
%>
이름: <%=s %><br>
<% } %>
<% String name="홍길동";
   String name2="abcd";
    if(name.equals("홍길동")){
	 %>
	 이름이 동일합니다.<%=name %> 입니다.
 <%}else{%>
    이름이 동일하지 않습니다. <%=name %>이 아닙니다. 
<%}%>
<% int sum=0;
    for(int i=0; i<11; i++){
        sum=sum+i;
%>
        sum : <%=sum %><br>
<%}%>
최종합계는 : <%= sum %>
</body>
</html>