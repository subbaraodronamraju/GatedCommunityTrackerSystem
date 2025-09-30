package com.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_info")
public class User {
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name = "user_email")
	private String userEmail;
	
	
	@Column(name="user_password")
	private String userPassword;
	
	
	
	

	public User() {
	
	}



	public User(int userId, String userName, String userEmail,String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail=userEmail;
		this.userPassword = userPassword;
	}



	public User(String userName, String userEmail,String userPassword) {
		super();
		this.userName = userName;
		this.userEmail=userEmail;
		this.userPassword = userPassword;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}

    public String getUserEmail() {
	return userEmail;
    }
    public void setUserEmail(String userEmail) {
	this.userEmail=userEmail;
    }

	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + "]";
	}



	
	

}
