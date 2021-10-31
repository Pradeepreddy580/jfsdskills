package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Food {
	
	@Id
	@GeneratedValue
	private int fid;
	private String fname;
	private int cost;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Food(int fid, String fname, int cost) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.cost = cost;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
