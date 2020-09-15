package com.pc.collections.set;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> nums = new TreeSet<>();
		
		nums.add(100);
		nums.add(10);
		nums.add(90);
		nums.add(80);
		nums.add(20);
		nums.add(40);
		nums.add(30);
		nums.add(60);
		nums.add(50);
		nums.add(20);
		
		//Lambda expression
		nums.forEach(e -> System.out.println(e));
		
		for(int e :nums)
			System.out.println(e);

	}

}
