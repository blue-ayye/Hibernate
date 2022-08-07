package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.entity.User;

public class UsersDaoImpl implements UsersDaoInterface {

	@Override
	public void saveUserEntity() {
		System.out.println("UsersDaoImpl.saveUserEntity()");
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(User.class);
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			User user = new User(6, "FirstName", "LastName", "my@email.com");
			session.save(user);
			session.getTransaction().commit();
			System.out.println("Success!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();
		}

	}

	@Override
	public void getUserEntityByID(int id) {
		System.out.println("UsersDaoImpl.getUserEntityByID()");
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(User.class);
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			User user = session.get(User.class, id);
			System.out.println("Success!");
			System.out.println(user);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();
		}
	}

}
