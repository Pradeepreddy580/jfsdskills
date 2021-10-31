package com.klu.com.skill9;

public class Doctor {
	private String fullname;
	private String age;
	private String gender;
	private String graduationdetails;
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
	//190030061
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGraduationdetails() {
		return graduationdetails;
	}
	public void setGraduationdetails(String graduationdetails) {
		this.graduationdetails = graduationdetails;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String fullname, String age, String gender, String graduationdetails, String address) {
		super();
		this.fullname = fullname;
		this.age = age;
		this.gender = gender;
		this.graduationdetails = graduationdetails;
		this.address = address;
	}
	//190030061
	public String toString() {
		return "Full Name : "+this.getFullname()+", Age : "+this.getAge()+", Gender : "+this.getGender()+","
				+ " Graduation Details : "+this.getGraduationdetails()+", Address : "+this.getAddress();
	}
}







