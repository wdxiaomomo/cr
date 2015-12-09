package com.halu.qq.cr.utils;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SessionFactoryUtil {
	@Autowired
	private static SessionFactory sessionFactory;
	private static SessionFactoryUtil instance = new SessionFactoryUtil();

	public static SessionFactoryUtil getInstance(){
		return instance;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		SessionFactoryUtil.sessionFactory = sessionFactory;
	}
}
