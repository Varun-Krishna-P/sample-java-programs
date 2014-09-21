package code.practise.CompleteReference.FifthEdition.Example;

class Test{
	int a, b;
	Test(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	boolean equals(Test obj){
		if(obj.a == a && obj.b == b)
			return true;
		else 
			return false;
	}
}
public class PassObject {
	public static void main(String[] args){
		Test test = new Test(10,10);
		Test test2 = new Test(10,10);
		Test test3 = new Test(234,123);
		System.out.println("test ==  test2: "+test.equals(test2));
		System.out.println("test == test3: "+test.equals(test3));
		
	}

}
