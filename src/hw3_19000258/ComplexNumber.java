// Ex1 (2/2)

package hw3_19000258;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplexNumber {
	public static void main(String[] args) {
		ArrayList<Complex> complex = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		// nhap so cac so phuc
		System.out.print("Nhap n: ");       	    
		int n = scan.nextInt();
		
		// nhap cac phan thuc va phan ao
		for (int i = 0; i < n; i++) {             
			System.out.print("\nNhap phan thuc " + (i+1) + ": ");
			Float real = scan.nextFloat();
			System.out.print("Nhap phan ao " + (i+1) + ": ");
			Float image = scan.nextFloat();
			complex.add(new Complex(real, image));
		}
		
		// in ra cac so phuc vua nhap
		System.out.println("\nCac so phuc vua nhap: ");
		for (int i = 0; i < n; i++) {            
			System.out.println("So phuc thu " + (i+1) + ": " + complex.get(i).toString());
		}
		
		// tinh tong va tich cac so phuc vua nhap
		Complex sum = complex.get(0);
		Complex multiply = complex.get(0);
		for (int i = 1; i < n; i++) {
			sum = sum.add(complex.get(i));
			multiply = multiply.time(complex.get(i));
		}
		
		System.out.println("\nTong cua n so phuc: " + sum.toString());
		System.out.println("Tich cua n so phuc: " + multiply.toString());	
	}
}

