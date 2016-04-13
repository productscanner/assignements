package org.jnit.assignments_1;
//Write a program to check if a number is a power of 2 ?
import java.util.Scanner;

public class PowerOfTwo_12 {
	 void exponentCheker(int num){
		int i=0;
		boolean loop = true;
		//System.out.println(Math.pow(2,i));
		while(loop){
			//System.out.println(Math.pow(2,i));
			if(num == Math.pow(2, i))
			{
				System.out.println("Entered number is a power of 2");
				loop = false;
			}else if(num <Math.pow(2,i)){
				System.out.println("Entered number is not a power of 2");
				loop = false;
			}
			i++;
		}		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x = scanner.nextInt();
		PowerOfTwo_12 object = new PowerOfTwo_12();
		object.exponentCheker(x);
		scanner.close();
	}
}
