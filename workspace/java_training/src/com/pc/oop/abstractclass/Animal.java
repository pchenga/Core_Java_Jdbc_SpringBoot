package com.pc.oop.abstractclass;
//1. Partially abstract
//2. Can't create an object 
public abstract class Animal {
	
	String name;
	
	public Animal() {
		System.out.println("Animal() is called");
		
	}
	public abstract void eating();//No implementation
	public abstract void sounds();//No implementation
	
	//Concrete
	 public void running() {
		System.out.println("Animal running");
	}
	
	
}
