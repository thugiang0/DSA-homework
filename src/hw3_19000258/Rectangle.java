// Ex2 (4/5)

package hw3_19000258;

public class Rectangle extends Shape {
	private double width = 0;
	private double height = 0;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	protected double getVolume() {
		return 0;
	}

	protected double getArea() {
		return width * height;
	}

	protected double getPerimeter() {
		return 2 * width * height;
	}
	
	public String toString() {
		return String.format("\nHinh chu nhat chieu rong %.2f, chieu dai %.2f, co chu vi C = %.2f ", 
							this.width, this.height, getPerimeter());
	}
}
