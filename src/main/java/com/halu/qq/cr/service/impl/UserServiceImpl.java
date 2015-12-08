package com.halu.qq.cr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.halu.qq.cr.persistence.dao.UserDao;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserDao userDao;

}
