package com.pc.exceptionhandling;

public class A {
	int a = 10;
	int b = 20;
	
	//Forward the exception to caller 
	public void m1() throws ArithmeticException {
	
	   int res = 10/0;// 1. Indentify Exception 2. Arithmetic ae = new Arithmetic() 3. throw ae 
	   System.out.println(res);
	}
	
	public void m2() throws NumberFormatException {
		
		String s = "123a";
	    System.out.println(Integer.parseInt(s));
		
	}

}
