package com.daniweb.example;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
//		System.out.print("Please enter a number: ");
		int input, prompt;
		Scanner inputScanner = new Scanner(System.in);
//		input = inputScanner.nextInt();
//		Scanner userPrompt = new Scanner(System.in);
		
		try{
			A:for(;;){
				System.out.print("Please enter a number: ");
				input = inputScanner.nextInt();
				if(input % 2 == 0){
					System.out.println("The given number is an even number!\n");	
				}
				else {
					System.out.println("The given number is an odd number!!!");	
				}				
				for(;;){
					System.out.println("Press 1 to try again or 2 to quit");
//					prompt = userPrompt.nextInt();
					input = inputScanner.nextInt();
					if(input == 1){
//						System.out.println("Press 1 to try again.");
						continue A;
					}
					else if (input == 2) {
						System.out.println("Quitting");
						break A;
					}
					else {
						System.out.println("Please provide a valid input");
						continue;
					}
				}
			}//A:

		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		finally{
			inputScanner.close();
//			userPrompt.close();
			
		}	
		
	}

}
