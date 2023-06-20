package com.wipro.variables;

public class InstanceVariables {
	// Instance variables
	int num1 = 4109;
	int num2 = 389;
	
	private void add() {
		System.out.println("The addition of two numbers:  "+(num1 + num2));
	}
	private void mul() {
		System.out.println("The multiplication of two numbers:  "+(num1 * num2));
	}
	public static void main(String[] args) {
		InstanceVariables instanceVariables = new InstanceVariables();
		instanceVariables.add();
		instanceVariables.mul();
	}
}
