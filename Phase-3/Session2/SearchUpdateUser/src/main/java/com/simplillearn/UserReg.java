package com.simplillearn;


public class UserReg {
	private long ID;
	private String fname;
	private String lname;
	private String email;
	private String pwd;
	private String phno;
public UserReg() {
	
		
	}
public void setID(long iD) {
	ID = iD;
}


public void setFname(String fname) {
	this.fname = fname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public void setEmail(String email) {
	this.email = email;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public void setPhno(String phno) {
	this.phno = phno;
}

public long getID() {
	return ID;
}

public String getFname() {
	return fname;
}
public String getLname() {
	return lname;
}
public String getEmail() {
	return email;
}
public String getPwd() {
	return pwd;
}
public String getPhno() {
	return phno;
}
}
