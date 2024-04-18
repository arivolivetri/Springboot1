package com.student.student.entity;

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
@Table(name="tb_user_arivu_student")
public class User {

	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
//	@Type(type="uuid-char")
	@Column(name="id",updatable = false,nullable = false)
	private UUID id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dept")
	private  String dept;
	
	@Column(name="address")
	private String address;
	
	@Column(name="hobbies")
	private String hobbies;
	
	@JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_dept", referencedColumnName = "dept", nullable = false)
    private List<StaffUser> StaffUser;  

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public List<StaffUser> getStaffUser() {
		return StaffUser;
	}

	public void setStaffUser(List<StaffUser> staffUser) {
		StaffUser = staffUser;
	}
	
		
}
