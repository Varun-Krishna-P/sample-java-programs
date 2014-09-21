package code.practise.Myexample;

import java.util.HashMap;
import java.util.Map;

public class GenericsMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		Integer key1 = new Integer(100);
		String value1 = new String("Some Value");
		
		map.put(key1, value1);
		map.put(150, "String Value");
		
		for (Integer akey : map.keySet()){
			String aValue = map.get(akey);
			System.out.println(""+akey + ""+aValue);
		}
		
		for (String aValue : map.values()) {
			System.out.println("The value is: "+aValue);
			
		}
	}

}
