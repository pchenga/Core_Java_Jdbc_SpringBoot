package com.pc.collections.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		Integer sid1 = o1.sid;
		Integer sid2 = o2.sid;
	
		return sid2.compareTo(sid1); // 0, -1, 1
		
	}

}
