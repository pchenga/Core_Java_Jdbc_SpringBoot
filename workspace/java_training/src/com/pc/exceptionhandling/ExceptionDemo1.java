package com.pc.exceptionhandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
		   int res = 10/1; // 1. Identifys exception, 2. ArithmeticException ae = new ArithmeticException(); 3. throw ae; 
		   System.out.println(res);
		   
		   String s = "123";
		   int i = Integer.parseInt(s); //1. Identifys exception 
		   
		   int a[] = {1,2,3};
		   
		   System.out.println(a[2]);
		   
		   String s1 = null;
		   if(s1 !=null) {
		      System.out.println(s1.length());
		   }
		   
		   
	   }catch(ArithmeticException ae) {
		   System.out.println("Arithmetic Exception");
	    	ae.printStackTrace();
	    }
		catch(NumberFormatException ne) {
	    	System.out.println("NumberFormat Exception");
	    	ne.printStackTrace();
	    }
		catch(Exception e) {
			System.out.println("Exception block");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
			//con.close();
		}
		
		System.out.println("Next Steps...");
		

}

}