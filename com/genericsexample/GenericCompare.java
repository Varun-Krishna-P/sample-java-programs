package com.genericsexample;

public class GenericCompare {
	public static void main(String[] args) {
		
		Pair1<Integer, String>p1 = new Pair1<Integer, String>(1, "Apple");
		Pair1<Integer, String>p2 = new Pair1<Integer, String>(2, "Peach");
		boolean same = Util.<Integer,String>compare(p1, p2);
		System.out.println("Are the pairs same? "+same);
		
	}

}

class Util{
	public static <K, V> boolean compare(Pair1<K,V> p1, Pair1<K,V>p2){
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
	
}

class Pair1<K,V>{
	private K Key;
	private V value;
	
	public Pair1(K key, V value){
		this.Key = key;
		this.value = value;
	}
	
	public void setKey(K key){this.Key = key;}
	public void setValue(V value){this.value = value;}
	public K getKey(){return Key;}
	public V getValue(){return value;}
	
}
