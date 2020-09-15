package com.pc.collections;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.add(10);
		v.add(20);
		v.add(30);

		for (int i : v) {
			System.out.println(i);
		}

		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
			int i = en.nextElement();
			System.out.println(i);
		}

		System.out.println("Iterator");
		Iterator<Integer> itr = v.iterator();

		while (itr.hasNext()) {
			// Unboxing
			int value = itr.next();
			System.out.println(value);
		}

	}

}
