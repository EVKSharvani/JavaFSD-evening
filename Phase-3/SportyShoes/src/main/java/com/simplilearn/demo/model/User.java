package com.simplilearn.demo.model;

import javax.persistence.*;
@Entity
@Table(name = "user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
  private long UID;
  @Column(name = "name")
  private String name;
  @Column(name = "email")
  private String email;
  @Column(name = "pwd")
  private String pwd;
  @Column(name = "address")
  private String address;
  
  
public User(String name, String email, String pwd, String address) {
    this.name = name;
    this.email = email;
    this.pwd = pwd;
    this.address = address;
  }
  // getters and setters

public User() {
}
public long getUID() {
	return UID;
}


public void setUID(long uID) {
	UID = uID;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPwd() {
	return pwd;
}


public void setPwd(String pwd) {
	this.pwd = pwd;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}
}