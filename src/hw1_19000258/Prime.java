// Bai 2: So nguyen to

package hw1_19000258;
import java.util.Scanner;
public class Prime {
	public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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
		System.out.print("Cac phan tu la so nguyen to: ");
		for (int j = 0; j < a.length; j++) {
			if(isPrimeNumber(a[j])) {
				System.out.print(a[j] + " ");
			}
		}
	}
}  
