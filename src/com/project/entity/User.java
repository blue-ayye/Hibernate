package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
@Entity
public class User {
	
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "F_NAME")
	private String firstName;
	@Column(name = "L_NAME")
	private String lastName;
	@Column(name = "EMAIL")
	private String email;

	public User() {
		super();
		System.out.println("UserEntity.UserEntity()");
	}
	
	public User(int id, String firstName, String lastName, String email) {
		super();
		System.out.println("UserEntity.UserEntity()");
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}

}
