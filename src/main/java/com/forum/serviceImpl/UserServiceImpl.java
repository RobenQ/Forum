package com.forum.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.bean.User;
import com.forum.mapper.UserMapper;
import com.forum.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper user;
	
	public User login(String name, String password) {
		return user.login(name, password);
	}

}
