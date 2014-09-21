package code.practise.WebExample;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String args[]){
		int number, tempNumber, sum = 0, r;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an number to check whether it is an armstrong number:");
		number = input.nextInt();
		tempNumber = number;
		while(tempNumber !=0)
		{
			r = tempNumber%10;
			sum = sum + r*r*r;
			tempNumber = tempNumber/10;			
		}
		if(number ==  sum)
			System.out.println("The given number: "+number+ " is an armstrong number.");
		else
			System.out.println("The give number: "+number+ " is not an armstrong number.");
	}
}
