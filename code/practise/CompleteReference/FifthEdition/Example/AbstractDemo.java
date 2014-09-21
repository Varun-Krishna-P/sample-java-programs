/**
 * 
 */
package code.practise.CompleteReference.FifthEdition.Example;

/**
 * @author Varunkrishna
 *
 */
// A simple demonstration of abstract class

abstract class A5{
	abstract void callMe();
	
	void callMeToo(){
		System.out.println("This is a concrete method");
	}
}

class B5 extends A5 {
	void callMe(){
		System.out.println("B's implementation of callme.");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		B5 b5 = new B5();
		b5.callMe();
		b5.callMeToo();
	}
}
