package code.practise.WebExample;
import java.util.Scanner;
public class reverseString {
	public static void main (String args[]) {
		String string1, reverseString = "";
		 System.out.println("Please enter a string to reverse it:");
		 Scanner inputString = new Scanner(System.in);
		 string1 = inputString.nextLine();
		 int originalString = string1.length();
		 for (int i =originalString- 1 ; i >=0;i--)
		 {
			 reverseString = reverseString +string1.charAt(i);
		 }
		 System.out.println("The reversed string is: "+reverseString);
//		 Palindrome of a string.
		 if (string1.equals(reverseString))
			 System.out.println("Entered String is a palindrome");
		 else
			 System.out.println("The entered string is not a palindrome");
	}

}
