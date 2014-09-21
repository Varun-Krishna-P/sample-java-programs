package code.practise.CompleteReference.FifthEdition.Example;

class Box2 {
	private double width,height, depth;
	
	Box2(Box2 box){
		this.width = box.width;
		this.height = box.height;
		this.depth = box.depth;
	}
	
	Box2(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	Box2(){
		width = height = depth = -1;
	}
	
	Box2(double length){
		width = height = depth = length;
	}
	
	double volume(){
		return width * height * depth;
	}
}

class BoxWeight2 extends Box2 {
	double weight;
	
	BoxWeight2 (BoxWeight2 boxWeight2){
		super(boxWeight2);
		weight = boxWeight2.weight;
	}
	
	BoxWeight2 (double width, double height, double depth, double weight){
		super(width, height, depth);
		this.weight = weight;
	}
	
	BoxWeight2 (){
		super();
		weight = -1;
	}
	
	BoxWeight2(double length, double weight){
		super(length);
		this.weight = weight;
	}
}

class Shipment extends BoxWeight2{
	double cost;
	Shipment(Shipment shipment){
		super(shipment);
		cost = shipment.cost;
	}
	
	Shipment(double width, double height, double depth, double weight, double cost){
		super(width, height, depth, weight);
		this.cost = cost;
	}
	
	Shipment(){
		super();
		cost = -1;
	}
	
	Shipment(double length, double width, double cost){
		super(length, width);
		this.cost = cost;
	}
}

public class DemoShipment {
	public static void main(String[] args) {
		Shipment shipment1 = new Shipment(10, 20, 30, 40, 50);
		Shipment shipment2 = new Shipment(5, 10, 15, 20, 25);
		
		System.out.println("The volume of shipment1 is: "+shipment1.volume());
		System.out.println("The weight of shipment1 is: "+shipment1.weight);
		System.out.println("The cost of shipment1 is: "+shipment1.cost+"\n");
		
		System.out.println("The volume of shipment2 is: "+shipment2.volume());
		System.out.println("The weight of shipment2 is: "+shipment2.weight);
		System.out.println("The cost of shipment2 is: "+shipment2.cost);
	}
}
