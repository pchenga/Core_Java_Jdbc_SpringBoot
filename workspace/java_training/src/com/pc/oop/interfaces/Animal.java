package com.pc.oop.interfaces;
//1. Purely or 100% abstract 
//2. Can't create an object
public interface Animal {
	
	public static final int MIN_VALUE = 1;
	public static final int MAX_VALUE = 1;
	 int i=10;
	
	/*public Animal() {
		System.out.println("Animal() is called");
		
	}*/
	
	public abstract void eating();//No implementation
	                void sounds();//No implementation
	
	default public void running() {
		System.out.println("Animal running");
	}
	
	//Global member
	//Animal.name()
	//We can't override a static method
	static public void name() {
		System.out.println("Animal");
	}

}
