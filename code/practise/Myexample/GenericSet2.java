package code.practise.Myexample;

import java.util.HashSet;
import java.util.Set;

public class GenericSet2 {
//	This version uses Foreach loop for iterating over the string set.
	public static void main(String[] args) {
		Set<String> stringSet = new HashSet<>();
		stringSet.add("Hello World");
		stringSet.add("This is the Set");
		
		for (String string : stringSet) {
			System.out.println("The contents of the stringSet is: "+string);
			
		}
	}

}
