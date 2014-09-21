package code.practise.CompleteReference.FifthEdition.Example;

class BoxConstructor{
	double width, height, depth;
	
	BoxConstructor(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	BoxConstructor(){
		width =-1;
		height = -1;
		depth = -1;
	}
	BoxConstructor(double length){
		this.width = this.height = this.depth = length;
	}
	
	double volume(){
		return width * height * depth;
	}
}
public class OverloadConstructors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxConstructor boxConstructor = new BoxConstructor(10,20,15);
		BoxConstructor boxConstructor1 = new BoxConstructor();
		BoxConstructor boxConstructor2 = new BoxConstructor(8);
		System.out.println("The volume of boxConstructor is: "+boxConstructor.volume());
		System.out.println("The volume of boxConstructor1 is: "+boxConstructor1.volume());
		System.out.println("The volume of boxConstructor2 is: "+boxConstructor2.volume());
	}

}
