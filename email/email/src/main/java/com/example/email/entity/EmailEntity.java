package com.example.email.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class EmailEntity {
	private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
}

