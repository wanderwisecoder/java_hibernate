package com.relationship.onetoone;

import javax.persistence.*;

@Entity
@Table(name = "emp_address")
public class EmpAdd {
	
@Id
private Integer id;

private String address;

@OneToOne(mappedBy = "address")
private EmpDetail emp;



public EmpDetail getEmp() {
	return emp;
}

public void setEmp(EmpDetail emp) {
	this.emp = emp;
}

public EmpAdd(Integer id, String address) {
	super();
	this.id = id;
	this.address = address;
}

public EmpAdd() {
	super();
	// TODO Auto-generated constructor stub
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "EmpAdd [id=" + id + ", address=" + address + ", emp=" + emp + "]";
}

	

}
