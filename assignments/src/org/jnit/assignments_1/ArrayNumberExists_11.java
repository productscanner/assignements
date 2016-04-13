package org.jnit.assignments_1;
//Write a program to check if given number exists in an array ?
import java.util.Scanner;

public class ArrayNumberExists_11 {
	public static void main(String [] args){
		int [] array = {1,2,3,4,5};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer");
		int x = scanner.nextInt();
		for(int i=0;i<array.length;i++){
			System.out.println(i);
			if (array[i] == x){
				System.out.println("Number "+x+" exists in the array");
				break;
			}else if(i==array.length-1){
				System.out.println("Number "+x+" does'nt exists in the array");
			}
		}
		scanner.close();
	}
}
