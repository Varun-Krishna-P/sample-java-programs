package code.practise.Myexample;

public class Box {
	private Object object;
	
	public void set(Object object){
		this.object = object;
	}
	
	public Object get(){
		return object;
	}
}

 class DemoBox {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("String Object");
		System.out.println("The value of box is: "+box.get());
		
		Box integerBox = new Box();
		integerBox.set(450);
		System.out.println("The value of the integerBox is: "+integerBox.get());
		
		Box booleanBox = new Box();
		booleanBox.set(true);
		System.out.println("The value of the booleanBox is: "+booleanBox.get());
	}
}
