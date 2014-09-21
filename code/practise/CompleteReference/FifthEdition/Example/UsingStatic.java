package code.practise.CompleteReference.FifthEdition.Example;

public class UsingStatic {
	static int a = 3;
	static  int b;
	
	static void meth(int x){
		System.out.println("X = "+x);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
	static {
		System.out.println("Staticl block initialized.");
		b = a * 4;
	}
	public static void main(String[] args) {
		meth(50);				
	}

}
