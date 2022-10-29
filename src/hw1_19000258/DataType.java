// Bai 1: Kieu du lieu

package hw1_19000258;
import java.util.Scanner;
public class DataType {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhap gia tri boolean: ");
		boolean a = scan.nextBoolean();
		System.out.println(a);
		
		System.out.print("Nhap gia tri byte: ");
		byte b = scan.nextByte();
		System.out.println(b);
		
		System.out.print("Nhap gia tri short: ");
		short c = scan.nextShort();
		System.out.println(c);
		
		System.out.print("Nhap gia tri int: ");
		int d = scan.nextInt();
		System.out.println(d);
		
		System.out.print("Nhap gia tri long: ");
		long e = scan.nextLong();
		System.out.println(e);
		
		System.out.print("Nhap gia tri float: ");
		float f = scan.nextFloat();
		System.out.println(f);
		
		System.out.print("Nhap gia tri double: ");
		double g = scan.nextDouble();
		System.out.println(g);
		
		System.out.print("Nhap gia tri string: ");
		String h = scan.next();
		System.out.println(h);
	}
}
