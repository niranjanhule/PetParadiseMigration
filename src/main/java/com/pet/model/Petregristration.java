package com.pet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Petregristration {

	 @Id
 // @GeneratedValue
	private int id;

	private int age;

	private String breed;

	private String color;

	private String gender;

	private String petname;

	private double price;

	private String status;

	private String type;

//	private int uid;
}
