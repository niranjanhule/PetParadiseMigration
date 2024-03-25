package com.pet.dao;

import java.util.List;

import com.pet.model.Pet;
import com.pet.model.User;

public interface PetDao {
	// public List<Pet> getAllPetsInformation();

	public List<Pet> viewPets();
 
	public boolean addPet(Pet pet);
	
	public void updatepetinformation(Pet pet,int id);

	public void deleteDataById(int id);

	public void SignUp(User user);
	
	public void SignIn(String email,String password);
}
