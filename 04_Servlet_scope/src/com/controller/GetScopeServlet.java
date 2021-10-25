package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/GetScopeServlet")
public class GetScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public GetScopeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.Request Scope에서 데이터 뽑기 //한번 쓰면 끝
		//String x=(String)request.getAttribute("request");
		//System.out.println("GetScopeServlet request===="+x);
		
		//2.세션에서 데이터 받기 //브라우저 끝날 때까지
		//HttpSession session=request.getSession();
		//String x2=(String)session.getAttribute("session");
		//System.out.println("getScopeServlet session====="+ x2);
		
	 //3. 어플리케이션 열기 //서버를 없앨때 까지 
		ServletContext ctx=getServletContext();
		String x3=(String)ctx.getAttribute("application");
		
		System.out.println("GetScopreServlet application ==="+x3);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
