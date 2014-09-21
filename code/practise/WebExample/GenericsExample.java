package code.practise.WebExample;

public class GenericsExample {
	public static <E> void printArray (E[] inputArray){
		for (E element : inputArray){
			System.out.printf("%s ", element);			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer [] intArray = {1,2,3,4,5,6};
		Double[] doubleArray = {1.0,2.0,3.0,4.0,5.0,6.0};
		Character[] characterArray = {'a','b','c','d','e','f'};
		System.out.println("The contents of intArray");
		printArray(intArray);
		System.out.println("The contents of double array");
		printArray(doubleArray);
		System.out.println("The contentsof the character array");
		printArray(characterArray);
		
	}

}
