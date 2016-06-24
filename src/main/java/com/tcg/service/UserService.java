package com.tcg.service;

import com.tcg.model.User;

public interface UserService {

	public User getUserByUserName(String username);
	public Boolean addUser(User user);
	
}
