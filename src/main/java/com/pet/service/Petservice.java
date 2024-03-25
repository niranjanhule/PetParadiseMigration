package com.pet.service;

import java.util.List;

import com.pet.exception.InvalidCredentialsException;
import com.pet.exception.PetAdditionException;
import com.pet.exception.UserAlreadyExistsException;
import com.pet.model.Pet;
import com.pet.model.Petregristration;
import com.pet.model.User;

public interface Petservice {

	

	public List<Pet> viewPets();
	
	public boolean addPet(Pet pet) throws PetAdditionException;
	
	public void updatepetinformation(Pet pet,int id);
	
	public void deleteDataById(int id);
	
	public void signUp(User user) throws UserAlreadyExistsException;
	
	public void signIn(String email, String password ) throws InvalidCredentialsException;
	
	
}
