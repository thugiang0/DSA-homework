// Bai 4

package hw2_19000258;

public class SimpleSort {
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
			if (isSorted)
				break;
		}
		System.out.println("- So lan so sanh: " + compare);
		System.out.println("- So lan doi cho: " + swap);
	}
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
			swap++;
			}
		}
		System.out.println("- So lan so sanh: " + compare);
		System.out.println("- So lan doi cho: " + swap);
	}
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
		}
		System.out.println("- So lan so sanh: " + compare);
		System.out.println("- So lan doi cho: " + swap);
	}
	public static void main(String[] args) {
		int a[] = {0, 3, 4, 11, 18, 25, 32};
		System.out.println("Bubble Sort");
		bubbleSort(a);
		System.out.println("Selection Sort");
		selectionSort(a);
		System.out.println("Insertion Sort");
		insertionSort(a);
	}
}
