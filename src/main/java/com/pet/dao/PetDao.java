package com.pet.dao;

import java.util.List;

import com.pet.model.Pet;
import com.pet.model.Petregristration;
import com.pet.model.User;

public interface PetDao {
	public List<Pet> getAllPetsInformation();

	// public void viewPets(User user);

	public void updatePetInformation(Pet pet);

	public void deletePetInformationById(int id, Pet pet);

	public void addPet(Petregristration pet);

	public void buyerPetDetails(User user);

	// public void getPets(Pet pet);

	public void buyPet(Petregristration pet);
}
