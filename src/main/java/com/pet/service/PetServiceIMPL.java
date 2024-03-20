package com.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.dao.PetDaoImpl;
import com.pet.model.Pet;

@Service
public class PetServiceIMPL implements Petservice {

	@Autowired
	PetDaoImpl petDaoImpl;

	public List<Pet> viewPets() {

		return petDaoImpl.viewPets();
	}

	public boolean addPet(Pet pet) {

		
		return true;
	}

	public void updatepetinformation(Pet pet, int id) {

		petDaoImpl.updatepetinformation(pet, id);

	}

	public void deleteDataById(int id) {
		
		petDaoImpl.deleteDataById(id);
	}

}
