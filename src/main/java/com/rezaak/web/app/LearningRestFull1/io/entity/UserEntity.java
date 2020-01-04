package com.rezaak.web.app.LearningRestFull1.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name="users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 7080242158937380553L;
	
	@Id
	@GeneratedValue
	private long Id;
	
	@Column (nullable = false)
	private String userId;
	
	@Column (nullable = false, length= 50)
	private String firstName;
	
	@Column (nullable = false, length= 50)
	private String lastName;
	
	@Column (nullable = false, length= 150)
	private String email;
	
	@Column (nullable = false)
	private String encryptedPassword;
	
	private String emailVerificationToken;
	
	@Column (nullable = true, columnDefinition= "boolean default false")
	private Boolean emailVerificationStatus;

	
	
	//getters and setters
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}

	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}

	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}

	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	
	
	
}
