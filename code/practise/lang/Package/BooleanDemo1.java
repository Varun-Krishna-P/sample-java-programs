package code.practise.lang.Package;

public class BooleanDemo1 {

	/**
	 * zero - if this object represents the same boolean value as the argument

	 *	a positive value - if this object represents true and the argument represents false

	 *  a negative value - if this object represents false and the argument represents true.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b1, b2;
		b1 = new Boolean(true);
		b2 = new Boolean(false);
		int result;
		result = b1.compareTo(b2);
		String s1 = new String("Both values are equal");
		String s2 = new String("Object value is equal");
		String s3 = new String("Argument value is equal");
		if(result == 0){
			System.out.println(s1);
		}
		else if(result > 0){
			System.out.println(s2);
		}
		else {
			System.out.println(s3);
		}

	}

}
