package com.BikkadIt.mini.configuration;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class swaggerconfig {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="user_name",nullable = false)
	private String name;
	
	private String email;
	private String password;
	private String about;

}
