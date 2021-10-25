package com.controller;

import java.io.IOException;

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
@WebServlet("/EmpUpdateServlet")
public class EmpUpdateServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String empno = request.getParameter("empno");
		String job = request.getParameter("job");
		String sal = request.getParameter("sal");

			EmpDTO dto = new EmpDTO();//set사용하여 필요한 데이터만 객체에 저장
			dto.setEmpno(Integer.parseInt(empno));
			dto.setJob(job);
			dto.setSal(Integer.parseInt(sal));
			
			EmpService biz = new EmpService();
			int num= biz.update(dto);
			System.out.println(num);
			//넘어가는 데이터 없음 
		    response.sendRedirect("EmpListServlet");
		//	response.sendRedirect("EmpRetriveServlet?empno="+empno);
		    
	}//end doPost
}//end class
