package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/productReg")
public class ProductRegistrationServlet extends HttpServlet {

	private HashMap<String, Product> products = new HashMap<String, Product>();//멤버변수

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title>상품입력결과</title></head><body>");
		out.println("<b>상품입력 결과</b><hr/>");	
		try{//폼데이터 파싱 
			String name=request.getParameter("name");
			String id=request.getParameter("id");
			int amount=Integer.parseInt(request.getParameter("amount"));
			
			Product temp=products.get(id);//id로 맵에서  Product꺼내기 - 상품 검사
			if(temp==null){//id에 해당 상품이 없음 , 맵에 id를 키값으로 put 
				temp=new Product(name, id, amount);
				products.put(id, temp);
			}else{// not null, 
				temp.setAmount(temp.getAmount()+amount);//수량증가 
			}
				
			out.println("<table border='1'>");		
			out.println("<tr><th>상품명</th><th>상품아이디</th><th>수량</th></tr>");
			for(Product p : products.values()){//한 상품당 하나의 tr태그 작성  맵에서 하나의 value값 꺼내기 
				//products.values()  : map에서 value 값만 모두 가져옴 
				out.println("<tr>");
				out.println("<td>"+p.getName()+"</td><td>"+p.getId()+"</td><td>"+p.getAmount()+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		}catch(Exception e){
			out.println("입력항목을 확인해 주세요!<br/>");
		}
		out.println("<a href='productForm.html'>상품 입력하기</a>");
		out.println("</body></html>");
	}

}
