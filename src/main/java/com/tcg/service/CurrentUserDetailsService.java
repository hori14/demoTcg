package com.tcg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcg.model.Authorities;
import com.tcg.model.CurrentUser;
import com.tcg.model.User;

@Service
public class CurrentUserDetailsService implements UserDetailsService {

    private final UserService userService;
    private final AuthService authService;
    
    @Autowired
    public CurrentUserDetailsService(UserService userService, AuthService authService){
    	this.userService = userService;
    	this.authService = authService;
    }

	@Override
	public CurrentUser loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userService.getUserByUserName(username);
		Authorities auth = authService.getAuthByUserName(username);
		
		return new CurrentUser(user, auth);
	}
	
}