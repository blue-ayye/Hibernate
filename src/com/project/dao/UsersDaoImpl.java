package com.project.dao;

import java.sql.Connection;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.entity.User;

public class UsersDaoImpl implements UsersDaoInterface {

	@Override
	public void saveUserEntity(User user) {
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
			session.save(user);
			session.getTransaction().commit();
			System.out.println("Success!");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();
		}

	}

	@Override
	public void getUserEntityById(int id) {
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

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();
		}
	}

	@Override
	public void updateUserEntity(User user) {
		System.out.println("UsersDaoImpl.updateUserEntityById()");
		SessionFactory sessionFactory = null;
		Session session = null;
		
		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(User.class);
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
			System.out.println("Updated!");
			System.out.println(user);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();
		}
		
	}
	

	@Override
	public void saveOrUpdateUserEntity(User user) {
		System.out.println("UsersDaoImpl.saveOrUpdateUserEntity()");
		SessionFactory sessionFactory = null;
		Session session = null;
		
		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(User.class);
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(user);
			session.getTransaction().commit();
			System.out.println("Updated!");
			System.out.println(user);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();
		}
	}

	@Override
	public void deleteUserEntityById(int id) {
		System.out.println("UsersDaoImpl.deleteUserEntityById()");
		SessionFactory sessionFactory = null;
		Session session = null;
		
		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(User.class);
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			User user = session.get(User.class, id);
			session.beginTransaction();
			session.delete(user);
			session.getTransaction().commit();
			System.out.println("Deleted!");
			System.out.println(user);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();
		}
	}

	@Override
	public void getUserEntities() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserEntities() {
		// TODO Auto-generated method stub
		
	}


}
