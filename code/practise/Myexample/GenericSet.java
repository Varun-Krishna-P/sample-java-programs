package code.practise.Myexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericSet {
	public static void main(String[] args) {
//		This example uses Iterator for iterating the strings in the set
		Set<String> stringSet = new HashSet<>();
		stringSet.add("Hello World");
		stringSet.add("This is a Set");
		
		Iterator<String> iterator = stringSet.iterator();
		
		while (iterator.hasNext()) {
			String string =  iterator.next();
			System.out.println("The contents of the stringSet is: "+string);
			
		}		
		
	}

}
