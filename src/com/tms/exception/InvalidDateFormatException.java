package com.tms.exception;

public class InvalidDateFormatException extends RuntimeException {

	/**
	 * @author Manish
	 */
	private static final long serialVersionUID = -3807351166544803044L;
	
    public InvalidDateFormatException(String errorMessage) {
        super(errorMessage);
    }
}
