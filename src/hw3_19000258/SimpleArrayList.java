// Ex3 (2/3)

package hw3_19000258;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
   
	private T[] array;
    private int size = 0;
    private static final int defaultSize = 100;

    
    public SimpleArrayList(int capacity) {
		array = (T[]) new Comparable[capacity];
	}
	
	public SimpleArrayList() {
		this(defaultSize);
	}

    @Override
    public void add(T data) {
        int i = 0;
        while (!(array[i] == null)){
            i++;
        }
        array[i] = data;
        size++;
    }

    @Override
    public T get(int i) {
        return array[i];
    }

	@Override
    public void set(int i, T data) {
		
		T temp = array[i];
		array[i] = data;
		data = temp;
		
	}

    public int getIndex(T value){
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value))
                return i;
        }
        return -1;
    }

	@Override
    public void remove(T data) {
        if (this.isEmpty()) 
        	System.out.println("List is empty");
        else {
            int j = getIndex(data);
            if (j != -1) {
               
               for (int i = getIndex(data); i < size; i++) {
               	array[i] = array[i + 1];
               }
               size--;
            }
            
        }
	}
    

	@Override
	public boolean isContain(T data) {
		for (int i = 0; i < size; i++) {
			if (array[i].equals(data))
				return true;
		}
		return false;
	}

    @Override
    public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	 public Iterator iterator() {
        return Arrays.stream(this.array).iterator();
    }
}