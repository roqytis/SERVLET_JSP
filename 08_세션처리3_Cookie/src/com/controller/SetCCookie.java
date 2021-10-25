package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCCookie
 */
@WebServlet("/SetCCookie")
public class SetCCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SetCCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.쿠키생성
				Cookie c= new Cookie("username", "홍길동");//한개의 쿠키생성
				//2.작업 후 응답에 쿠키 시간 설정 후 추가
				c.setMaxAge(60*60*24);
				response.addCookie(c);//사용자에게 생성한 쿠기 전송, 저장
				System.out.println("쿠키담기 성공");

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
