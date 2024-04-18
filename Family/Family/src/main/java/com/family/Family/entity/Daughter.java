package com.family.Family.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="tb_user_arivu_Daughter")
public class Daughter {
	
	@Column(name="FatherName")
	private String FatherName;
	@Column(name="NAME")
	private String NAME;
	@Column(name="Dob")
	private Date Dob;
	@Column(name="Qualification")
	private String Qualification;
	@Column(name="Gender")
	private String Gender;
	
	@JsonManagedReference
	@OneToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	@JoinColumn(name = "father_name",referencedColumnName = "FatherName",nullable = false )
	private List<Son> Son;
	
	
	
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
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
