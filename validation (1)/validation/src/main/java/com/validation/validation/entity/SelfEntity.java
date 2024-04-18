package com.validation.validation.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_user_arivu_validation")
@Getter
@Setter
public class SelfEntity {
	
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name="id",updatable=false,nullable=false)
	public UUID id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="address")
	public String address;
	
	@Column(name="insta")
	public String insta;
	
	@Column(name="qualification")
	public String qualification;

//	public UUID getId() {
//		return id;
//	}
//
//	public void setId(UUID id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getInsta() {
//		return Insta;
//	}
//
//	public void setInsta(String Insta) {
//		this.Insta = Insta;
//	}
//
//	public String getQualification() {
//		return qualification;
//	}
//
//	public void setQualification(String qualification) {
//		this.qualification = qualification;
//	}
//
//	
//	
//	
//	
	
}
