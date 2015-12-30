package code.practise.lang.Package;

public class BooleanDemo5 {
	public static void main(String... x){
		String s1 = "tRue";
		String s2 = "yes";
		
		boolean b1, b2;
		b1 = Boolean.parseBoolean(s1);
		b2 = Boolean.parseBoolean(s2);
		
		String str1 = "Parsing boolean string: "+s1+"gives the result: "+b1;
		String str2 = "Parsing boolean string: "+s2+"gives the result: "+b2;
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
