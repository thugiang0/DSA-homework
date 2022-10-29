// Ex2 (5/5)

package hw3_19000258;

import java.util.ArrayList;

public class ShapeTest {
	
	public static void main(String[] args) {
		ArrayList<Shape> shape = new ArrayList<>();
		
		shape.add(new Circle(4));
		shape.add(new Sphere(6.5));
		shape.add(new Rectangle(7.5, 8));
		
		for (int i = 0; i < shape.size(); i++) {
			System.out.println(shape.get(i).toString());
		}
	}
}
