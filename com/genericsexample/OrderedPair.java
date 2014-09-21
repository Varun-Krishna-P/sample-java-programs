package com.genericsexample;

import com.genericsexample.Pair;

public class OrderedPair<K, V> implements Pair<K, V> {
	private K key;
	private V value;
	
	public OrderedPair(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey(){
		return key;
	}
	
	public V getValue(){
		return value;
	}

}

class DemoOrderedPair{
	public static void main(String[] args) {
		Pair<String, Integer> pair1 = new OrderedPair<String, Integer>("String1", 101);
		System.out.println("The value of Key is: "+pair1.getKey());
		System.out.println("The value is: "+pair1.getValue());
		
		Pair<String, String> pair2 = new OrderedPair<String, String>("String", "String");
		System.out.println("The key is: "+pair2.getKey());
		System.out.println("The value is: "+pair2.getValue());
	}
}