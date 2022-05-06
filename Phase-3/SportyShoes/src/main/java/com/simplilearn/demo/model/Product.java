package com.simplilearn.demo.model;

import javax.persistence.*;
@Entity
@Table(name = "product")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
  private long PID;
  @Column(name = "CID")
  private long CID;
  @Column(name = "quantity")
  private String quantity;
  @Column(name = "price")
  private long price;
  @Column(name = "des")
  private String des;
  
  
public Product(long CID,String quantity,long price, String des) {
    this.CID = CID;
    this.quantity = quantity;
    this.price = price;
    this.des = des;
  }
  // getters and setters
public Product() {
}

public long getPID() {
	return PID;
}


public void setPID(long pID) {
	PID = pID;
}


public long getCID() {
	return CID;
}


public void setCID(long cID) {
	CID = cID;
}


public String getQuantity() {
	return quantity;
}


public void setQuantity(String quantity) {
	this.quantity = quantity;
}


public long getPrice() {
	return price;
}


public void setPrice(long price) {
	this.price = price;
}


public String getDes() {
	return des;
}


public void setDes(String des) {
	this.des = des;
}
}
