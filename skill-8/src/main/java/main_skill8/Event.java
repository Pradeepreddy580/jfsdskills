package main_skill8;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {
	@Id
	@GeneratedValue
	private int id;
	private String eventName;
	private String conductedBy;
	private int numberOfUsersRegistered;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getConductedBy() {
		return conductedBy;
	}
	public void setConductedBy(String conductedBy) {
		this.conductedBy = conductedBy;
	}
	public int getNumberOfUsersRegistered() {
		return numberOfUsersRegistered;
	}
	public void setNumberOfUsersRegistered(int numberOfUsersRegistered) {
		this.numberOfUsersRegistered = numberOfUsersRegistered;
	}
	public Event(int id, String eventName, String conductedBy, int numberOfUsersRegistered) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.conductedBy = conductedBy;
		this.numberOfUsersRegistered = numberOfUsersRegistered;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
