package com.tns.dsaprogram;

import java.util.Scanner;

public class WordsWithLettersAndNumbers {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the sentence : ");
	String sentence =scanner.nextLine();
	
	String[] words=sentence.split(" ");
	
	System.out.println("words containg  both lettes ");
	
	for(String word : words) {
		boolean hasLetter = false;
		boolean hasNumber = false;
		
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(Character.isLetter(ch)) {
				hasLetter=true;
			}
				if(Character.isDigit(ch)) {
					
					hasNumber=true;
				}
			}
		
		  	
	
		
		if(hasLetter && hasNumber) {
			System.out.println(word);
		}
	}
	
	
	
	
}
}
