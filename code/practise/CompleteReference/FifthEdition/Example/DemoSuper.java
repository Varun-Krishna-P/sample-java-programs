package code.practise.CompleteReference.FifthEdition.Example;

class Box1 {
	private double width;
	private double height;
	private double depth;
	
	Box1(Box1 box){
		width = box.width;
		height = box.height;
		depth = box.depth;
	}
	Box1 (double width, double height, double depth){
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	
	Box1(){
		width = height = depth = -1;
	}
	
	Box1(double length){
		width = height = depth = length;
	}
	
	double volume (){
		return width * height * depth;
	}
}

class BoxWeight1 extends Box1 {
	double weight;
	
	BoxWeight1 (BoxWeight1 boxWeight1){
		super(boxWeight1);
		weight = boxWeight1.weight;
	}
	
	BoxWeight1(double width, double height, double depth, double weight){
		super(width, height,depth);
		this.weight = weight;
	}
	
	BoxWeight1(){
		super();
		weight = -1;
	}
	
	BoxWeight1 (double lenght, double weight){
		super(lenght);
		this.weight = weight;
	}
}

public class DemoSuper {
	
	public static void main(String[] args) {
		BoxWeight1 boxWeight1 = new BoxWeight1(10, 20, 30, 40);
		BoxWeight1 boxWeight2 = new BoxWeight1(2, 3, 4, 5);
		BoxWeight1 boxWeight3 = new BoxWeight1();
		BoxWeight1 boxWeight4 = new BoxWeight1(10, 20);
		BoxWeight1 boxWeight5 = new BoxWeight1(boxWeight1);
		
		System.out.println("The volume of boxWeight1 is: "+boxWeight1.volume());
		System.out.println("The weight of boxWeight1 is: "+boxWeight1.weight);
		
		System.out.println("The volume of boxWeight2 is: "+boxWeight2.volume());
		System.out.println("The weight of boxWeight2 is: "+boxWeight2.weight);
		
		System.out.println("The volume of boxWeight3 is: "+boxWeight3.volume());
		System.out.println("The weight of boxWeight3 is: "+boxWeight3.weight);
		
		System.out.println("The volume of boxWeight4 is: "+boxWeight4.volume());
		System.out.println("The weight of boxWeight4 is: "+boxWeight4.weight);
		
		System.out.println("The volume of boxWeight5 is: "+boxWeight5.volume());
		System.out.println("The weight of boxWeight5 is: "+boxWeight5.weight);
	}

}
