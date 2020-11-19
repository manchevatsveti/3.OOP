package edu.smg;

public class TestTriangle {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3,4,5);
		System.out.println(triangle.printTriangle());
		System.out.println("Area: "+ triangle.getArea());
		System.out.println("Perimeter: "+ triangle.getPerimeter());
		triangle.setColor("blue");
		triangle.setFilled(true);
		System.out.println(triangle.toString());
		
	}

}
