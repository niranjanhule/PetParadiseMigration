package com.pet.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String aadhaar_no;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private String fname;

	@Column(nullable = false)
	private String lname;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private long phone_no;

	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false)
	private int usertype;

	@OneToMany(mappedBy = "user")
	private List<Pet> pets;

	@OneToMany(mappedBy = "buyer")
	private List<BuySell> buys;

	@OneToMany(mappedBy = "seller")
	private List<BuySell> sells;

}