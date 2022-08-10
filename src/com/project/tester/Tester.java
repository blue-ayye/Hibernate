package com.project.tester;

import com.project.dao.UsersDaoImpl;
import com.project.dao.UsersDaoInterface;
import com.project.entity.User;

public class Tester {
	public static void main(String[] args) {
		UsersDaoInterface impl = new UsersDaoImpl();
		User user = new User("sarah", "jones", "s@gmail.com");
		impl.saveUserEntity(user);
//		impl.getUserEntityById(8);
//		impl.updateUserEntity(user);
//		impl.saveOrUpdateUserEntity(user);
//		impl.deleteUserEntityById(5);
//		impl.getUserEntities();
//		impl.deleteUserEntities();
	}
}
