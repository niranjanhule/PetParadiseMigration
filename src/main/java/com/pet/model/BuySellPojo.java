package com.pet.model;

import lombok.Data;

@Data
public class BuySellPojo {

	private int id;

	private UserPojo buyer;

	private PetPojo pet;

	private UserPojo seller;

}
