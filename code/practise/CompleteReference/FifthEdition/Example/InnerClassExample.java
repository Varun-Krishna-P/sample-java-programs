package code.practise.CompleteReference.FifthEdition.Example;

class Outer{
	int Outer_x  = 100;
	void test(){
		Inner inner = new Inner();
		inner.display();		
	}
	
	class Inner {		
		void display(){
			System.out.println("Display Outer_X = "+Outer_x);
		}
	}
}

public class InnerClassExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();		
	}
}
