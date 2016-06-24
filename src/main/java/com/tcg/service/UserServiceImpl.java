package com.tcg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tcg.model.Authorities;
import com.tcg.model.User;
import com.tcg.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private AuthService authService;
	
	public User getUserByUserName(String username)
	{
		return userRepo.findByUsername(username);
	}

	@Override
	public Boolean addUser(User user) {
		user.setPassword( new BCryptPasswordEncoder().encode( user.getPassword()) );
		
		user.setEnabled( 1 );
		
		User retUser = userRepo.save(user);
		if( retUser.equals( user ))
		{
			Authorities auth = new Authorities();
			auth.setAuthority("USER");
			auth.setUsername( user.getUsername() );
			auth.setUser(user);
			authService.addAuth(auth);
			
			return true;
		}
		return false;
	}
}
