package code.practise.CompleteReference.FifthEdition.Example;

class OverloadDemo2 {
	void test(){
		System.out.println("No parameters");
	}
	
	void test (double a){
		System.out.println("Inside test(double) a: " +a);
	}
	
	void test (int a, int b){
		System.out.println("a: "+a+" b: "+b);
	}
}
public class Overload2 {
	public static void main(String args[]){
		OverloadDemo2 overloadDemo2 = new OverloadDemo2();
		int i = 10;
		overloadDemo2.test();
		overloadDemo2.test(i);
		overloadDemo2.test(123.45);
		overloadDemo2.test(10, 10);
		
	}

}
