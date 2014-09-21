package code.practise.CompleteReference.FifthEdition.Example;

class OverloadDemo1{
	void test()
	{
		System.out.println("No parameters");
	}
	
	void test(int a){
		System.out.println("a: "+a);
	}
	
	void test (int a, int b){
		System.out.println("a: "+a+" b: "+b);
	}
	
	double test(double a){
		System.out.println("double a: "+a);
		return a * a;		
	}
	
	String test(String s){
		return s +" Hello world";
	}
}
public class Overload1 {
	public static void main(String args[]){
		OverloadDemo1 overloadDemo1 = new OverloadDemo1();		
		overloadDemo1.test();
		overloadDemo1.test(10);
		overloadDemo1.test(10, 10);
		System.out.println(overloadDemo1.test("Hi"));
		System.out.println("Resule of overloadDemo1.test(123.45 is: " +overloadDemo1.test(123.45));
	}

}
