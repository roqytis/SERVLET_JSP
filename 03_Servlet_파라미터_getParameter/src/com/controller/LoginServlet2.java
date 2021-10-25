package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet2 doget() 호출됨=====================");
		
		request.setCharacterEncoding("utf-8");
		
		String userid=request.getParameter("userid");
		String passwd=request.getParameter("passwd");
		System.out.println(userid+"\t"+passwd);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.print("<html><body>");
		out.print("login2<br>");

		out.print("이름은:"+userid);
		out.print("비번은:"+passwd);
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet dopost() 호출됨=====================");
	}
	public LoginServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
}
