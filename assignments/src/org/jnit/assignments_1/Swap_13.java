package org.jnit.assignments_1;
// Write a program to swap two numbers with out using a third ?
public class Swap_13 {
	public static void main(String [] args){
		int a = 2;
		int b = 3;
		
		a = a + b;
		b = a - b;	
		a = a - b;
		
		System.out.println("b "+b);
		System.out.println("a "+a);
	}
}
