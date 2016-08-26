package com.poc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.dao.UserMapper;
import com.poc.dto.DataTransferObject;
import com.poc.model.User;
import com.poc.service.UserService;

@Service
public class UserServiceImpl extends BaseService implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public boolean insert(DataTransferObject dto) {
		// TODO Auto-generated method stub	
		return resultChecker(userMapper.insert(dto.getUser()));
	}

	@Override
	public DataTransferObject fetch(DataTransferObject dto) {
		// TODO Auto-generated method stub
		DataTransferObject returnDTO = new DataTransferObject();
		List<User> user = userMapper.fetch(dto.getUser());
		returnDTO.setListUser(user);
		return returnDTO;
	}

	@Override
	public boolean delete(DataTransferObject dto) {
		// TODO Auto-generated method stub
		return resultChecker(userMapper.delete(dto.getUser()));
	}

	@Override
	public boolean update(DataTransferObject dto) {
		// TODO Auto-generated method stub
		return resultChecker(userMapper.update(dto.getUser()));
	}

}
