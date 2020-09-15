package com.pc.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<Integer> nums = new LinkedList<>();

		System.out.println(nums.isEmpty()); // ? true

		// Boxing -- Converts int to Integer object
		int j = 10;
		nums.add(j);
		nums.add(20);
		nums.add(30);

		System.out.println(nums.isEmpty()); // ? false

		for (Integer i : nums) {
			System.out.println(i);
		}

		System.out.println(nums.contains(10));
		System.out.println(nums.contains(100));

		nums.add(1, 11);
		for (Integer i : nums) {
			System.out.println(i);
		}

		nums.remove(1);

		for (Integer i : nums) {
			System.out.println(i);
		}

		// addAll
		// containsAll
		// retainAll

		ArrayList<Integer> subList = new ArrayList<>();
		subList.add(40);
		subList.add(50);

		nums.addAll(subList);

		System.out.println(nums.size());
		System.out.println(nums.containsAll(subList));
		nums.retainAll(subList);

		for (Integer i : nums) {
			System.out.println(i);
		}

		// Iterator
		Iterator<Integer> itr = nums.iterator();

		while (itr.hasNext()) {
			// Unboxing
			int value = itr.next();

			/*
			 * Integer value = itr.next(); value.intValue()
			 */;
			System.out.println(value);
		}

	}

}
