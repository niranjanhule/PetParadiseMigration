package com.pet.service;

import java.util.List;

import com.pet.model.Pet;
import com.pet.model.Petregristration;
import com.pet.model.User;

public interface Petservice {

	

	public List<Pet> viewPets();
	
	public boolean addPet(Pet pet);
	
	public void updatepetinformation(Pet pet,int id);
	
	public void deleteDataById(int id);
}
