package com.simplilearn.demo.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "orders")
public class Orders {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orders_generator")
  private long OID;
  @Column(name = "PID")
  private long PID;
  @Column(name = "UID")
  private long UID;
  @Column(name = "amount")
  private long amount;
  @Column(name = "date_added")
  private Date date_added;
  
  public Orders() {
  }
  
public Orders(long OID,long PID, long UID, long amount,Date date_added) {
    this.OID = OID;
    this.PID = PID;
    this.UID= UID;
    this.amount=amount;
    this.date_added=date_added;
  }
  // getters and setters

public long getOID() {
	return OID;
}

public void setOID(long oID) {
	OID = oID;
}

public long getPID() {
	return PID;
}

public void setPID(long pID) {
	PID = pID;
}

public long getUID() {
	return UID;
}

public void setUID(long uID) {
	UID = uID;
}

public long getAmount() {
	return amount;
}

public void setAmount(long amount) {
	this.amount = amount;
}

public Date getDate_added() {
	return date_added;
}

public void setDate_added(Date date_added) {
	this.date_added = date_added;
}
}
