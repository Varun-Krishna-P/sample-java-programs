package code.practise.CompleteReference.FifthEdition.Example;

class TestCallByValue
{
	void testMethod(int a, int b){
		a *= 2;
		b /= 2;
	}
}
public class CallByValueExample {
	public static void main (String[] args){
		int a = 10 , b = a;
		TestCallByValue testCallByValue = new TestCallByValue();
		System.out.println("The a and b berfore calling testMethod(): "+a+" "+b);
		testCallByValue.testMethod(a,b);
		System.out.println("The a and b after calling testMethod(): "+a+" "+b);
	}

}
