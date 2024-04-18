package com.example.school.entity;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="tb_user_arivu_schoolmens")

public class SchoolMens {
	
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name ="UUID",strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	@Column(name="name")
	private String name;
	
	@Column(name="roll")
	private Integer roll;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="schoolnname")
	private String schoolnname;
	
	@Column(name="email") 
	private String email;
	
	@JsonManagedReference
	@OneToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	@JoinColumn(name = "idd",referencedColumnName = "id",nullable = false )
	private List<Female> Female;

	@JsonManagedReference
	@OneToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	@JoinColumn(name = "idd",referencedColumnName = "id",nullable = false )
	private List<Staff> Staff;
	
//	@JsonManagedReference
//	@OneToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY )
//	@JoinColumn(name = "idd",referencedColumnName = "id",nullable = false )
//	private List<School> School;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getSchoolnname() {
		return schoolnname;
	}

	public void setSchoolnname(String schoolnname) {
		this.schoolnname = schoolnname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
