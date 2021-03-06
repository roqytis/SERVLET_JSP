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
 * Servlet implementation class SetScopeServlet
 */
@WebServlet("/SetScopeServlet")
public class SetScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public SetScopeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //1.request객체에 key"request",홍길동 설정
		//Request scope
		//request.setAttribute("request", "홍길동");
		
		//2.Sesstion Scope에 저장
		//HttpSession session=request.getSession();
		//session.setAttribute("session", "이순신");
		
		//3.application scope에 저장
		ServletContext ctx=getServletContext();
		ctx.setAttribute("application", "윤관순");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
