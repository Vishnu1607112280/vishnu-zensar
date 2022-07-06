package com.zensar.springbootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class User {

	@Id
	private int UserId;
	private String UserName;
	private String Password;
	private String Roles;

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRoles() {
		return Roles;
	}

	public void setRoles(String roles) {
		Roles = roles;
	}
	
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", Password=" + Password + ", Roles=" + Roles
				+ "]";
	}

}
