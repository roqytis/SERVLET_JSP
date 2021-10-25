<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %><!-- import 명시적으로 적어주어야 함 -->
<%@ page import="java.util.ArrayList" %><!-- import 명시적으로 적어주어야 함 -->
<!--HTML주석  -->
<%-- jsp주석 --%>
<%!
  //declaration tag: 멤버변수/멤버함수 작성시 사용
  int num=10;
public void a(int tt){
	System.out.println("a======"+tt);
}

%>
<%
   //scriplet 에서 사용하는 코드는 
   //setvlet의 doget,dopost안의 코드로 적용됨
   Date d=new Date();//로컬변수
   ArrayList x=null;//로컬변수
   System.out.println(d);
   System.out.println(x);
   a(10);//멤버변수 호출
   
 //전체 코드는 아래 코드와 동일함 
	//   int num=10;
	// public void a(int tt){sysout(tt);}
	
	// public void doGet(req, res) {
//		Date d;   //로컬변수
//		ArrayList x;   //로컬변수
// 		a(10); //멤버함수 호출
//     }

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String str="홍길동";
System.out.println(str);
out.print(str);
%>
<%= str %>
<br>
<%=num %>
</body>
</html>