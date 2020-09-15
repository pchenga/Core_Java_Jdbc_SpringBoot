package com.pc.oop;

import com.pc.p1.PrimeNumber;

public class StudnetTest {

	public static void main(String[] args) {
		System.out.println("test");
		
		//Create an object or instance of class 
		Student s1 = new Student(1,"Prakash","test@test.com",1111L, "CSE");
		
		System.out.println(s1.toString()); //toString()
		
		s1.printStudent();
		s1.play();
		s1.study();
			
		
		System.out.println(Student.country);
		Student.country = "US";
		//Student.MAX_VALUE=999999;
		System.out.println(s1.country);
		
		Student s2 = new Student(2,"Sandeep","test@test.com",22222L, "CSE");
		System.out.println(s2.toString()); //toString()
		s2.printStudent();
		s2.play();
		s2.study();
		
		Student s3 = new Student();
		System.out.println(s3.toString()); //toString()
		s3.printStudent();
		s3.play();
		s3.study();
		
		
		Student s4 = new Student(4,"Sandeep","test@test.com",22222L);
		System.out.println(s4.toString()); //toString()
		s4.printStudent();
		s4.play();
		s4.study();
		
		Student s5 = new Student(5);
		System.out.println(s5.toString()); //toString()
		s5.printStudent();
		s5.play();
		s5.study();
				
		
		
		//PrimeNumber pn = new PrimeNumber();
		

	}

}
