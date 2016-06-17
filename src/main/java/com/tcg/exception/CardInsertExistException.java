package com.tcg.exception;

public class CardInsertExistException extends RuntimeException {

	public CardInsertExistException() {
		super();
	}
	
	public CardInsertExistException( String msg ) {
		super(msg);
	}
}
