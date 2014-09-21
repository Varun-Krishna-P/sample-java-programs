/**
 * 
 */
package code.practise.CompleteReference.FifthEdition.Example;

/**
 * @author Varunkrishna
 *
 */

class A4 {
	void callMe(){
		System.out.println("Inside A's callMe method");
	}
}

class B4 extends A4{
	void callMe(){
		System.out.println("Inside B's callMe method");
	}
}

class C4 extends A4 {
	void callMe(){
		System.out.println("Inside C's callMe method");
	}
}

public class Dispatch {
	public static void main(String[] args) {
		A4 a4  = new A4();
		B4 b4  = new B4();
		C4 c4 = new C4();
		A4 a ;
		
		a = a4;
		a.callMe();
		
		a = b4;
		a.callMe();
		
		a = c4;
		a.callMe();
		
	}

}
