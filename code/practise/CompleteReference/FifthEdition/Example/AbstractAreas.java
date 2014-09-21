/**
 * 
 */
package code.practise.CompleteReference.FifthEdition.Example;

/**
 * @author Varunkrishna
 *
 */

abstract class Figure2 {
	double dimension1, dimension2;
	Figure2(double dimension1, double dimension2){
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}
	
	abstract double area();
}

class Rectangle2 extends Figure2{
	Rectangle2(double dimension1, double dimension2){
		super(dimension1, dimension2);		
	}
	double area(){
		System.out.println("Inside area for rectangle");
		return dimension1 * dimension2;
	}
}

class Triangle2 extends Figure2 {
	Triangle2(double dimension1, double dimension2){
		super(dimension1, dimension2);
	}
	
	double area(){
		System.out.println("Inside the area of Triangle");
		return dimension1 * dimension2 / 2;
	}
}

public class AbstractAreas {
	public static void main(String[] args) {
		Rectangle2 rectangle2 = new Rectangle2(10, 50);
		Triangle2 triangle2 = new Triangle2(15, 25);
		Figure2 figure2;
		
		figure2 = rectangle2;
		System.out.println("The area of the rectangle is: "+figure2.area());
		
		figure2 = triangle2;
		System.out.println("The area of the triangle is: "+figure2.area());
	}
}
