package code.practise.WebExample;
import java.util.Scanner;

public class factorial {

	public static void main(String facto[]){
		int num, c, factorial = 1;
		System.out.print("Please enter a number for calculating its factorial:");
		Scanner input = new Scanner(System.in);
		num = input.nextInt(); //int java.util.Scanner.nextInt(); ??
//		num = Integer.parseInt(facto[0]);
		if (num < 0)
			System.out.println("Please enter a non negative number.");
		else
		{
			for (c=1; c<=num; c++)
				factorial = factorial * c;
			System.out.println("The factorial of number " +num + " is: "+factorial);
		}
		
	}
}
