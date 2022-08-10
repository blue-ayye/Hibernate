package com.project.tester;

import com.project.dao.UsersDaoImpl;
import com.project.dao.UsersDaoInterface;
import com.project.entity.User;

public class Tester {
	public static void main(String[] args) {
		UsersDaoInterface impl = new UsersDaoImpl();
		User user = new User("sarah", "jones", "s@gmail.com");
		User userUpdate = new User(23, "new hehe", "last name", "new@email.com");
//		impl.saveUserEntity(user);
//		impl.getUserEntityById(8);
//		impl.updateUserEntity(userUpdate);
//		impl.saveOrUpdateUserEntity(userUpdate);
//		impl.deleteUserEntityById(8);
//		impl.getUserEntities();
//		impl.deleteUserEntities();
	}
}
