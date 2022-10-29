package hw7_19000258;

public class SortedArrayLinearSearch {
	
	public static int sortedArrayLinearSearch(int[] array, int data) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == data)
				return i;
			else if (array[i] > data)
				return -1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {3, 5, 7, 8, 9};
		System.out.println(sortedArrayLinearSearch(array, 3));
	}

}
