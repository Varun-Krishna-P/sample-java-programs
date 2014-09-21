package code.practise.CompleteReference.FifthEdition.Example;

class A3{
	int i, j;
	A3(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	void show(){
		System.out.println("i and j: "+i+ " "+j);
	}
}

class B3 extends A3{
	int k;
	B3 (int i, int j, int k){
		super(i, j);
		this.k = k;
	}
	
	void show(String message){
		System.out.println(message + k);
	}
}

public class MethodOverriding2 {
	public static void main(String[] args) {
		B3 b3 = new B3(1, 2, 3);
		b3.show("The value of K: ");
		b3.show();
	}

}
