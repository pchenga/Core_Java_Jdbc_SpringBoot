package com.pc.oop.polymorphism;

public class MethodOverload {
	
	
	//Static 
	static int a =10;
	static int b =20;
	
	//Non static or instance
	int c =30;
	int d =40;		

	//1. Input Parameters int, int
	//2. Output Parameters int
	//3. Method name : addTwoNumbers
	
	public static int addTwoNumbers(int input1, int input2) {
		//Implementation
		int sum = input1+input2;
		return sum;
	}
	
	public int add(int input1, int input2) {
		//Implementation
		int sum = input1+input2;
		return sum;
	}
	public int add(int input1, int input2, int input3) {
		//Implementation
		int sum = input1+input2+input3;
		return sum;
	}
	
	public float add(float input1, float input2){
		float sum = input1+input2;
		return sum;
	}
	
	public float add(int input1, float input2){
		float sum = input1+input2;
		return sum;
	}
	
	public float add(float input1, int input2){
		float sum = input1+input2;
		return sum;
	}
	
	
	public static void main(String[] args) {
		
	     System.out.println(a);
	     System.out.println(MethodOverload.b);
	     int res = MethodOverload.addTwoNumbers(10, 20);
	     
	     System.out.println(res);
	     
	     
	     MethodOverload mo = new MethodOverload();
	     System.out.println(mo.c);
	     System.out.println(mo.d);
	     int res1 = mo.add(100,200);
	     System.out.println(res1);
	     
	    float res2 = mo.add(1.0f, 2.0f);
	    System.out.println(res2); 

	}

}
