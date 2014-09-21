package code.practise.WebExample;

public class CallByValueExample {

	public static void main(String args[]){
		int x = 3;
		System.out.println("Value of x before calling the increment() is : "+x);
		increment(x);
		System.out.println("Value of x after calling the increment() is: "+x);
	}
	
	public static void increment(int a){
		System.out.println("Value before incrementing a is: "+a);
		a = a+1;
		System.out.println("Value after incrementing a is: "+a);
	}
}
