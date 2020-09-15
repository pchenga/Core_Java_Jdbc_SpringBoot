package com.pc.java_advanced;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {
	
	
	public List<Employee> getAllEmployees(){
		
		List<Employee> emps = new ArrayList<Employee>();
		
		Employee e1 = new Employee(100, "A", "A@A.com",1111L, 1000.00);
		Employee e2 = new Employee(101, "B", "A@A.com",1111L, 1000.00);
		Employee e3 = new Employee(102, "C", "A@A.com",1111L, 1000.00);
		Employee e4 = new Employee(103, "D", "A@A.com",1111L, 1000.00);
		Employee e5 = new Employee(104, "E", "A@A.com",1111L, 1000.00);
		Employee e6 = new Employee(105, "F", "A@A.com",1111L, 1000.00);
		
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		
		
		return emps;
	}

}
