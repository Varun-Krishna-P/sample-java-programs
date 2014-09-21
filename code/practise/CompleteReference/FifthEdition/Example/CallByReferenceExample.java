package code.practise.CompleteReference.FifthEdition.Example;

class TestCallByReference{
	int a, b;
	TestCallByReference (int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void testMethod(TestCallByReference testCallByReference){
		testCallByReference.a *= 2;
		testCallByReference.b /= 2;
	}
}
public class CallByReferenceExample {
	public static void main(String[] args){
		TestCallByReference testCallByReference = new TestCallByReference(10,20);
		System.out.println("testCallByReference.a and testCallByReference.b before calling testMethod(): "+testCallByReference.a+" "+testCallByReference.b);
		testCallByReference.testMethod(testCallByReference);
		System.out.println("testCallByReference.a and testCallByReference.b after calling testMethod(): "+testCallByReference.a+" "+testCallByReference.b);
	}

}
