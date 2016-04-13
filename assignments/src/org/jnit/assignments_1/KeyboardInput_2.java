package org.jnit.assignments_1;
//Write a program that takes two numbers as user input and prints the sum, mul result
import java.util.Scanner;

class KeyboardInput_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		// Why this local variable has to be converted to field
		System.out.println("Please Enter 2 integers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int sum = a + b;
		int mul = a * b;
		
		System.out.println("Sum and Product of entered 2 integers are "+sum+", "+mul);
		scanner.close();
	}

}
