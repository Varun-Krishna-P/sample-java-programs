package code.practise.Myexample;

public class NewForLoop2 {
	public static void main(String[] args) {
		int [] numberArray = {1,2,3,4,5,6,7,8,9,10};
		for (int i : numberArray) {
//			System.out.println(" "+i);
			numberArray[i]=0;			
			System.out.println("The value is: "+i);		
//			Why number[i] returns all zeros
//			System.out.println("The value of number array is: "+numberArray[i]);			
		}		
	}

}
