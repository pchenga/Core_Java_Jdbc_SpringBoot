package com.pc.collections.map;

import java.util.*;

import com.pc.oop.Student;

public class StudentHashMap {

	public static void main(String[] args) {
	
		//  Key, Student
		Map<Integer,Student> studentMap = new HashMap<>();
		
		Student s1 = new Student(1,"Prakash","test@test.com",1111L, "CSE");
		Student s2 = new Student(2,"Sandeep","test@test.com",22222L, "CSE");
		Student s3 = new Student();
		
		
		studentMap.put(1,s1);
		studentMap.put(2,s2);
		studentMap.put(3,s3);
		
		Collection<Student> students = studentMap.values();
		for(Student s: students) {
			s.printStudent();
		}
		
		
		
		
		
		
		

	}

}
