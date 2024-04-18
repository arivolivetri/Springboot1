package com.example.verification.Entity;

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
@Table(name="tb_user_arivu_verification")
@Getter
@Setter
public class EntityClass {
	
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name="id",updatable=false,nullable=false)
	private UUID id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phn")
	private Integer phn;
	
	@Column(name="email")
	private String email;
	
	
  
	

}
