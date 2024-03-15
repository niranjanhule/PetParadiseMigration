package com.pet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pet.model.Petregristration;

@Repository
public interface PetRegRepo extends JpaRepository<Petregristration, Integer> {

}
