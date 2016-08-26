package com.poc.dao;

public interface BaseDao {
	
	//	Queries for UserMapper
	static final String INSERT_USER = "INSERT INTO student_info (student_name,student_age,student_address) " +
			"VALUES (#{name}, #{age} ,#{address})";
	
	static final String UPDATE_USER = "UPDATE student_info SET "+
			"student_name = #{name}"+
			",student_age = #{age}"+
			",student_address = #{address}"+
			"WHERE student_id = #{id}";
	
	static final String DELETE_USER = "delete from student_info WHERE student_id = #{id}";
	
	static final String SELECT_USER = "select student_name as name, student_age as age,student_address as address from student_info where "+
			"student_id = #{id}";
	//	Queries for UserMapper
	
}
