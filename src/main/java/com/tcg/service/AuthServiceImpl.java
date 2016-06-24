package com.tcg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcg.model.Authorities;
import com.tcg.repository.AuthorityRepository;

@Service
public class AuthServiceImpl implements AuthService{

	@Autowired
	private AuthorityRepository authRepo;
	
	public Authorities getAuthByUserName(String username)
	{
		return authRepo.findByUsername(username);
	}
	
	public void addAuth(Authorities auth){
		authRepo.save(auth);
	}
}
