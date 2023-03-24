package com.inventory.model;

import java.util.Objects;

public class Admin {
	private int admin_id;
	private String admin_firstname;
	private String admin_lastname;
	private String admin_email;
	private long admin_contact;
	private String admin_password;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String admin_firstname, String admin_lastname, String admin_email, long admin_contact,
			String admin_password) {
		super();
		this.admin_firstname = admin_firstname;
		this.admin_lastname = admin_lastname;
		this.admin_email = admin_email;
		this.admin_contact = admin_contact;
		this.admin_password = admin_password;
	}
	public Admin(int admin_id, String admin_firstname, String admin_lastname, String admin_email, long admin_contact,
			String admin_password) {
		super();
		this.admin_id = admin_id;
		this.admin_firstname = admin_firstname;
		this.admin_lastname = admin_lastname;
		this.admin_email = admin_email;
		this.admin_contact = admin_contact;
		this.admin_password = admin_password;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_firstname() {
		return admin_firstname;
	}
	public void setAdmin_firstname(String admin_firstname) {
		this.admin_firstname = admin_firstname;
	}
	public String getAdmin_lastname() {
		return admin_lastname;
	}
	public void setAdmin_lastname(String admin_lastname) {
		this.admin_lastname = admin_lastname;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public long getAdmin_contact() {
		return admin_contact;
	}
	public void setAdmin_contact(long admin_contact) {
		this.admin_contact = admin_contact;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_firstname=" + admin_firstname + ", admin_lastname="
				+ admin_lastname + ", admin_email=" + admin_email + ", admin_contact=" + admin_contact
				+ ", admin_password=" + admin_password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(admin_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return admin_id == other.admin_id;
	}
	
	

}
