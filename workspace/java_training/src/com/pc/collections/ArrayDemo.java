package com.pc.collections;

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
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		
		int len = nums.length;
		
		for(int i=0;i<len;i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("enhanced for loop");
		for(int i : nums) {
			System.out.println(i);
		}
		
		

	}

}
