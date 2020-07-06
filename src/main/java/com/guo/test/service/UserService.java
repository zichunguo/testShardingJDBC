package com.guo.test.service;

import java.util.List;

import com.guo.test.bean.User;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
}
