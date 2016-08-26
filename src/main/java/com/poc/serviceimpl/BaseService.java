package com.poc.serviceimpl;

public class BaseService {
	
	/**
	 * checking of result from CRUD
	 * @param resultFlagger
	 * @return 
	 */
	public boolean resultChecker(int resultFlagger){
		boolean result;
		if(resultFlagger>0){
			result = true;
		}else{
			result = false;
		}
		return result;
	}
}
