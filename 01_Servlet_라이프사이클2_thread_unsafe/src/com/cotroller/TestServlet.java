package com.cotroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	int membernum;//자동 0,멤버변수
	ArrayList<String>list=new ArrayList<String>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int localsize=10;
		membernum++;
		list.add("홍길동");
		System.out.println("doGet membernum  "+membernum);
		System.out.println("doGet list  "+list.size());
		System.out.println("doGet localsize  "+localsize);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

}
