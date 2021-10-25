package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;

/**
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * HttpSession session =request.getSession(); Enumeration<String> key=
		 * session.getAttributeNames();// 세션에 저장된 key 값만 꺼내옴
		 * request.setCharacterEncoding("utf-8");
		 * response.setContentType("text/html;charset=utf-8"); PrintWriter out=
		 * response.getWriter();
		 * out.print("<html><head><title>상품입력결과</title></head><body>"); String
		 * my="<table border='1'>";
		 * my+="<tr><td>상품아이디</td><td>상품명</td><td>갯수</td></tr>";
		 * while(key.hasMoreElements()) { //키가 더 있는지? String id= key.nextElement(); //키
		 * 하나 받아오기 Product p=(Product)session.getAttribute(id); //key 에 해당하는 value꺼내기
		 * 형변환주의 my+="<tr><td>"+p.getId()+"</td>"; my+="<td>"+p.getName()+"</td>"; my+=
		 * "<td>"+p.getAmount()+"</td>"; my+="</tr>"; } my+="</table>"; //표만들기
		 * 
		 * out.print(my);// 표출력
		 * out.print("<a href='productForm.html'>등록화면보기</a><br>");// 표출력
		 * out.print("</body></html>");
		 */
		//response.sendRedirect("productList.jsp");
	    request.setAttribute("ppp", new Product("p","p",100));
		RequestDispatcher dis= request.getRequestDispatcher("productList.jsp");
	   dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
