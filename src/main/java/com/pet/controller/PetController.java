package com.pet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pet.model.Pet;
import com.pet.model.Petregristration;
import com.pet.model.User;
import com.pet.service.PetServiceIMPL;

@RestController
@RequestMapping("/petapi")
public class PetController {

	@Autowired
	PetServiceIMPL petServiceIMPL;

	@PostMapping("/addpet")
	public ResponseEntity<String> addPet(@RequestBody Pet pet) {
	    petServiceIMPL.addPet(pet);
		return ResponseEntity.ok("Pet added successfully");
		//return "Pet Added Successfully";
	}

	
	
	@GetMapping("/viewpet")
	  public List<Pet> viewPets(){
				  
		return petServiceIMPL.viewPets();
	  }
	
	
	@PutMapping("/updatepetinfo/{id}")
	
	public ResponseEntity<String> updatePetInformation(@RequestBody Pet pet, @PathVariable int id ){
		
		 petServiceIMPL.updatepetinformation(pet, id);
		 return ResponseEntity.ok("Updated Sucessfully");
	}	
	
	@DeleteMapping("/deletedatabyid/{id}")
	public ResponseEntity<String> deleteDataById(@PathVariable int id){
		petServiceIMPL.deleteDataById(id);
		return ResponseEntity.ok("Delete Suceessfully");
	}
	
	

}