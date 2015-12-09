package com.halu.qq.cr.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.halu.qq.cr.persistence.entity.User;
import com.halu.qq.cr.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	//@Autowired
	//private UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Map<String, String> model){
		model.put("ctx", ctx);
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(Map<String, String> model, User user, HttpServletRequest request){
		return "redirect:/";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Map<String, String> model){
		model.put("ctx", ctx);
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Map<String, String> model, User user, HttpServletRequest request){
		return "redirect:/";
	}
	
}
