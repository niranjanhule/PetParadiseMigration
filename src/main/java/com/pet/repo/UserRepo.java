package com.pet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pet.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	//public List<Pet> findByUser(User user);

	}
