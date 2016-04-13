package org.jnit.assignments_1;
// Write a program to check if a string is a anagram ?
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Anagram_14 {

	void anagramChecker(String word1, String word2){
		boolean loop = true;
		if(word1.length() != word2.length()){
			System.out.println("These are not anagrams of each other");
		}else{
			for(int i=0; i<word1.length(); i++){
				int loopEnd = word1.indexOf(word2.charAt(i));
				if(loopEnd<0){
					System.out.println("The two entered strings are not anagrams");
					loop = false;
					break;
				}	
			}
			if(loop){
				System.out.println("The two entered strings are anagrams");
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 2 words to check for anagram");
		
		String word1 = scanner.nextLine();
		String word2 = scanner.nextLine();
		Anagram_14 object = new Anagram_14();
		object.anagramChecker(word1, word2);
		
		scanner.close();
	}

}
