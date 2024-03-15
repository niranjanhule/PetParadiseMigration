package com.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.dao.PetDaoImpl;
import com.pet.model.Pet;
import com.pet.model.Petregristration;
import com.pet.model.User;

@Service
public class PetServiceIMPL implements Petservice {

	@Autowired
	PetDaoImpl petDaoImpl;

	public List<Pet> getAllPetsInformation() {

		return petDaoImpl.getAllPetsInformation();
	}

	public void updatePetInformation(Pet pet) {

		// pet.setAge(pet.getAge());

		petDaoImpl.updatePetInformation(pet);
	}

	public void deletePetInformationById(int id, Pet pet) {

		petDaoImpl.deletePetInformationById(id, pet);
	}

	public void addPet(Petregristration pet) {
		petDaoImpl.addPet(pet);
	}

	public void buyerPetDetails(User user) {

		petDaoImpl.buyerPetDetails(user);
	}

	public void buyPet(Petregristration pet) {

		petDaoImpl.buyPet(pet);
	}

}
