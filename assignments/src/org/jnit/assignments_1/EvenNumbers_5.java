package org.jnit.assignments_1;
//Write a program to print even numbers from 1 to 100
class EvenNumbers_5 {

	public static void main(String[] args) {
		System.out.println("---------Even Numbers from 1 to 100----------");
		for(int i=1; i <=100; i++){
			if(i%2==0){
				System.out.println("Even Number "+i);
			}else 
				continue;
		}
	}

}
