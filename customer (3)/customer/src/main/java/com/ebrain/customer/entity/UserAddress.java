package com.ebrain.customer.entity;

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
@Table(name="tb_user_arivu_customer_address1")
public class UserAddress {
@Id
@GeneratedValue(generator="UUId")
@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
@Column(name="id",updatable=false,nullable=false)
@Type(type = "uuid-char")
private UUID id;

@Column(name="state")
private String state;
@Column(name="city")
private String city;
@Column(name="district")
private String district;
@Column(name="pincode")
private Integer pincode;
@JsonBackReference
@ManyToOne
@JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false,insertable = false,updatable = false)
private User user;

public UUID getId() {
	return id;
}
public void setId(UUID id) {
	this.id = id;
}

public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public Integer getPincode() {
	return pincode;
}
public void setPincode(Integer pincode) {
	this.pincode = pincode;
}


	

}
