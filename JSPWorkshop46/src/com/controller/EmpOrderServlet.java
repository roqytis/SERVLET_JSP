package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;
/**
 * Servlet implementation class EMPInsertServlet
 */
@WebServlet("/EmpOrderServlet")
public class EmpOrderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String order = request.getParameter("order");

		EmpService service = new EmpService();
		List<EmpDTO> list = null;

			list = service.order(order);//asc, desc값 

			request.setAttribute("order", order);  //정렬방법
			request.setAttribute("list", list);//정렬 된 사원정보

	RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
	dis.forward(request, response);
	}//end doPost
}//end class
