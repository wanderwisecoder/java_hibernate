package com.relationship.onetoone;

import javax.persistence.*;



@Entity
@Table(name = "emp_detail1")
public class EmpDetail {
	
@Id
private Integer id;

@Column(name = "name", nullable = false)
private String emp_name;

@OneToOne
private EmpAdd address;



public EmpDetail() {
	super();
	// TODO Auto-generated constructor stub
}



public EmpDetail(Integer id, String emp_name, EmpAdd address) {
	super();
	this.id = id;
	this.emp_name = emp_name;
	this.address = address;
}



public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getEmp_name() {
	return emp_name;
}

public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}

public EmpAdd getAddress() {
	return address;
}

public void setAddress(EmpAdd address) {
	this.address = address;
}



@Override
public String toString() {
	return "EmpDetail [id=" + id + ", emp_name=" + emp_name + ", address=" + address + "]";
}






}
