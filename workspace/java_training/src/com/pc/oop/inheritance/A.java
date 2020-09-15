package com.pc.oop.inheritance;

public class A {
	
	//Properties or instance or non static variable
	private   int a=10;
	          int b=20;
	protected int c=30;
	public    int d=40;
	
	public A(int a, int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public A() {
		System.out.println("A()");
		
	}
	
	
	public static void main(String args[]) {
		
		A obj = new A(1,2,3);
	}
	
	

}
