package code.practise.lang.Package;
//Code to demonstrate the use of boolean value
//The Boolean class wraps a value of the primitive type boolean in an object. 
//An object of type Boolean contains a single field whose type is boolean.
public class BooleanDemo {

	/**
	 * @param args
	 */
//	public static void main(String[] args){}
	public static void main(String... args) {
		// TODO Auto-generated method stub
		Boolean b;
		b = new Boolean(true);
		boolean b1;
		b1 = b.booleanValue();		
		String str = "Primitive value of boolean object "+ b +" is "+ b1;
		System.out.println(str);
	}

}
