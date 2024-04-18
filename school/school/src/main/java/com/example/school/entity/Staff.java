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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="tb_user_arivu_schoolstaff")
public class Staff {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name ="UUID",strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	@Column(name="name")
    private String name;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="address")
	private String address;
	
	@Column(name="schoolname")
	private String schoolname;

	@JsonManagedReference
	@OneToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	@JoinColumn(name = "idd",referencedColumnName = "id",nullable = false )
	private List<School> School;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "idd", referencedColumnName = "id", nullable = false,insertable = false,updatable = false)
	private SchoolMens SchoolMens;
	


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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	
	

}
