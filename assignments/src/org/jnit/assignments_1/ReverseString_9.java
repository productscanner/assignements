package org.jnit.assignments_1;
//Write a program to reverse a string without using stringbuffer.reverse
import java.util.Scanner;

public class ReverseString_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to be reversed");
		String x = scanner.nextLine();
		String reversedString = "";
			
		for(int i=x.length()-1;i>=0;i--){
			reversedString = reversedString +x.charAt(i);
		}
		
		System.out.println("Reversed String is "+reversedString);
		scanner.close();
		
	}
	
}
