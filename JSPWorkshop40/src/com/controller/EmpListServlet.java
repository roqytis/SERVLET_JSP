package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//요청을 받아서 데이터 가져오기
		EmpService service = new EmpService();
		List<EmpDTO> list = service.select();
		System.out.println(list);
		//list를 list란 키로 request에 담기  list.jsp로 처리 위임
		//list.jsp 데이터를 get 후 sysout으로 확인까지 
		
		request.setAttribute("list", list);
		//forward
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request, response);
		
	}

}
