package org.java;

import java.io.IOException;

public class Exception {

	public static void main(String[] args) throws ArithmeticException{
		info();
	}
	private static void info(){
	System.out.println("hello");
	throw new ArithmeticException();
	}
}
