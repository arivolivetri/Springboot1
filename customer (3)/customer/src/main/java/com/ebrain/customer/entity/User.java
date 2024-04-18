	package com.ebrain.customer.entity;

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
@Table(name="tb_user_arivu_customer")

public class User {
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
	@Column(name="id",updatable=false,nullable=false)
	@Type(type = "uuid-char")
	private UUID id;
	@Column(name="name")
	private String name;
	@Column(name="destignation")
	private String destignation;
	@Column(name="contact")
	private Integer contact;
	
	@JsonManagedReference
	@OneToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	@JoinColumn(name = "customer_id",referencedColumnName = "id",nullable = false )
	private List<UserAddress> usereraddress;
	
	
	
	
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
	public String getDestignation() {
		return destignation;
	}
	public void setDestignation(String destignation) {
		this.destignation = destignation;
	}
	public Integer getContact() {
		return contact;
	}
	public void setContact(Integer contact) {
		this.contact = contact;
	}
	
	

}
