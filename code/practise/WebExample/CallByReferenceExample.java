package code.practise.WebExample;

public class CallByReferenceExample {
	public static void main(String args[]){
		Number number1 = new Number();
		number1.x = 5;
		System.out.println("Value of number1.x before calling increment() is: "+number1.x);
		increment(number1);
		System.out.println("Value of number1.x after calling increment() is: "+number1.x);
	}
	
	public static void increment(Number n){
		System.out.println("Value of a n.x before incrementing x is: "+n.x);
		n.x = n.x+1;
		System.out.println("Value of n.x after incrementing x is: "+n.x);
	}

}

class Number {
	int x;
}