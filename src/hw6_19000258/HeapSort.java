package hw6_19000258;

import java.util.Arrays;

public class HeapSort {
		
    private static int size;

    public static void buildHeap(int array[]) {
    	size = array.length - 1;
        for (int i = size/ 2; i >= 0; i--)
            heap(array, i);
    }

    public static void heap(int array[], int i) {
        int leftId = 2 * i; 
        int rightId = 2 * i + 1; 
        int max = i;

        if (leftId <= size && array[leftId] > array[i])
            max = leftId;
        
        if (rightId <= size && array[rightId] > array[max])
            max = rightId;

        if (max != i) {
            swap(array, i, max);
            heap(array, max);
        }
    }

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void heapSort(int array[]) {
        buildHeap(array);

        for (int i = size; i > 0; i--) {
            swap(array, 0, i);
            size--;
            heap(array, 0);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 18, 4, 13, 1, 7, 11, 15, 8};

        final long startTime = System.nanoTime();
        heapSort(array);
        final long endTime = System.nanoTime();
        
        System.out.println("Heap Sort: " + Arrays.toString(array));
        System.out.println("Total execution time: " + (endTime - startTime));
        
    }
    
    
}




