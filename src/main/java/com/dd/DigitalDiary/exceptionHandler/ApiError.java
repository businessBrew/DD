package com.dd.DigitalDiary.exceptionHandler;

public class ApiError {
	
	private int status;	
	private String message;	

	public ApiError() {		
		super();	
		}
	
	public ApiError(final int status,final String message) {
		this.status = status;
		this.message= message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	


}
