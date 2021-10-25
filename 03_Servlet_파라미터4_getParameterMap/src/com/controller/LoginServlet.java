package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget()");
		//post한글처리
		request.setCharacterEncoding("utf-8");
		//Map형태로 받기 
		Map<String,String[]> map= request.getParameterMap();//전체를 map으로
		//응답처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();
		out.print("<html><body>");
		Set<String> keys= map.keySet();//키만구하기
		for (String key : keys) {//키 하나 꺼내기 
			String[] values= map.get(key);   //키에 해당하는 value를 String[]로 받기 
			String mesg= "";
			for (String s : values) {  //배열 value의 갯수만큼 mesg에 추가 
				mesg+= s;
			}
			out.print(key+"======="+mesg+"<br>");  //name 하나당 출력문 작성 브라우저에 출력하기 
		}
		out.print("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	 public LoginServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

}
