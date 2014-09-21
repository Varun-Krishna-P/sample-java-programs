package code.practise.WebExample;
import java.util.Scanner;
public class swapping {
	public static void main (String args[])
	{
		int x, y, temp;
		System.out.println("Please enter the values for \'x\'and \'y\'");
		Scanner input = new Scanner (System.in);
		x = input.nextInt();
		y = input.nextInt();
		System.out.println("Before swapping \n\'x\':"+x+"\nand \'y':"+y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping\n\'x\':" +x+ "\nand\'y\':"+y);
	}

}
