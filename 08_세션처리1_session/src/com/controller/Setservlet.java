package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Setservlet
 */
@WebServlet("/Setservlet")
public class Setservlet extends HttpServlet {
	
     
    public Setservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   //1.세션열기
		HttpSession session=request.getSession();
		//2.공유데이터 저장
		session.setAttribute("username", "홍길동");
		session.setAttribute("passwd", "1234");
		//response.sendRedirect("info.jsp");(응답처리 페이지)
		//servlet에서  html response부분이 모두 생략됨
        //단!!!!!!!response.sendRedirect로 화면처리위임  request.setAttribute한 데이터는 전달되지 않음
		response.sendRedirect("set.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
