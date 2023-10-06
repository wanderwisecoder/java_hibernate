package com.hibernate;

import javax.persistence.*;

@Entity
public class StudentClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String address;
	
	@Column(name = "college_name")
	
	private String collegename;
	
	@Column(name = "mail_id")
	private String email;
	
	public StudentClass() {
super();		
	}

	public StudentClass( String name, String address, String collegename, String email) {
		super();
		this.name = name;
		this.address = address;
		this.collegename = collegename;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentClass [id=" + id + ", name=" + name + ", address=" + address + ", collegename=" + collegename
				+ ", email=" + email + "]";
	}
	

}
