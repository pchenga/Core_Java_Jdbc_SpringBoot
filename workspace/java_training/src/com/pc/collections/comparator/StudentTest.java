package com.pc.collections.comparator;

import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Sandeep");
		Student s2 = new Student(9,"Sandeep1");
		Student s3 = new Student(3,"Prakash");
		Student s4 = new Student(4,"Ram");
		Student s5 = new Student(2,"Krishna");
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		System.out.println("Before sorting");
		for(Student s: students) {
			System.out.println(s.sid +"\t" + s.sname);
		}
		StudentComparator sc = new StudentComparator();
		Collections.sort(students,sc);
		
		System.out.println("After sorting");
		for(Student s: students) {
			System.out.println(s.sid +"\t" + s.sname);
		}
		
		
	}

}
