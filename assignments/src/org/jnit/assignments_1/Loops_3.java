package org.jnit.assignments_1;
//write a program that prints numbers from 1 to 10 using for, while and do-while loop ?
class Loops_3 {

	public static void main(String[] args) {
		int i;
		System.out.println("---------Ascending----------");
		System.out.println("---------For Loop----------");
		for(i=1;i<=10;i++){
			System.out.println(i);
		}
		System.out.println("---------while Loop----------");
		i = 1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		System.out.println("---------do-While Loop----------");
		i = 1;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);
		
	}

}
