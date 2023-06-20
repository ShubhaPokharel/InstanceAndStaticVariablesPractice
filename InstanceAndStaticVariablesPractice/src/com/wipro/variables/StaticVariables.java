package com.wipro.variables;

public class StaticVariables {
	static int number1 = 0;
	static int number2 = 120;
	
	static void addition() {
		System.out.println("Addition of two numbers: "+ (number1 + number2));
	}
	static void multiply() {
		System.out.println("Multiplication of two numbers: " + (number1 * number2));
	}
	public static void main(String[] args) {
		StaticVariables staticVariables = new StaticVariables();
		staticVariables.addition();
		staticVariables.multiply();
	}
}
