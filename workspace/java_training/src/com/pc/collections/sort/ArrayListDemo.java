package com.pc.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Wrapper Types
				/*
				 * byte  - Byte
				 * short - Short
				 * int   - Integer
				 * long  - Long
				 * float - Float 
				 * double -Double
				 * char   -Character
				 * boolean -Boolean
				 * 
				 */
		
		//ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.isEmpty()); //? true
		
		//Boxing -- Converts int to Integer object
		int j = 10;
		nums.add(j);
		nums.add(20);
		nums.add(30);
		nums.add(20);
		nums.add(30);
		nums.add(100);
		nums.add(40);
		nums.add(90);
		nums.add(80);
		nums.add(70);
		nums.add(60);
		nums.add(50);
		
		System.out.println("Before sorting");
		nums.forEach(e -> System.out.println(e));
		
		Collections.sort(nums);
		
	    System.out.println("Before sorting");
		nums.forEach(e -> System.out.println(e));

		
		
		
	
	}

}
