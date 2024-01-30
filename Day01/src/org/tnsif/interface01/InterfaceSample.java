package org.tnsif.interface01;

public class InterfaceSample {
	// A method that accepts any Shape and displays its area and perimeter
			private static void displayShapeInfo(Shape shape)
			{
				System.out.println("Area: " + shape.calculateArea());
				System.out.println("Perimeter: " + shape.calculatePerimeter());
				System.out.println();
			}
			

	public static void main(String[] args) {

		
		//Creating instances of circle and rectangle
		Shape circle = new Circle(5.0);
		Shape rectangle = new Rectangle(4.0,6.0);
		
		// Calculating and displaying the area and perimeter of the shape
		displayShapeInfo(circle);
		displayShapeInfo(rectangle);

	}
	

}
