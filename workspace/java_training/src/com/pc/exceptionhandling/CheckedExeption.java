package com.pc.exceptionhandling;

import java.io.FileInputStream;

public class CheckedExeption {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("hello.txt");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
