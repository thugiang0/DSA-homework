// Bai 1: Bubble Sort

package hw2_19000258;

public class BubbleSort {
	public static void bubbleSort(int a[]) {
		int compare = 0;
		int swap = 0;
		for (int i = 0; i < a.length; i++) {
			boolean isSorted = true;
			for (int j = 1; j < a.length-i; j++) {
				compare++;
				if (a[j-1] > a[j]) {
					swap++;
					isSorted = false;
					int temp = a[j-1];
					a[j-1] = a[j]; 
					a[j] = temp;
				}	
			} 
			printArray(i, a);
			if (isSorted)
				break;
		}
		System.out.println("So lan so sanh: " + compare);
		System.out.println("So lan doi cho: " + swap);
	}
	public static void printArray(int k, int a[]) {
		System.out.print("Loop " + (k) + ": ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[] = {8, 5, 18, 11, 6, 3};
		bubbleSort(a);
	}
}


