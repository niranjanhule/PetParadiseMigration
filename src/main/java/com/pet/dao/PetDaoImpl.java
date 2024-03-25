package com.pet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pet.model.Pet;
import com.pet.model.User;
import com.pet.repo.PetRepo;
import com.pet.repo.UserRepo;

@Component
public class PetDaoImpl implements PetDao {

	@Autowired
	PetRepo petRepo;

	@Autowired

	UserRepo userRepo;

	public List<Pet> viewPets() {

		return petRepo.findAll();
	}

	public boolean addPet(Pet pet) {
		petRepo.save(pet);
		return true;
	}

	public void updatepetinformation(Pet pet, int id) {
		petRepo.save(pet);

	}

	public void deleteDataById(int id) {
		petRepo.deleteById(id);
	}

	public void SignUp(User user) {

		userRepo.save(user);
	}

	public void SignIn(String email, String password) {
		userRepo.findByEmailAndPassword(email, password);
	}

}
