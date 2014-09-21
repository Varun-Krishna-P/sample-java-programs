/**
 * 
 */
package code.practise.CompleteReference.FifthEdition.Example;

/**
 * @author Varunkrishna
 *
 */
// Using run-time Polymorphism

class Figure {
	double dimension1, dimension2;
	
	Figure (double dimension1, double dimension2){
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}
	
	double area(){
		System.out.println("Area of the Figure is undefined.");
		return 0;
	}
}

class Rectangle extends Figure {
	Rectangle(double dimension1, double dimension2){
		super(dimension1, dimension2);
	}
	
	double area(){
		System.out.println("Inside the Area For Rectangle");
		return dimension1 * dimension2;
	}
}

class Triangle extends Figure {
	Triangle(double dimension1, double dimension2){
		super(dimension1, dimension2);
	}
	
	double area(){
		System.out.println("Inside Area for Triangle.");
		return dimension1 * dimension2 / 2;
	}
}

public class FindAreas {
	public static void main(String[] args) {
		Figure figure = new Figure(10, 10);
		Rectangle rectangle = new Rectangle(15.0, 5.5);
		Triangle triangle = new Triangle(5.5, 15.2);
		Figure figureReference;
		
		figureReference = figure;
		System.out.println("The area of the figure is: "+figureReference.area());
		
		figureReference = rectangle;
		System.out.println("The area of the Rectangle is: "+figureReference.area());
		
		figureReference = triangle;
		System.out.println("The area of the triangle is: "+figureReference.area());
	}

}
