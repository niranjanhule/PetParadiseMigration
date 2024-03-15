package com.pet.model;

import java.util.List;

import lombok.Data;

@Data
public class UserPojo {

	private int id;

	private String aadhaar_no;

	private String email;

	private String fname;

	private String lname;

	private String password;

	private long phone_no;

	private String username;

	private int usertype;

	private List<PetPojo> pets;

}
