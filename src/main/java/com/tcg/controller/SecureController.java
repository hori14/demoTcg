package com.tcg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecureController {

	@RequestMapping("/")
	public String index()
	{
		return "hello";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
}
