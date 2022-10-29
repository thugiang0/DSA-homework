package hw6_19000258;

import java.util.Arrays;

public class QuickSort {
	
	int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1); 
        for (int j = low; j < high; j++) {

            if (array[j] < pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }


    public void quickSort(int array[], int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    public static void main(String args[]) {
    	QuickSort object = new QuickSort();
        int array[] = {5, 6, 18, 4, 13, 1, 7, 11, 15, 8};

        final long startTime = System.nanoTime();
        object.quickSort(array, 0, array.length - 1);
        final long endTime = System.nanoTime();

        System.out.println("Quick Sort: " + Arrays.toString(array));
        System.out.println("Total execution time: " + (endTime - startTime));
    }
}



	 