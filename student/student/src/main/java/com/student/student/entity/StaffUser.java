package com.student.student.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="tb_user_arivu_staff")
public class StaffUser {
	 @Id
	 @GeneratedValue(generator = "UUID")
	 @GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator" )
	 @Type(type="uuid-char")
	 @Column(name="id",updatable = false,nullable = false)
	private UUID id;
	 
	@Column(name="name")
	private String name;
	
	@Column(name="depte")
	private String depte;
	
//	@Column(name="Studentdept")
//	private String Studentdept;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "Student_dept", insertable = false,updatable = false)
	private User user;

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

	public String getDepte() {
		return depte;
	}

	public void setDepte(String depte) {
		this.depte = depte;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

		
}
