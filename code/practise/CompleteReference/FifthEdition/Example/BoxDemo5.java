package code.practise.CompleteReference.FifthEdition.Example;

class Box5 {
	double width, height, depth;
	double volume(){
		return width * height * depth;
	}
	void setDimension(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
}
public class BoxDemo5 {
	public static void main (String args[]){
		Box5 box1 = new Box5();
		Box5 box2 = new Box5();
		box1.setDimension(10, 15, 20);
		box2.setDimension(5, 10, 15);
		System.out.println("The volume of box1 is: "+box1.volume());
		System.out.println("The volume of box2 is: "+box2.volume());
	}
}
