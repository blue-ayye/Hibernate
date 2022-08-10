package com.project.connection;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
	
	private static SessionFactory sessionFactory = null;

	static {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("Session Factory Created: " + sessionFactory.getClass());
	}
	
	public static SessionFactory getSessionFactory() {
		System.out.println("ConnectionProvider.getSessionFactory()");
		return sessionFactory;
	}
}
