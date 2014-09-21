package code.practise.WebExample;
import java.util.Scanner;

public class subString {
	public static void main (String args[])
	{
		String string, subString;
		int c, i;
		System.out.println("Please enter a string to find its substring");
		Scanner inputString = new Scanner (System.in);
		string = inputString.nextLine();
		int length = string.length();
		System.out.println("The sub string of the string \""+string+"\"are :-");
		for (c =0; c < length; c++)
		{
			for (i = 1; i <= length - c; i++)
			{
				subString = string.substring(c, c+i);
				System.out.println("The substring of a string is: "+subString);
			}
		}
	}

}
