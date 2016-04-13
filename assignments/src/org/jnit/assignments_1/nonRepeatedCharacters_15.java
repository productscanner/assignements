package org.jnit.assignments_1;
//Write a program to print the first non repeated character in a string ?
public class nonRepeatedCharacters_15 {
	public static void main(String [] args){
		String x = "hello";
		boolean loop = true;
		int i = 0;
		int j = 0;
		int [] numberTracker =  new int[x.length()]; 
		for(i=0;i<x.length();i++){
			for(j=i+1;j<x.length();j++){
				if(x.charAt(i)== x.charAt(j)){
					numberTracker[i]++; 
				}else{
					continue;
				}
			}
		}
		
		for(i=0;i<x.length();i++){
			if(numberTracker[i]==0){
				System.out.println("First non-repeated character in the string is "+x.charAt(i));
				break;
			}
			
		}
	}
}
