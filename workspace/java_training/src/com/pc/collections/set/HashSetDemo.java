package com.pc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Dynamic Dispatch
		Set<Integer> nums = new HashSet<>();
		
		System.out.println(nums.isEmpty());
		
		nums.add(10); //1000
		nums.add(20);
		nums.add(10); //1000
		nums.add(20);
		
		for(int i : nums) {
			System.out.println(i);
		}
		
		
		

	}

}
