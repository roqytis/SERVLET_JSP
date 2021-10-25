package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;

/**
 * Servlet implementation class ProductAddServlet
 */
@WebServlet("/ProductAddServlet")
public class ProductAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ProductAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name= request.getParameter("name");
		String id= request.getParameter("id");
		int amount = Integer.parseInt(request.getParameter("amount"));
		
		HttpSession session = request.getSession();
		Product p= (Product)session.getAttribute(id);//-- 형변환 주의 
		if(p==null) {//없는 경우
			p= new Product(name, id, amount);
			session.setAttribute(id, p);		// 상품의 id로 session에 등록			
		}else{//있는 경우 
			p.setAmount(p.getAmount()+amount);  //수량증가
		}
		
		 response.sendRedirect("productAdd.jsp");//페이지 이동
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
