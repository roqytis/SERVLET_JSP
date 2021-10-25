
<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
  String prodId=request.getParameter("prodId");
  MyProductService service=new MyProductService();
  int n= service.delete(prodId);
  System.out.println("삭제갯수"+n);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String mesg =prodId + "상품삭제 성공";
if(n!=1){
	mesg =prodId + "상푸삭제 실패";
}
out.print(mesg);
%>
<br>
<a href="ListProduct.jsp">목록보기</a>
</body>
</html>