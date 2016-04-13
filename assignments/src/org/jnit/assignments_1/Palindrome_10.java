package org.jnit.assignments_1;
//Write a program to check id given string is a palindrome ?
import java.util.Scanner;

public class Palindrome_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------Palindrome Check---------------");
		System.out.println("Please enter a string");
		String x = scanner.nextLine();
		String reversedString = "";
			
		for(int i=x.length()-1;i>=0;i--){
			reversedString = reversedString +x.charAt(i);
		}
		
		System.out.println(reversedString);
		
		if (x.equalsIgnoreCase(reversedString))
		{
			System.out.println("Entered String is a Palindrome");
		}else{
			System.out.println("Entered String is not a Palindrome");
		}
		scanner.close();
	}


}
