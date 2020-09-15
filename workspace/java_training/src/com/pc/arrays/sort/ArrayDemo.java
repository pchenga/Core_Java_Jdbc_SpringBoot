package com.pc.arrays.sort;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int i1 =10;
		int i2 =20;
		
				
		int[] nums= new int[10]; 
		//Student[] students = new Student[](); 
		
		System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		
		//Initialize 
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=90;
		nums[5]=60;
		nums[6]=80;
		nums[7]=50;
		nums[8]=70;
		nums[9]=100;
		
		
		
		System.out.println("Before sorting");
		for(int i : nums) {
			System.out.println(i);
		}
		
		
		Arrays.sort(nums);
		
		System.out.println("After sorting");
		for(int i : nums) {
			System.out.println(i);
		}
		
		

	}

}
