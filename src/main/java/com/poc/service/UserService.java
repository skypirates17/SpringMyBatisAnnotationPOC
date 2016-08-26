package com.poc.service;

import com.poc.dto.DataTransferObject;


public interface UserService {
	public boolean insert(DataTransferObject dto);
	public DataTransferObject fetch(DataTransferObject dto);
	public boolean delete(DataTransferObject dto);
	public boolean update(DataTransferObject dto);
}
