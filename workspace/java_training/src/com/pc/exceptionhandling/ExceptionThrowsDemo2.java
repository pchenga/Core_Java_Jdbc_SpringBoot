package com.pc.exceptionhandling;

public class ExceptionThrowsDemo2 {

	public static void main(String[] args) {
		
		try {
			
			A obj = new A();
			obj.m1();
			obj.m2();
		} catch (ArithmeticException ae) {
			System.out.println("ae");
			ae.printStackTrace();
			
		}catch(NumberFormatException ne) {
			System.out.println("ne");
			ne.printStackTrace();
	   }
		
	   System.out.println("Remaining code gets executed.....");

	}

}
