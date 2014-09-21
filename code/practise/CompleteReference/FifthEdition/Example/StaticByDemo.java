package code.practise.CompleteReference.FifthEdition.Example;

class StaticDemo{
	static int a = 42;
	static int b = 99;
	static void callMe(){
		System.out.println("a = "+a);
	}
}

public class StaticByDemo {
	public static void main(String[] args) {
		StaticDemo.callMe();
		System.out.println("b = " +StaticDemo.b);
	}
}
