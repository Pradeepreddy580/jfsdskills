package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private int numberoftopics;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getNumberoftopics() {
		return numberoftopics;
	}
	public void setNumberoftopics(int numberoftopics) {
		this.numberoftopics = numberoftopics;
	}
	public Course(int cid, String cname, int numberoftopics) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.numberoftopics = numberoftopics;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
