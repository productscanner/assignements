package org.jnit.assignments_1;
//Write a program that prints numbers from 10 to 1 using for, while and do-while loop ?
class Loop_4 {

	public static void main(String[] args) {
		int i;
		System.out.println("---------Descending----------");
		System.out.println("---------For Loop----------");
		for(i=10;i>=1;i--){
			System.out.println(i);
		}
		System.out.println("---------while Loop----------");
		i = 10;
		while(i>=1){
			System.out.println(i);
			i--;
		}
		System.out.println("---------do-While Loop----------");
		i = 10;
		do{
			System.out.println(i);
			i--;
		}while(i>=1);
		
	}

}
