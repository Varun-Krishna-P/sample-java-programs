package code.practise.CompleteReference.FifthEdition.Example;

class Box {
	double width;
	double height;
	double depth;
	
	Box (Box box){
		width = box.width;
		height = box.height;
		depth = box.depth;
	}
	
	Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box(double length) {
		width = height = depth = length;
	}
	
	double volume(){
        return width * height * depth;
    }
}

class BoxWeight extends Box {
	double weight;
	
	BoxWeight (double width, double height, double depth, double weight){
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.weight = weight;
	}
}

class ColorBox extends Box {
	int color;
	ColorBox(double width, double height, double depth, int color){
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.color = color;
	}
}
public class DemoBoxWeight {
	public static void main(String[] args) {
		 BoxWeight boxWeight1 = new BoxWeight(10,20,30,40);
	     BoxWeight boxWeight2 = new BoxWeight(2,3,4,5);
	     
//	     ColorBox colorBox = new ColorBox(10, 20, 30, 10);
	     
	     System.out.println("The volume of boxWeight1 is: "+boxWeight1.volume());
	     System.out.println("The weight of the boxWeight1 is: "+boxWeight1.weight);
//	     System.out.println("The details of colorBox is: "+colorBox);

	     System.out.println("The volume of boxWeight2 is: "+boxWeight2.volume());
	     System.out.println("The weight of the boxWeight2 is: "+boxWeight2.weight);
	}

}
