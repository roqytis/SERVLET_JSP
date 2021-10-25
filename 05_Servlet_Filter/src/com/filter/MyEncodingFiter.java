package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyEncodingFiter  implements Filter{
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("MyEncodingFiter.doFilter init");		
	}
	@Override
	public void destroy() {
		System.out.println("MyEncodingFiter.destory");		
	}
	@Override //이름 변경
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("MyEncodingFiter.doFilter  요청처리됨 ");
		//request 인코딩설정
		request.setCharacterEncoding("utf-8");//한글 선처리 함 
		chain.doFilter(request, response); //request와 response를 요청한 servlet으로 연결시켜줌 		
		System.out.println("MyEncodingFiter.doFilter응답");		
	}



}
