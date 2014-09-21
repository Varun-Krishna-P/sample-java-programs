package code.practise.WebExample;
import java.util.Scanner;

public class Swapping2 {
	public static void main(String args[]){
		int x, y;
		System.out.println("Please enter the values for x and y:");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		System.out.println("Before swapping\n\'x\': "+x+"\nand\'y\':"+y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping\n\'x\': "+x+"\nand\'y\':"+y);
	}

}
