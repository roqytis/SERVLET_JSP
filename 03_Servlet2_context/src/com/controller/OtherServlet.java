package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OtherServlet
 */
@WebServlet("/OtherServlet")
public class OtherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public OtherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("OtherServlet.doGet()==========");
		
		ServletContext ctx= getServletContext();
		String userid=ctx.getInitParameter("userid");
		String email=ctx.getInitParameter("email");
		System.out.println(userid+"\t"+email);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
