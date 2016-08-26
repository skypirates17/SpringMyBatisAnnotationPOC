package com.poc.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.poc.model.User;

@Repository
public interface UserMapper extends BaseDao{
	@Insert(INSERT_USER)
	public int insert(User user);
	
	@Select(SELECT_USER)
	public User fetch(User user);
	
	@Delete(DELETE_USER)
	public int delete(User user);
	
	@Update(UPDATE_USER)
	public int update(User user);
}
