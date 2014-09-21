package code.practise.CompleteReference.FifthEdition.Example;

class TestAccessSpecifier{
	int a;
	public int b;
	private int c;
	
	void setC(int c){
		this.c = c;
	}
	
	int getC(){
		return c;
	}
}

public class AccessSpecifierTest {
	public static void main(String[] args) {
		TestAccessSpecifier testAccessSpecifier = new TestAccessSpecifier();
		testAccessSpecifier.a  = 10;
		testAccessSpecifier.b = 34;
//		This will not work 
//		testAccessSpecifier.c = 100;
		testAccessSpecifier.setC(35);
		System.out.println("a, b,c: "+testAccessSpecifier.a+" "+testAccessSpecifier.b+" "+testAccessSpecifier.getC());
	}

}
