package code.practise.lang.Package;

public class BooleanDemo8 {
	public static void main(String[] args) {
		Boolean b1, b2;
		String s1 = null;
		String s2 = "false";
		b1 = Boolean.valueOf(s1);
		b2 = Boolean.valueOf(s2);
		
		String str1 = "Boolean instance of the string "+ s1 +" is: "+b1;
		String str2 = "Boolean instance of the string "+ s2 +" is: "+b2;
		System.out.println(str1);
		System.out.println(str2);
	}

}
