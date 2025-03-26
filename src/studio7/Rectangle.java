package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double area () {
		double area = length * width;
		return area;
	}
	
	public double perimeter () {
		double perimeter = 2*length + 2* width;
		return perimeter;
	}
	
	public boolean bigger (Rectangle lauren) {
		if (this.area() > lauren.area()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean square() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		Rectangle bob = new Rectangle (3, 4);
		System.out.println(bob.area ());
		System.out.println(bob.perimeter());
		Rectangle lauren = new Rectangle (5,1);
		System.out.println(bob.bigger(lauren));
		
	}

}
