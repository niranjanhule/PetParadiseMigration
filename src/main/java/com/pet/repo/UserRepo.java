package com.pet.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pet.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	//public List<Pet> findByUser(User user);

	public Optional<User> findByEmailAndPassword(String email,String password);
	}
