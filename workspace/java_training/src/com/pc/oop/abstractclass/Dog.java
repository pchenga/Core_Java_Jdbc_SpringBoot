package com.pc.oop.abstractclass;

public  class Dog extends Animal {
	
	public Dog(){
		super();
		System.out.println("Dog() is called");
	}
	
	@Override
	public void eating() {
	   	System.out.println("Dog is eating..");

	}

	@Override
	public void sounds() {
		System.out.println("Dog is barking...");

	}
	

}
