package com.cogent.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="author")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int authorId; 
	private String authorName;
	private String authorAddress;
	private String authorPhone;

	
}
