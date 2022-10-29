// Bai 2: So chinh phuong
package hw1_19000258;
import java.util.Scanner;
public class Square {
	public static boolean isSquareNumber(int i) {
		double sq = Math.sqrt(i);
		return ((sq - Math.floor(sq)) == 0);
	}
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.print("Nhap cac phan tu: ");
		for (int j = 0; j < n; j++) {
			a[j] = scan.nextInt();
		}
		System.out.print("Cac phan tu la so chinh phuong: ");
		for (int j = 0; j < a.length; j++) {
			if(isSquareNumber(a[j])) {
				System.out.print(a[j] + " ");
			}
		}
	}
}  
