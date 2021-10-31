package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payments {
	@Id
	@GeneratedValue
	private int payid;
	private String paidby;
	private int totalamount;
	private Date datepaid;
	private int oid;
	
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPayid() {
		return payid;
	}
	public void setPayid(int payid) {
		this.payid = payid;
	}
	public String getPaidby() {
		return paidby;
	}
	public void setPaidby(String paidby) {
		this.paidby = paidby;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public Date getDatepaid() {
		return datepaid;
	}
	public void setDatepaid(Date datepaid) {
		this.datepaid = datepaid;
	}
	public Payments(int payid, String paidby, int totalamount, Date datepaid,int oid) {
		super();
		this.payid = payid;
		this.paidby = paidby;
		this.totalamount = totalamount;
		this.datepaid = datepaid;
		this.oid=oid;
	}
	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
