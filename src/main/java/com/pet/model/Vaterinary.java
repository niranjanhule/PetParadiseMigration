package com.pet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "vaterinary")
public class Vaterinary {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column(nullable = false)
	public String name;

	@Column(nullable = false)
	public String hospital_name;

	@Column(nullable = false)
	public String address;

	@Column(nullable = false)
	public long phone;
}
