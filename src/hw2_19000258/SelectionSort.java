// Bai 2: Selection Sort

package hw2_19000258;

public class SelectionSort {
	public static void selectionSort (int a[]) {
		int compare = 0;
		int swap = 0;
		for (int i = a.length-1; i >= 0; i--) {
			int maxId = i;
			for (int j = 0; j < i; j++) {
				compare++;
				if (a[j] >= a[maxId]) {
					maxId = j;
				}
			} 
			if (maxId != i) {
			int temp = a[maxId];
			a[maxId] = a[i];
			a[i] = temp;
			printArray(i, a);
			swap++;
			}
		}
		System.out.println("So lan so sanh: " + compare);
		System.out.println("So lan doi cho: " + swap);
		}
	public static void printArray(int k, int a[]) {
	System.out.print("Loop " + Math.abs(k-(a.length-1)) + ": ");
	for (int i = 0; i <= a.length-1; i++) { 
		System.out.print(a[i] + " ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		int a[] = {8, 5, 18, 11, 6, 3};
		selectionSort(a);
	}
}
