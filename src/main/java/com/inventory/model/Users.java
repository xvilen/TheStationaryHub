package com.inventory.model;

import java.util.Objects;

public class Users {
	private int user_id;
	private String user_firstName;
	private String user_lastName;
	private String user_email;
	private long user_contact;
	private String user_address;
	private String user_password;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String user_firstName, String user_lastName, String user_email, long user_contact, String user_address,
			String user_password) {
		super();
		this.user_firstName = user_firstName;
		this.user_lastName = user_lastName;
		this.user_email = user_email;
		this.user_contact = user_contact;
		this.user_address = user_address;
		this.user_password = user_password;
	}

	public Users(int user_id, String user_firstName, String user_lastName, String user_email, long user_contact,
			String user_address, String user_password) {
		super();
		this.user_id = user_id;
		this.user_firstName = user_firstName;
		this.user_lastName = user_lastName;
		this.user_email = user_email;
		this.user_contact = user_contact;
		this.user_address = user_address;
		this.user_password = user_password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_firstName() {
		return user_firstName;
	}

	public void setUser_firstName(String user_firstName) {
		this.user_firstName = user_firstName;
	}

	public String getUser_lastName() {
		return user_lastName;
	}

	public void setUser_lastName(String user_lastName) {
		this.user_lastName = user_lastName;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public long getUser_contact() {
		return user_contact;
	}

	public void setUser_contact(long user_contact) {
		this.user_contact = user_contact;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_firstName=" + user_firstName + ", user_lastName=" + user_lastName
				+ ", user_email=" + user_email + ", user_contact=" + user_contact + ", user_address=" + user_address
				+ ", user_password=" + user_password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return user_id == other.user_id;
	}
	
 
}
