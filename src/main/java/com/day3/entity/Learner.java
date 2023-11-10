package com.day3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Learner_details")
public class Learner {
	
	@Id
	private int lId;
	private String lname;
	private String lcity;
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Learner(int lId, String lname, String lcity) {
		super();
		this.lId = lId;
		this.lname = lname;
		this.lcity = lcity;
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLcity() {
		return lcity;
	}
	public void setLcity(String lcity) {
		this.lcity = lcity;
	}
	@Override
	public String toString() {
		return "Learner [lId=" + lId + ", lname=" + lname + ", lcity=" + lcity + "]";
	}
	
	

}
