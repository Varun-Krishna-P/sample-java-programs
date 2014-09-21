package code.practise.Myexample;

import java.util.ArrayList;
import java.util.List;

public class GenericLists {
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("ASDF");
		stringList.add("QWERTY");
		stringList.add("ZXCV");
		
		for (String strList : stringList) {
			
			System.out.println("The values of String list is: "+strList);
		}
	}

}
