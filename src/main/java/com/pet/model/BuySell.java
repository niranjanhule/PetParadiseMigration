package com.pet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "buysell")
public class BuySell {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	private User buyer;

	@ManyToOne
	private Pet pet;

	@ManyToOne
	private User seller;
}
