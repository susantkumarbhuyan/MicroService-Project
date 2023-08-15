package com.skyline.exception;

public class ResourceNotFountException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFountException() {
		super("Resource Not Found");
	}

	public ResourceNotFountException(String msg) {
		super(msg);
	}

}
