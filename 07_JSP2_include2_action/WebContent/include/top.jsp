<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! int num=10; %>  <%--멤버변수 선언 서블릿의 멤버변수 선언과 동일 --%>
<%
//top.jsp는 first.jsp에 포함된 코드 html body코드가 바짐
//main.jsp에서 사용한 request를 재사용함
//mesgs는 doget의 로컬 변수가 됨

String mesg=(String)request.getAttribute("xxx");
%>
<h1 style="color:red;">
top.jsp 안녕하세요? mesg===<%=mesg %>
멤버변수num값 출력===<%=num %></h1> <!-- out.print(num) -->