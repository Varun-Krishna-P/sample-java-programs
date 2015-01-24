package code.practise.Myexample;

import java.util.Scanner;

public class CountNumbers {
	public static int count(int number) {
		int i = 0;
		int num = number;
		while(num > 0 ){
			num = num / 10;
			i ++;
		}
		System.out.println("The length of the '"+ number + "' is : " +i);
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
