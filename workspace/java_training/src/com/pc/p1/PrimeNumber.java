package com.pc.p1;

import java.util.Scanner;

public class PrimeNumber {

	//5/1  5/2 5/3 5/4  5/5
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int n = scan.nextInt();
		
		boolean isPrime=true;
		
		for(int i=2; i<n ; i++) {
			
			if(n%i ==0) {
				isPrime =false;
				break;
			}
				
		}
	
	   if(isPrime) {
		   System.out.println(n+" is a prime number");
	   } else {
		   System.out.println(n+" is not a prime number");
	   }

	}

}
