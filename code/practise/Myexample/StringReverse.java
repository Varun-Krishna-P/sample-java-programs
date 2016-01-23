package code.practise.Myexample;
import java.util.Scanner;
import java.lang.Exception;

public class StringReverse {

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverseString = "";
		//Scanner input = new Scanner(System.in);	
		System.out.print("PLease enter a string to reverse it.");
		//String s1 = input.nextLine();
		//System.out.println(s1.length());
		try(Scanner input = new Scanner(System.in)){
			String s1 = input.nextLine();
			for(int i = s1.length() - 1; i >= 0; i--){
				System.out.println(i);
				System.out.println(s1.charAt(i));
				reverseString += s1.charAt(i);
			}
			System.out.println("The Reversed String is: "+reverseString);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}

	}

}
