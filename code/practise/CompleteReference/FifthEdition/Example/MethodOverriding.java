package code.practise.CompleteReference.FifthEdition.Example;

class A2 {
	int i, j;
	A2(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	void show() {
		System.out.println("i and j: "+i+" "+j);
	}
}

class B2 extends A2 {
	int k;
	B2(int i, int j, int k){
		super(i,j);
		this.k = k;
	}
	
	void show(){
		super.show();
		System.out.println("K: "+k);
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		B2 b2 = new B2(1, 2, 3);
		b2.show();
	}

}
