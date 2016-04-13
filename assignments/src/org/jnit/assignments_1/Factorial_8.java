package org.jnit.assignments_1;
//Write a program to print factorial of a given number with and with out recursion ?
import java.util.Scanner;

class Factorial_8 {
		static int product = 1;
	public static int factorialMethod(int num){ //num = 5	
		if(num <= 1){
			return product;
		}else{ 	
			//System.out.println(num);
			product = num * product;
			factorialMethod(num-1); 
			//return (product * factorialMethod(num));
		}
		return product;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x  = scanner.nextInt();
		int y = x;
		System.out.println("-------------Factorial of a number without recursion-----------------");
		int factorial_of_x = 1;
		while(x > 0){
			factorial_of_x = factorial_of_x * x;
			x--;
		}
		System.out.println("Factorial of number x is "+factorial_of_x);
		
		System.out.println("\n\n-------------Factorial of a number with recursion-----------------");
		System.out.println("Factorial of number x is "+factorialMethod(y));
		scanner.close();
	}

}
