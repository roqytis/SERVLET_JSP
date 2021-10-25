package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {

	public List<EmpDTO> selectAll(SqlSession session) {
		// TODO Auto-generated method stub
		return session.selectList("com.emp.EmpMapper.selectAll");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int insertEmp(SqlSession session, EmpDTO emp) {
		int num= session.insert("com.emp.EmpMapper.insertTest", emp);
		return num;
	}
}
