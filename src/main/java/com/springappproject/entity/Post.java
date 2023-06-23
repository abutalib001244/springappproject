package com.springappproject.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="posts")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="title", nullable=false, unique=true)
	private String title;
	
	@Column(name="description", nullable=false, unique=true)
	private String description;
	
	@Column(name="content", nullable=false, unique=true)
	private String content;

}
