package com.simplillearn;


public class Journey1 {
	private long id;
	private String date;
	private String froms;
	private String tos;
	private long num;
	private long user;
	

public Journey1() {
	
		
	}
public void setId(long iD) {
	id = iD;
}
public long getId() {
	return id;
}
public void setUser(long user) {
	this.user = user;
}
public long getUser() {
	return user;
}
public void setDate(String date) {
	this.date = date;
}
public void setFroms(String froms) {
	this.froms = froms;
}
public void setTos(String tos) {
	this.tos = tos;
}

public String getDate() {
	return date;
}
public String getFroms() {
	return froms;
}
public String getTos() {
	return tos;
}
public void setNum(long num) {
	this.num = num;
}
public long getNum() {
	return num;
}
}
