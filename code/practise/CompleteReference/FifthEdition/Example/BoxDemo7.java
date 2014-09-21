package code.practise.CompleteReference.FifthEdition.Example;

class Box7{
	double width, height, depth;
	Box7(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	double volume(){
		return width * height * depth ;
	}
}
public class BoxDemo7 {
	public static void main (String args[]){
		Box7 box1 = new Box7 (10,20,30);
		Box7 box2 = new Box7 (2,3,4);
		System.out.println("The volume of box1 is: "+ box1.volume());
		System.out.println("The volume of box2 is: "+box2.volume());
	}

}
