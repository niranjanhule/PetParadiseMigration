package com.pet;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.pet.service.","com.pet.model.Petregristration","com.pet.controller","com.pet.dao","com.pet.repo"})
public class PetParadiseMigrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetParadiseMigrationApplication.class, args);
	}

}
