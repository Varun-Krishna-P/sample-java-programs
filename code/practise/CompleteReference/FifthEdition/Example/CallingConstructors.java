package code.practise.CompleteReference.FifthEdition.Example;

class A1{
	A1(){
		System.out.println("Inside A1's Constructor");
	}
}

class B1 extends A1{
	B1(){
		System.out.println("Inside B1's constructor");
	}
}

class C1 extends B1{
	C1(){
		System.out.println("Inside C1's constructor");
	}
}

public class CallingConstructors {
	public static void main(String[] args) {
		C1 c1 = new C1();
	}
}
