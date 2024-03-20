package com.pet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "petcaretacker")
public class PetCareTacker {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column(nullable = false)
	public String name;

	@Column(nullable = false)
	public String center_name;

	@Column(nullable = false)
	public String address;

	@Column(nullable = false)
	public long phone_no;

	@Column(nullable = false)
	public String description;

}
