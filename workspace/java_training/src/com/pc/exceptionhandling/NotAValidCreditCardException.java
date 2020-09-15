package com.pc.exceptionhandling;

public class NotAValidCreditCardException extends Exception{
String message;

public NotAValidCreditCardException(String message){
	super(message); // super()
	this.message = message;
}


public String toString() {
	return message;
}
	
}
