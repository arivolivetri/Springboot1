package com.example.school.entity;

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
@Table(name="tb_user_arivu_schooldetail")
public class School {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name ="UUID",strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	@Column(name="OWNER")
	private String owner;
	@Column(name="schoolname")
	private String schoolname;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "idd", referencedColumnName = "id", nullable = false,insertable = false,updatable = false)
	private Staff Staff;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	

}
