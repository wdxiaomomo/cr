package com.halu.qq.cr.persistence.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.halu.qq.cr.persistence.dao.UserDao;
import com.halu.qq.cr.utils.SessionFactoryUtil;

@Repository
public class UserDaoImpl implements UserDao {
	private Session session;
	
	private Session getSession(){
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		return sessionFactory.getCurrentSession();
	}
}
