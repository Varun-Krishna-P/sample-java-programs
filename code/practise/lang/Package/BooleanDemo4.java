package code.practise.lang.Package;

public class BooleanDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b1, b2;
		int i1, i2;
		String s1, s2;
		b1 = new Boolean(true);
		b2 = new Boolean(false);
		i1 = b1.hashCode();
		i2 = b2.hashCode();
		s1 = b1.toString();
		s2 = b2.toString();
		System.out.println("The hashCode() for b1 is: "+i1);
		System.out.println("The hashCode() for b2 is: "+i2);
		System.out.println("The toString() for b1 is: "+s1);
		System.out.println("The toString() for b2 is: "+s2);

	}

}
