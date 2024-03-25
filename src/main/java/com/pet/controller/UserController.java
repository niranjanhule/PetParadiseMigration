package com.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pet.exception.InvalidCredentialsException;
import com.pet.exception.UserAlreadyExistsException;
import com.pet.model.User;
import com.pet.service.PetServiceIMPL;

@RestController
@RequestMapping("/userapi")
public class UserController {
	@Autowired
	PetServiceIMPL petServiceIMPL;

	@GetMapping("signin/{email}/{password}")
	public ResponseEntity<String> signIn(@PathVariable String email, @PathVariable String password)
			throws InvalidCredentialsException {

		petServiceIMPL.signIn(email, password);
		return ResponseEntity.ok("SignIn Successfully...");
	}

	@PostMapping("/signup")

	public ResponseEntity<String> signUp(@RequestBody User user) throws UserAlreadyExistsException {
		petServiceIMPL.signUp(user);
		return ResponseEntity.ok().body("SignUp Successfully. Please SignIN ");
	}
}
