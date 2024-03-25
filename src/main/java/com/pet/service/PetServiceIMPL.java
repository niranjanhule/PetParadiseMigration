package com.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.dao.PetDaoImpl;
import com.pet.exception.InvalidCredentialsException;
import com.pet.exception.PetAdditionException;
import com.pet.exception.UserAlreadyExistsException;
import com.pet.model.Pet;
import com.pet.model.User;

@Service
public class PetServiceIMPL implements Petservice {

	@Autowired
	PetDaoImpl petDaoImpl;

	public List<Pet> viewPets() {

		return petDaoImpl.viewPets();
	}

	public boolean addPet(Pet pet) throws PetAdditionException {

		try {
			petDaoImpl.addPet(pet);
			return true;
		} catch (Exception e) {
			throw new PetAdditionException("Failed to add pet. Please ensure all mandatory fields are filled.");
		}

	}

	public void updatepetinformation(Pet pet, int id) {

		petDaoImpl.updatepetinformation(pet, id);

	}

	public void deleteDataById(int id) {

		petDaoImpl.deleteDataById(id);
	}

	
	public void signUp(User user) throws UserAlreadyExistsException {
		
		petDaoImpl.SignUp(user);
		
		
	}


	public void  signIn(String email, String password) throws InvalidCredentialsException {
		
		try {
			petDaoImpl.SignIn(email, password);
			//return "";
			
		} catch (Exception e) {
			throw new InvalidCredentialsException("Invalid credential. Please Check email Or password."+e.getMessage());
		}
	}

}
