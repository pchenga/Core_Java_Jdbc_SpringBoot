package com.pc.oop;

public class Student1 {
	
	int sid; //0
    String sname; //null
    
    //Setters
    public void setSid(int sid){
    	this.sid =sid;
    }
 
    public void setSname(String sname) {
    	this.sname =sname;
    }
    
    
    //Getters
    public int getSid() {
    	return sid;
    }
    
    public String getSname() {
    	return sname;
    }
    
    public void printStudent() {
    	System.out.println(sid + "\t" + sname);
    }
   

	public static void main(String[] arg) {
		Student1 s1 = new Student1();
		s1.setSid(1);
		s1.setSname("Prakash");
				
		System.out.println(s1.sid);
		System.out.println(s1.sname);

		
		int sid = s1.getSid();
		String sname = s1.getSname();
		
		System.out.println(sid);
		System.out.println(sname);
		
		s1.printStudent();
	}

}
