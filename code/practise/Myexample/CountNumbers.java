package code.practise.Myexample;

import java.util.Scanner;

public class CountNumbers {
	public static int count(int number) {
		int i = 0;
		while(number > 0 ){
			number = number / 10;
			i ++;
		}
		System.out.println("The length of the given number is : " +i);
		return i;
	}
	
	public static void main(String args[]){
		int number;
		System.out.print("Please enter the number to find the total digits");
		Scanner input = new Scanner(System.in);
		try{			
			number = input.nextInt();
			count(number);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			input.close();
		}
		
	}

}
