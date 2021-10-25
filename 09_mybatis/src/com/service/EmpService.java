package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {

		EmpDAO dao;

		public EmpService() {
			super();
			dao= new EmpDAO();
		}
		
		public List<EmpDTO> selectAll(){
			SqlSession session= MySqlSessionFactory.getSession();
			List<EmpDTO> list = null;
			try {
				list = dao.selectAll(session);
			}finally {
				session.close();
			}
			return list;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		public int insertEmp(EmpDTO emp) {
			SqlSession session= MySqlSessionFactory.getSession();
			int num=0;
			try {
				num = dao.insertEmp(session, emp);
			}finally {
				session.close();
			}
			return num;
		}
}
