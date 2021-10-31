package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue
	private int oid;
	private String orderedby;
	private int fid;
	private String fname;
	private int noofplates;
	private int costperplate;
	private int totalcost;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOrderedby() {
		return orderedby;
	}
	public void setOrderedby(String orderedby) {
		this.orderedby = orderedby;
	}
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
	public int getNoofplates() {
		return noofplates;
	}
	public void setNoofplates(int noofplates) {
		this.noofplates = noofplates;
	}
	public int getCostperplate() {
		return costperplate;
	}
	public void setCostperplate(int costperplate) {
		this.costperplate = costperplate;
	}
	public int getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}
	public Orders(int oid, String orderedby, int fid, String fname, int noofplates, int costperplate, int totalcost) {
		super();
		this.oid = oid;
		this.orderedby = orderedby;
		this.fid = fid;
		this.fname = fname;
		this.noofplates = noofplates;
		this.costperplate = costperplate;
		this.totalcost = totalcost;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
