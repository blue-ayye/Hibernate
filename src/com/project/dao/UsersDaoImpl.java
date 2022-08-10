package com.project.dao;

import java.sql.Connection;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.project.connection.SessionFactoryProvider;
import com.project.entity.User;

public class UsersDaoImpl implements UsersDaoInterface {

	@Override
	public void saveUserEntity(User user) {
		System.out.println("UsersDaoImpl.saveUserEntity()");
		Session session = null;

		try {
			session = SessionFactoryProvider.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("Success!");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

	}

	@Override
	public void getUserEntityById(int id) {
		System.out.println("UsersDaoImpl.getUserEntityByID()");
		Session session = null;

		try {
			session = SessionFactoryProvider.getSessionFactory().openSession();
			session.beginTransaction();
			User user = session.get(User.class, id);
			System.out.println("Success!");
			System.out.println(user);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void updateUserEntity(User user) {
		System.out.println("UsersDaoImpl.updateUserEntityById()");
		Session session = null;

		try {
			session = SessionFactoryProvider.getSessionFactory().openSession();
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
		}

	}

	@Override
	public void saveOrUpdateUserEntity(User user) {
		System.out.println("UsersDaoImpl.saveOrUpdateUserEntity()");
		Session session = null;

		try {
			session = SessionFactoryProvider.getSessionFactory().openSession();
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
		}
	}

	@Override
	public void deleteUserEntityById(int id) {
		System.out.println("UsersDaoImpl.deleteUserEntityById()");
		Session session = null;

		try {
			session = SessionFactoryProvider.getSessionFactory().openSession();
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
		}
	}

	@Override
	public void getUserEntities() {
		System.out.println("UsersDaoImpl.getUserEntities()");
		Session session = null;

		try {
			session = SessionFactoryProvider.getSessionFactory().openSession();
			String hqlQuery = "from User";
			Query<?> query = session.createQuery(hqlQuery);
			List<?> userEntities = query.list();
			System.out.println(userEntities);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void deleteUserEntities() {
		System.out.println("UsersDaoImpl.deleteUserEntities()");
		Session session = null;

		try {
			session = SessionFactoryProvider.getSessionFactory().openSession();
			String hqlQuery = "from User";
			Query<User> query = session.createQuery(hqlQuery);
			List<User> userEntities = query.list();
			int numberOfUsers = userEntities.size();
			session.beginTransaction();
			for (User user : userEntities) {
				session.delete(user);
			}
			session.getTransaction().commit();
			System.out.println("Deleted " + numberOfUsers + " number of users");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
