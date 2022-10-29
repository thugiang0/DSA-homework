// Ex2 (2/5)

package hw3_19000258;

public class Circle extends Shape {
	
	private double radius = 0;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	protected double getVolume() {
		return 0;
	}

	protected double getArea() {
		return Math.PI * radius * radius;
	}

	protected double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return String.format("\nHinh tron ban kinh %.2f, co chu vi C = %.2f ", this.radius, getPerimeter());
	}
}
