package code.practise.Myexample;

import java.util.Scanner;

public class CountNumbers2 {
	public static void main(String args[]){
		System.out.print("Please enter the a number to find its digits: ");
		Scanner input  = new Scanner(System.in);
		try{
			int number, i = 0 ;
			number = input.nextInt();
			while(number > 0){
				number = number / 10;
				i++;				
			}
			System.out.println("The total digits of the number is: "+i);
			
		}
		catch(Exception e){
			
		}
		finally{
			input.close();
		}
		
	}

}
