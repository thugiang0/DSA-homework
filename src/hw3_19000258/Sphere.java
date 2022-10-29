// Ex2 (3/5)

package hw3_19000258;

public class Sphere extends Shape {
	
	private double radius = 0;
	
	public Sphere(double radius) {
		this.radius = radius;
	}

	protected double getVolume() {
		return 4/3 * Math.PI * Math.pow(radius, 3) ;
	}

	protected double getArea() {
		return 4 * Math.PI * radius;
	}

	protected double getPerimeter() {
		return 0;
	}
	
	public String toString() {
		return String.format("\nHinh cau ban kinh %.2f, co the tich V = %.2f ", this.radius, getVolume());	}

}