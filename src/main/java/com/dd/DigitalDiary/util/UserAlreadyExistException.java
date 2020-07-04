package com.dd.DigitalDiary.util;

public class UserAlreadyExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserAlreadyExistException() {
		super();
	}
		
	public UserAlreadyExistException(final String message) {
		super(message);
	}
	
	

}
