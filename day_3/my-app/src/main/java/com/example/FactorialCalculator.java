package com.example;

// Factorial of a number

// Import libraries
import java.util.Scanner;

public class FactorialCalculator {
	
	public static long calculateFactorial(long number) {
		if(number < 0) {
			throw new IllegalArgumentException("factorial is not defined for negative numbers."); 
		}
		long factorialValue = 1;
		for(int i = 1; i <= number; i++) {
			factorialValue *= i;
		}
		return factorialValue;
	}

	public static void main( String[] args ){
		System.out.println( "------ Factorial Calculator ------" );
		System.out.println("enter a non negative integer: ");

		// accept a number as input 
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();

		// calculate the factorial
		long factorialValue =  calculateFactorial(number);

		// display the result
		System.out.println("factorial of " + number + " is " + factorialValue);
		sc.close();
	}
}
