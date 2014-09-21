package com.genericsexample;

public class GenericBox<T> {
	private T t;
	
	public void set(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
}

class DemoGenericBox {
	public static void main(String[] args) {
		GenericBox<Integer> integerBox = new GenericBox<>();
		integerBox.set(123);
		System.out.println("The value of the integerBox is: "+integerBox.get());
		
		GenericBox<String> stringBox = new GenericBox<>();
		stringBox.set("Hello world!!!");
		System.out.println("The value of the stringBox is: "+stringBox.get());
	}
}
