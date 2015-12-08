package com.halu.qq.cr.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.halu.qq.cr.persistence.entity.BaseEntity;
import com.halu.qq.cr.persistence.entity.Family;

@Controller
public class BaseController {
	private static Logger logger = Logger.getLogger(BaseController.class);
	
	protected static String ctx;
	
	@RequestMapping("/")
	public Map<String, String> test(Map<String, String> model, HttpServletRequest request){
		return model;
	}
	
	public static void setCtx(HttpServletRequest request) {
		ctx = request.getContextPath();
	}
}
