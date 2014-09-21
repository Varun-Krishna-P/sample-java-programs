package code.practise.Myexample;

public class AnonymousArithmetic {
	
//	private int number1, number2;
	
	interface Arithmetic {
		public void add(int number1 , int number2);
		public void subtract (int number1, int number2);
		public void multiply (int number1, int number2);
	}
	
	public void initialize (){
//		Arithmetic arithmetic = new ArithmeticOp();
		
		Arithmetic anonymousArithmetic = new Arithmetic () {
			public void add(int number1, int number2){
				int sum = number1 + number2;
				System.out.println("The anonymous Addition is: "+sum);
			}
			
			public void subtract (int number1, int number2){
				int difference = number1 - number2;
				System.out.println("The anonymous difference between two numbers is: "+difference);
			}
			
			public void multiply (int number1, int number2){
				int product = number1 * number2;
				System.out.println("The anonymous product of two numbers is: "+product);
			}
		};
		
		
//		arithmetic.add(10, 10);
//		arithmetic.subtract(15, 10);
//		arithmetic.multiply(2, 5);
		
		anonymousArithmetic.add(100, 10);
		anonymousArithmetic.subtract(150, 10);
		anonymousArithmetic.multiply(5, 10);		
	}	
	public static void main(String[] args) {
		AnonymousArithmetic arithmeticOperation = new AnonymousArithmetic();
		arithmeticOperation.initialize();
	}

}
