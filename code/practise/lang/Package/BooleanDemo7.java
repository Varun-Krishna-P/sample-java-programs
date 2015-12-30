package code.practise.lang.Package;

public class BooleanDemo7 {
	public static void main(String[] args) {
		Boolean b1, b2;
		boolean bool1, bool2;
		bool1 = true;
		bool2 = false;
		b1 = Boolean.valueOf(bool1);
		b2 = Boolean.valueOf(bool2);
		String s1 = "Boolean instance of the primitive :"+ bool1 + " is " + b1;
		String s2 = "Boolean instance of the primitive: "+ bool2 + " is " + b2;
		System.out.println(s1);
		System.out.println(s2);
	}

}
