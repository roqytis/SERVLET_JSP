package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/myLogin")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("userid");
		String pw = request.getParameter("passwd");
		HttpSession session= request.getSession();
		session.setAttribute("id",id); session.setAttribute("pw",pw);
		response.sendRedirect("info2.jsp");
		/*
		 * request.setAttribute("id",id); request.setAttribute("pw",pw);
		 * RequestDispatcher dis= request.getRequestDispatcher("info.jsp");
		 * dis.forward(request, response);
		 */
		
		/*
		 * response.setContentType("text/html;charset=UTF-8"); PrintWriter out =
		 * response.getWriter(); out.print("<html>"); out.print("<body>"); String my =
		 * "이름은 "+id +" 이고 비밀번호는 " + pw;
		 * 
		 * 
		 * out.print(my); out.print("</body>"); out.print("</html>");
		 */
		
		
		
	}

}
