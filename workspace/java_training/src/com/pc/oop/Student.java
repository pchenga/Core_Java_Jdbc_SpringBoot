package com.pc.oop;
//Encapsulation
public class Student {
	//Characterstics or Properties or instance or non static 
	int sid=00;
	String sname="NA";
	String email="NA";
	long phone=000L;
	String dept="NA";
	
	static String country="INDIA"; //Memory gets allocate only once
	final static int MIN_VALUE = 1;
	final static int MAX_VALUE = 9999;
	
	//primary constructor
	public Student(int sid,	String sname, String email, long phone,	String dept) {
		System.out.println("Student() 5 parameters is called..");
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		this.dept  = dept;
	}
	
	//secondary constructor or optional
	public Student(int sid,	String sname, String email, long phone) {
		System.out.println("Student() 4 parameters is called..");
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		
	}

	public Student(int sid,	String sname, String email) {
		System.out.println("Student() 4 parameters is called..");
		this.sid = sid;
		this.sname = sname;
		this.email = email;
				
	}
	
	public Student( int sid) {
		 this.sid = sid;	
		}
	
	public Student() {
	 // not setting 	
	}
	
	
	@Override
	public String toString() {
		return "["+sid+"\n"+sname+"]";
	}
	//behaviour or methods 
	public void printStudent() {
			System.out.println(sid + "\t" + sname +  "\t" + email + "\t" +phone + "\t" + dept );
	}
	
	public void study() {
		System.out.println(sname + "is studying..");
	}
	
	public void play() {
		System.out.println(sname + "is playing..");
	}
	
	
	

}
