package code.practise.lang.Package;

public class BooleanDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b1, b2;
		boolean result;
		b1 = new Boolean(true);
		b2 = new Boolean(false);
		result = b1.equals(b2);
		String str = "b1: "+ b1 + "and b2: "+ b2 + "are they equal ? "+result;
		System.out.println(str);

	}

}