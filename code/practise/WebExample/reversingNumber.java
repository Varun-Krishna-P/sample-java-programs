package code.practise.WebExample;

import java.util.Scanner;
public class reversingNumber {

	public static void main (String args[]){
		int number , reverseNumber = 0;
		System.out.println("Please enter a number to reverse it.");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		while (number != 0){
			reverseNumber = reverseNumber 	* 10;
			reverseNumber = reverseNumber + number%10;
			number = number / 10;			
		}
		System.out.println("The reversed Number is: " +reverseNumber);
	}
}
