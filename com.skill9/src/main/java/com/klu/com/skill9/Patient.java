package com.klu.com.skill9;

public class Patient {
	private String fullname;
	private String age;
	private String gender;
	private String previoushealthissue;
	private String address;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	//190030061
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPrevioushealthissue() {
		return previoushealthissue;
	}
	public void setPrevioushealthissue(String previoushealthissue) {
		this.previoushealthissue = previoushealthissue;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String fullname, String age, String gender, String previoushealthissue, String address) {
		super();
		this.fullname = fullname;
		this.age = age;
		this.gender = gender;
		this.previoushealthissue = previoushealthissue;
		this.address = address;
	}
	//190030061
	public String toString() {
		return "Full Name : "+this.getFullname()+", Age : "+this.getAge()+", Gender : "+this.getGender()+", Prevous Health Issues : "+this.getPrevioushealthissue()+", Address : "+this.getAddress();
	}
	
}
