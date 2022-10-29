package hw7_19000258;

public class UnsortedArrayLinearSearch {
	
	public static int unsortedArrayLinearSearch(int[] array, int data) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == data) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {7, 4, 8, 2, 3};
		System.out.println(unsortedArrayLinearSearch(array, 3));

	}

}
