package com.pet.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pet")
public class Pet {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private int age;

	@Column(nullable = false)
	private String breed;

	@Column(nullable = false)
	private String color;

	@Column(nullable = false)
	private String gender;

	@Column(nullable = false)
	private String petname;

	@Column(nullable = false)
	private double price;

	@Column(nullable = false)
	private String status;

	@Column(nullable = false)
	private String type;

	@ManyToOne
	private User user;

	@OneToMany(mappedBy = "pet")
	private List<BuySell> buysell;

}
