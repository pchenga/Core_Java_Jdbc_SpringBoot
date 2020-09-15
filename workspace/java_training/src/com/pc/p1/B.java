package com.pc.p1;

import com.pc.oop.inheritance.A;

public class B extends A {
	
  public void print() {
	  System.out.println(c); //protected
	  System.out.println(d); //public
	  A obj = new A();
	  obj.d = 0;
	  //System.out.println(obj.c); // Protected
	  System.out.println(obj.d);
	  
  }
  
}
