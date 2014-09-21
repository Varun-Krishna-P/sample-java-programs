package code.practise.CompleteReference.FifthEdition.Example;

class TestReturnObj{
	int a;
	TestReturnObj(int a){
		this.a = a;
	}
	
	TestReturnObj incrByTen(){
		TestReturnObj temp = new TestReturnObj(a+10);
		return temp;
	}
}
public class ReturningObjects {
	
	public static void main(String args[]){
		TestReturnObj testReturnObj1 = new TestReturnObj(2);
		TestReturnObj testReturnObj2;
		testReturnObj2 = testReturnObj1.incrByTen();
		System.out.println("testReturnObj1.a: "+testReturnObj1.a);
		System.out.println("testReturnObj2.a: "+testReturnObj2.a);
		testReturnObj2 = testReturnObj2.incrByTen();
		System.out.println("testReturnObj2.a after second increment: "+testReturnObj2.a);
	}

}
