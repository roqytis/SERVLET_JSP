package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestController
 */
@WebServlet("/TestController")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public TestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답 위임하여 request, session application에 담긴 내용이 전달되는지 테스트
		
		System.out.println("TestController.doGet");
		request.setAttribute("request", "홍길동");
		
		HttpSession session=request.getSession();
		session.setAttribute("session", "이순신");
		
		ServletContext ctx=getServletContext();
		ctx.setAttribute("application", "유관순");
		
		response.sendRedirect("hello.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
