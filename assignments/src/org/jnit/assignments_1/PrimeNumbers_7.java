package org.jnit.assignments_1;
// Write a program to check if a number is a prime number or not  and print prime numbers from 1 to 100?
class PrimeNumbers_7 {
	public static void main(String[] args) {
		System.out.println("---------Prime Numbers from 1 to 100----------");
		System.out.println("---------Number 1 is a prime----------");
		System.out.println("---------Number 2 is a prime----------");
		int j;
		for(int i=3; i <=100; i++){
			j=2;
			while(j<i){
				//System.out.println("i="+i+", j="+j);
				if(i%j!=0){
					j++;
					if(i==j)
						{
							System.out.println(i+" is a Prime nummber");
							break;
						}
					continue;
				}else {
					//System.out.println(i+" is Not a Prime nummber");
					break;
				}
				
			}
			//System.out.println("Numer "+i+" is a prime");
		}
	}
}
