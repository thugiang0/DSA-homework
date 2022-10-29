package hw6_19000258;

import java.util.Arrays;

public class MergeSort {

	public static void merge(int[] leftArray, int[] rightArray, int[] array) {

		int i = 0;
		int l = 0;
		int r = 0;

		while (l < leftArray.length && r < rightArray.length) {

			if (leftArray[l] < rightArray[r]) {
				array[i++] = leftArray[l++];
			} else {
				array[i++] = rightArray[r++];
			}
		}
		while (l < leftArray.length) {
			array[i++] = leftArray[l++];
		}
		while (r < rightArray.length) {
			array[i++] = rightArray[r++];
		}
	}

	public static void mergeSort(int[] array, int len) {
		if (len < 2) {
			return;
		}

		int mid = len / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[len - mid];

		int k = 0;
		for (int i = 0; i < len; i++) {
			if (i < mid) {
				leftArray[i] = array[i];
			} else {
				rightArray[k] = array[i];
				k++;
			}
		}

		mergeSort(leftArray, mid);
		mergeSort(rightArray, len - mid);
		merge(leftArray, rightArray, array);
	}

	public static void main(String args[]) {
		int[] array = { 5, 6, 18, 4, 13, 1, 7, 11, 15, 8 };

		final long startTime = System.nanoTime();
		mergeSort(array, array.length);
		final long endTime = System.nanoTime();

		System.out.println("Merge Sort: " + Arrays.toString(array));
		System.out.println("Total execution time: " + (endTime - startTime));

	}
}