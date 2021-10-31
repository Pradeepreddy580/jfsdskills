package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
	@GeneratedValue
	private int tid;
	private int cid;
	private String name;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Topic(int tid, int cid, String name) {
		super();
		this.tid = tid;
		this.cid = cid;
		this.name = name;
	}
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
