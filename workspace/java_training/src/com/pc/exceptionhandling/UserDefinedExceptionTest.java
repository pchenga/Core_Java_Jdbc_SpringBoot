package com.pc.exceptionhandling;

import java.util.Scanner;

public class UserDefinedExceptionTest {

	public static void main(String[] args) {
		
      Scanner scan = new Scanner(System.in);
      
      try {
		Long input = scan.nextLong();
		if (input == 99999999L) {
			System.out.println("Valid card");
		} else {
			//throw
			NotAValidCreditCardException exception = new NotAValidCreditCardException(
					"Invalid Card. Please provide the valid card");
			throw exception;
		} 
	} catch (NotAValidCreditCardException ne) {
	    System.out.println(ne); //toString() 
	}catch (Exception e) {
		e.printStackTrace();
    }
		

	}

}
