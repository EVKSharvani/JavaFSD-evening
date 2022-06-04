package com.simplilearn.demo;

public class User {
	private long ID;
	private String name;
	private String pwd;
	private String role;
	
	public User() {
		 
		
	}
	 public long getID() {return this.ID; }
   
     
     public void setID(long id) { this.ID = id;}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}