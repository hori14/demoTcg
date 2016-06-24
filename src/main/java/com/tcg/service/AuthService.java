package com.tcg.service;

import com.tcg.model.Authorities;

public interface AuthService {

	public Authorities getAuthByUserName(String username);
	public void addAuth(Authorities auth);
}
