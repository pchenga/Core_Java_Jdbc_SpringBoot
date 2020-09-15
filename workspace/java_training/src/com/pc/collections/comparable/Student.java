package com.pc.collections.comparable;

public class Student implements Comparable<Student>{
	
	int sid;
	String sname;
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public int compareTo(Student o) {
		int sid1 = this.sid;
		int sid2 =  o.sid;
		
		if(sid2 == sid1)
			return 0;
		else if(sid2 < sid1)
			return -1;
		else 
			return 1;

	}
	

}
