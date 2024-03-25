package com.pet.exception;

public class InvalidCredentialsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCredentialsException(String messege) {
		super(messege);
	}
}
