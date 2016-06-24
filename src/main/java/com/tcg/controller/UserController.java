package com.tcg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcg.model.User;
import com.tcg.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/create", method=RequestMethod.POST)
	@ResponseBody
	public Boolean createUser(User user){
		System.out.println( user );
		return userService.addUser(user);
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String createUserView(){
		return "create";
	}
}
