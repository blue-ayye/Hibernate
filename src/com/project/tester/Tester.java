package com.project.tester;

import com.project.dao.UsersDaoImpl;
import com.project.dao.UsersDaoInterface;

public class Tester {
	public static void main(String[] args) {
		UsersDaoInterface impl = new UsersDaoImpl();
//		impl.saveUserEntity();
		impl.getUserEntityByID(10);
	}
}
