package com.family.Family.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="tb_user_arivu_Son")
public class Son {
     
	@Column(name="father_name")
	private String father_name;
	@Column(name="NAME")
	private String NAME;
	@Column(name="Dob")
	private Date Dob;
	@Column(name="Qualification")
	private String Qualification;
	@Column(name="Gender")
	private String Gender;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "father_name", referencedColumnName = "FatherName", nullable = false,insertable = false,updatable = false)
	private Daughter Daughter;
	
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
}
