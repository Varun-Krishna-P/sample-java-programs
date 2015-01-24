package code.practise.Myexample;

import java.util.Scanner;

public class CountNumbers3 {
	public static void main(String args[]) {
		System.out.print("Please enter a number to find its total digits: ");
		Scanner input = new Scanner(System.in);
		try{
			int number = input.nextInt();
			int i = (int)Math.log10(number) + 1;
			System.out.println("The total digits of the125'"+ number + "' is: " +i);			
		}
		catch(Exception e){
			
		}
		finally{
			input.close();
		}
	}

}
