package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	
    
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("TestServlet.doget()===================");
		    
		    //1.reponse에서PrintWriter열기
		    response.setContentType("text/html; charset=UTF-8");
		 
		    //2.response에서 PrinWriter열기
		    		PrintWriter out=response.getWriter();
		    
		    		//3.print사용 문자열로 html 작성
		    		out.print("<html><body>");
		    		out.print("<h1>서블릿응답처리</h1>");
		    		out.print("<p>Hello world</p>");
		    		out.print("<a href='test.html'>html 가기</a><br>");
		    		out.print("</body></html>");
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
