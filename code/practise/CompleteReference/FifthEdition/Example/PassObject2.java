package code.practise.CompleteReference.FifthEdition.Example;

class BoxConstructor2{
	double width, height, depth;
	BoxConstructor2 (BoxConstructor2 boxConstructor2){
		width = boxConstructor2.width;
		height = boxConstructor2.height;
		depth = boxConstructor2.depth;
	}
	
	BoxConstructor2(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	BoxConstructor2(){
		width = height= depth = -1;
	}
	
	BoxConstructor2(double length){
		width = height = depth = length;
	}
	double volume(){
		return width * height * depth;
	}
}
public class PassObject2 {
	public static void main(String[] args){
		BoxConstructor2 boxConstructor2 = new BoxConstructor2(10,20,30);
		BoxConstructor2 boxConstructor2_2 = new BoxConstructor2();
		BoxConstructor2 boxConstructor2_3 = new BoxConstructor2(8);
		BoxConstructor2 boxConstructor2_4 = new BoxConstructor2(boxConstructor2);
		System.out.println("The volume of boxConstructor2 is: "+boxConstructor2.volume());
		System.out.println("The voulume of boxConstructor2_2 is: "+boxConstructor2_2.volume());
		System.out.println("The voulume of boxConstructor2_3 is: "+boxConstructor2_3.volume());
		System.out.println("The volume of boxConstructor2_4 is: "+boxConstructor2_4.volume());
	}

}
