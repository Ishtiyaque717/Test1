package com.hibernet;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "teacher_table")
public class Teacher {
	@Id @Column(name="Teacher_id") @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name="Teacher_name")
	String name;
	@Column(name="MobileNo:")
	String mob_no;
	@Column(name="E_mail")
	String email;
	@Column(name="Add_ress")
	String Address;
	@Column(name="Desig_nation")
	String designation;

	
	public int getId() {
		return id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob_no() {
		return mob_no;
	}

	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
