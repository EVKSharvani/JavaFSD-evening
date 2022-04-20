package com.simplillearn;


public class FlightDetails {
	private long fno;
	private String airline;
	private String src;
	private String des;
	private String[] days;

public FlightDetails() {
	
		
	}
public void setFno(long iD) {
	fno = iD;
}

public long getFno() {
	return fno;
}
public void setAirline(String airline) {
	this.airline = airline;
}
public void setSrc(String src) {
	this.src = src;
}
public void setDes(String des) {
	this.des = des;
}
public void setDays(String[] days) {
	this.days = days;
}



public String getAirline() {
	return airline;
}
public String getSrc() {
	return src;
}
public String getDes() {
	return des;
}
public String[] getDays() {
	return days;
}

}
