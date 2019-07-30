package nt.practice.HBOneToOne.domain;

import java.util.Set;

public class User {

	private int user_id;
	private String firstName;
	private String lastName;
	private String Address;
	private Set<PhoneNumber> phones; //to build one to many Association
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Set<PhoneNumber> getPhones() {
		return phones;
	}
	public void setPhones(Set<PhoneNumber> phones) {
		this.phones = phones;
	}
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", firstName=" + firstName + ", lastName=" + lastName + ", Address="
				+ Address + ", phones=" + phones + "]";
	}
	
	
	
	
	
	
} 
