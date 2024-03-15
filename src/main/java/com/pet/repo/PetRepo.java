package com.pet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pet.model.Pet;

@Repository
public interface PetRepo extends JpaRepository<Pet, Integer> {

}
