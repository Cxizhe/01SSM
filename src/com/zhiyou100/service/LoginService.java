package com.zhiyou100.service;

import com.zhiyou100.model.User;

public interface LoginService {

	User findUserByLogin(String username, String password);
	
	//User findAll(String username,String password);
	

}
