package com.onetomany.entity;

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
public class Staff {
	
	
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
	@Column(name="id",updatable=false,nullable=false)
	@Type(type = "uuid-char")
	
	    private UUID id;
	
	@Column(name="name")
	private String name;
	@Column(name="dept")
	private String dept;
// @Column(name="student_dept")
//private String Studentdept;
	 
 @JsonBackReference
 @ManyToOne
 @JoinColumn(name = "student_dept", referencedColumnName = "dept", nullable = false,insertable = false,updatable = false)
 private Student Student;

	public UUID getId() {
		return id;
	}

	public void setId(UUID  id) {
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

//	public String getStudentdept() {
//		return Studentdept;
//	}
//
//	public void setStudentdept(String studentdept) {
//		Studentdept = studentdept;
//	}
}
