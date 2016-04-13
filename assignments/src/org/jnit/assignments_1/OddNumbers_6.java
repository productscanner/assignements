package org.jnit.assignments_1;
//Write a program to print odd numbers from 1 to 100
class OddNumbers_6 {

	public static void main(String[] args) {
		System.out.println("---------Odd Numbers from 1 to 100----------");
		for(int i=1; i <=100; i++){
			if(i%2==1){
				System.out.println("Odd Number "+i);
			}else 
				continue;
		}
	}

}
