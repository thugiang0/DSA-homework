// Bai 3: Tong, tich 2 so phuc

package hw1_19000258;
import java.util.Scanner;
public class Complex {
	double thuc, ao;
	public static Complex Input() {
		Complex x = new Complex();
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap phan thuc: ");
		x.thuc = scan.nextDouble();
		System.out.print("Nhap phan ao: ");
		x.ao = scan.nextDouble();
		return x;
	}
	public static void Tong(Complex a, Complex b) {
		Complex tong = new Complex();
		tong.thuc = a.thuc + b.thuc;
		tong.ao = a.ao + b.ao;
		if (tong.ao >= 0)
			System.out.println("Tong: "+ tong.thuc + " + " + tong.ao + "i");
		else
			System.out.println("Tong: "+ tong.thuc + " - " + Math.abs(tong.ao) + "i");
	}
	public static void Tich(Complex a, Complex b) {
		Complex tich = new Complex();
		tich.thuc = a.thuc*b.thuc - a.ao*b.ao;
		tich.ao = a.thuc*b.ao + a.ao*b.thuc;
		if (tich.ao >= 0)
	    	System.out.println("Tich: "+ tich.thuc + " + " + tich.ao + "i");
	    else 
	    	System.out.println("Tich: "+ tich.thuc + " - " + Math.abs(tich.ao) + "i");
	}
	public static void main(String[] args) {
		Complex a = new Complex();
		Complex b = new Complex();
		for (int i = 1; i < 2; i++) {
			a = Input();
			if (a.ao >= 0)
				System.out.println("So phuc thu 1 la:  "+ a.thuc + " + " + a.ao + "i" + "\n" );
		    else 
		    	System.out.println("So phuc thu 1 la:  "+ a.thuc + " - " + Math.abs(a.ao) + "i" + "\n" );
			b = Input();
			if (b.ao >= 0)
				System.out.println("So phuc thu 2 la:  "+ b.thuc + " + " + b.ao + "i" + "\n" );
		    else 
		    	System.out.println("So phuc thu 2 la:  "+ b.thuc + " - " + Math.abs(b.ao) + "i" + "\n" );
			Tong(a,b);
			Tich(a,b);
		}
	}
}
