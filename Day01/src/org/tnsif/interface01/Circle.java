package org.tnsif.interface01;

class Circle implements Shape {
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		//System.out.println("Perimeter of the circle is: ");
		return 2 * Math.PI * radius;
	}

}
