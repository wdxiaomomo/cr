package com.halu.qq.cr.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.halu.qq.cr.persistence.entity.User;
import com.halu.qq.cr.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(){
		return "retister";
	}
	
	public String register(User user, HttpServletRequest request){
		return "redirect:/";
	}
	
}
