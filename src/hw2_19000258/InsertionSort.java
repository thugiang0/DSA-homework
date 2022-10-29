// Bai 3: Insertion Sort

package hw2_19000258;

public class InsertionSort {
	public static void insertionSort(int a[]) {
		int compare = 0;
		int swap = 0;
		for (int i = 1; i < a.length; i++) {
			compare++;
			int next = a[i];
			int j;
			for (j = i-1; j >= 0  && a[j] > next ; j--) {
				a[j+1] = a[j];
				if (j!=0 ) {
				compare++; 
				}
				swap++; 		
			}
			a[j+1] = next; 
			printArray(i, a);
		}
		System.out.println("So lan so sanh: " + compare);
		System.out.println("So lan doi cho: " + swap);
	}
	public static void printArray(int k, int a[]) {
		System.out.print("Loop " + k + ": ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[] = {8, 5, 18, 11, 6, 3 };
		insertionSort(a);
	}
}
