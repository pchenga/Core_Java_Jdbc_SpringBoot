package com.pc.oop.interfaces;

public class Dog implements Animal{

	@Override
	public void eating() {
		System.out.println("Dog eating..");

	}

	@Override
	public void sounds() {
		System.out.println("Dog barking..");	
    }
	
	@Override
	public void running() {
		System.out.println("Dog running..");
	}
	
	

}
