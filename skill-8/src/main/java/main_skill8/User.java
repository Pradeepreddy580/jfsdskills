package main_skill8;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	private long collegeId;
	private String fullName;
	private String email;
	private String eventRegisteredFor;
	private int eventId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEventRegisteredFor() {
		return eventRegisteredFor;
	}
	public void setEventRegisteredFor(String eventRegisteredFor) {
		this.eventRegisteredFor = eventRegisteredFor;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, long collegeId, String fullName, String email, String eventRegisteredFor, int eventId) {
		super();
		this.id = id;
		this.collegeId = collegeId;
		this.fullName = fullName;
		this.email = email;
		this.eventRegisteredFor = eventRegisteredFor;
		this.eventId = eventId;
	}
	
	
	
	
}
