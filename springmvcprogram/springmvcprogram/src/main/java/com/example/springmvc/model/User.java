package com.example.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
@Column(name="user_id")
private int id;
	@Column(name="user_name")
private String userName;
private String password;
public User(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}
@Column(name="user_type")


private String userType;
@Column(name="email")
private String e_mail;
@Column(name="mobile_number")
private String mobileNumber;
//private boolean confirmed;
public User() {
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getE_mail() {
	return e_mail;
}
public void setE_mail(String e_mail) {
	this.e_mail = e_mail;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
/*public boolean isConfirmed() {
	return confirmed;
}
public void setConfirmed(boolean confirmed) {
	this.confirmed = confirmed;
}*/

public User(int id, String userName, String password, String userType, String e_mail, String mobileNumber) {
	super();
	this.id = id;
	this.userName = userName;
	this.password = password;
	this.userType = userType;
	this.e_mail = e_mail;
	this.mobileNumber = mobileNumber;
}

@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userType=" + userType
			+ ", e_mail=" + e_mail + ", mobileNumber=" + mobileNumber + "]";
}

/*@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userType=" + userType
			+ ", e_mail=" + e_mail + ", mobileNumber=" + mobileNumber + ", confirmed=" + confirmed + "]";
}*/


}
