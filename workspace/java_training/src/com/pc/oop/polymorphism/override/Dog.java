package com.pc.oop.polymorphism.override;

//IS -A 
public class Dog extends Animal {
	
	public void eating(){
        System.out.println("Dog is eating -------");      		
	}
	
	public void running(){
		System.out.println("Dog is running...");
	}
	
	public void sounds() {
		System.out.println("Dog is sounds like barking...");
	}

}
