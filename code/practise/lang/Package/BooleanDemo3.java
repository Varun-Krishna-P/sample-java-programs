package code.practise.lang.Package;

public class BooleanDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b1, b2;
		System.setProperty("demo1", "true");
		System.setProperty("demo2", "a value");
		String s1 = System.getProperty("demo1");
		String s2 = System.getProperty("demo2");
		b1 = Boolean.getBoolean("demo1");
		b2 = Boolean.getBoolean("demo2");
		String str1 = "boolean value of system property demo1: "+b1;
		String str2 = "System propert value of demo1 is: "+s1;
		String str3  = "Boolean value of system property demo2 is: "+b2;
		String str4 = "System property value of demo2 is: "+s2;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
