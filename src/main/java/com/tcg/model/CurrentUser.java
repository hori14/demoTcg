package com.tcg.model;

import lombok.Data;
import org.springframework.security.core.authority.AuthorityUtils;

@Data
public class CurrentUser extends org.springframework.security.core.userdetails.User{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4343265737489402052L;
	
	private User user;
	private Authorities auth;

	public CurrentUser(User user, Authorities auth)
	{
		super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList( auth.getAuthority() ) );
		this.user = user;
	}
	
	public User getUser()
	{
		return this.user;
	}
	
	public String getName()
	{
		return this.user.getUsername();
	}
	
	public String getRole()
	{
		return this.auth.getAuthority();
	}

}
