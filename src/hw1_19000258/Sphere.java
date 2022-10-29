// Bai 4: Hinh cau

package hw1_19000258;
import java.util.Scanner;
public class Sphere {
	double r, x, y, z;
	public Sphere() {
	}
	public Sphere(double r, double x, double y, double z) {
		this.r = r;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double getArea() {
		return 4*Math.PI*Math.pow(this.r, 2);
	}
	public double getVolume() {
		return 4/3*Math.PI*Math.pow(this.r, 3);
	}
	public static Sphere Input() {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Nhap r: ");
		double r = scan.nextDouble();
		System.out.print(" Nhap x: ");
		double x = scan.nextDouble();
		System.out.print(" Nhap y: ");
		double y = scan.nextDouble();
		System.out.print(" Nhap z: ");
		double z = scan.nextDouble();
		Sphere A = new Sphere(r, x, y,z);
		return A;
	}
		
	public static void main(String[] args) {

		Sphere sphere1 = new Sphere();
	    System.out.println("Hinh cau 1");
		sphere1 = Input();
		System.out.println("Dien tich: " + sphere1.getArea());
		System.out.println("The tich: " + sphere1.getVolume() + "\n");
		
		Sphere sphere2 = new Sphere();
		System.out.println("Hinh cau 2");
		sphere2 = Input();
		System.out.println("Dien tich: " + sphere2.getArea());
		System.out.println("The tich: " + sphere2.getVolume() + "\n");

		double d = Math.sqrt(Math.pow((sphere1.x - sphere2.x), 2) 
				+ Math.pow((sphere1.y - sphere2.y), 2) + Math.pow((sphere1.z - sphere2.z), 2));
		if (d < Math.abs(sphere1.r - sphere2.r))
			System.out.println("Hai hinh cau bao nhau.");
		else if (Math.abs(sphere1.r - sphere2.r) < d && d < sphere1.r + sphere2.r)
			System.out.println("Hai hinh cau cat nhau.");
		else if (d > Math.abs(sphere1.r + sphere2.r))
			System.out.println("Hai hinh cau khong cat nhau");
		else 
			System.out.println("Hai hinh cau tiep xuc nhau");
	}
}
