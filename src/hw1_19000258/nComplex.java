// Bai 3: Tong nhieu so phuc

package hw1_19000258;

import java.util.Scanner;
public class nComplex {
	public static void main(String[] args) {
		double t = 0;
		double s = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scan.nextInt();
		System.out.println();
		double a[] = new double[n];
		double b[] = new double[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print(" Nhap phan thuc: ");
			a[i] = scan.nextDouble();
			System.out.print(" Nhap phan ao: ");
			b[i] = scan.nextDouble();
			if (b[i] >= 0) {
				System.out.println("So phuc " + (i+1) + " la: " + a[i] + " + " + b[i] + "i" + "\n");
			}
			else
				System.out.println("So phuc " + (i+1) + " la: " +a[i] + " - " + Math.abs(b[i])+ "i" + "\n");
		}	
		for (int i = 0; i < a.length; i++) {
			t = t + a[i];
			s = s + b[i];
		}
		if (s > 0)
			System.out.println("Tong: " + t + " + " + s + "i");
		else
			System.out.println("Tong: " + t + " - " + Math.abs(s)+ "i");
	}
}

