package com.pc.oop.polymorphism.override;

public class Test {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eating();
		a.running();
		
       Dog d = new Dog();
       d.eating();
       d.running();
       d.sounds();
       
       Cat c = new Cat();
       c.eating();
       c.running();
       
       //Dynamic dispatch or Runtime Polymorphism
       Animal a1 = new Dog();
       a1.eating();
       a1.running();
       a1.sounds();
       
       Animal a2 = new Cat();
       a2.eating();
       a2.running();
       
       //Cat c1 = new Animal();
       //Cat c3 = new Dog();
       
       
       

	}

}
