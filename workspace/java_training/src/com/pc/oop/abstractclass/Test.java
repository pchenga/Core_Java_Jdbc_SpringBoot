package com.pc.oop.abstractclass;

public class Test {

	public static void main(String[] args) {
		
		//Animal a = new Animal();
		
		Dog d = new Dog();
		d.eating();
		d.sounds();
		d.running();
		
		
		Animal a = new Dog();
		a.eating();
		a.sounds();
		a.running();
		
		
		

	}

}
