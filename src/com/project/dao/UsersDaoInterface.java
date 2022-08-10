package com.project.dao;

import com.project.entity.User;

public interface UsersDaoInterface {
	void saveUserEntity(User user);
	void getUserEntityById(int id);
	void updateUserEntity(User user);
	void saveOrUpdateUserEntity(User user);
	void deleteUserEntityById(int id);
	void getUserEntities();
	void deleteUserEntities();
}
