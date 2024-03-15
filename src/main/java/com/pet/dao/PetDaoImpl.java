package com.pet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pet.model.Pet;
import com.pet.model.Petregristration;
import com.pet.model.User;
import com.pet.repo.PetRegRepo;
import com.pet.repo.PetRepo;
import com.pet.repo.UserRepo;

@Component
public class PetDaoImpl implements PetDao {

	@Autowired
	PetRegRepo petRegRepo;

	@Autowired
	PetRepo petRepo;

	@Autowired

	UserRepo userRepo;

	public List<Pet> getAllPetsInformation() {

		return petRepo.findAll();
	}

	public void updatePetInformation(Pet pet) {

		petRepo.save(pet);
	}

	public void deletePetInformationById(int id, Pet pet) {

		petRepo.deleteById(id);
	}

	public void addPet(Petregristration pet) {

		petRegRepo.save(pet);
	}

	public void buyerPetDetails(User user) {

		userRepo.save(user);
	}

	public void buyPet(Petregristration pet) {

		petRegRepo.save(pet);

	}

}
