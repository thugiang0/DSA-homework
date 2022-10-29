// Ex1.1 (1/2)

package hw4_19000258;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayListStack<E> implements StackInterface<E> {
	public static final int capacity = 1000;
	private E[] data;
	private int t = 0;
	
	public E get(int i) {
        return data[i];
    }


	public ArrayListStack() {
		data = (E[]) new Object[capacity];
	}


	public ArrayListStack(int capacity2) {
		data = (E[]) new Object[capacity];
	}
	
	public int size() {
		return t;
	}

	@Override
	public void push(E element) throws IllegalStateException {
		if (t+1 == data.length) throw new IllegalStateException("Stack is full");
		data[++t] = element;
	}

	@Override
	public E pop() {
		if (isEmpty()) 
			return null;
		E answer = data[t];
		data[t] = null;
		t--;
		return answer;
					
	}

	@Override
	public boolean isEmpty() {
		return t == 0;
	}

	@Override
	public E top() {
		if (isEmpty()) 
			return null;
		return data[t];
	}
	
	@Override
	public Iterator<E> iterator() {
		return Arrays.stream(this.data).iterator();
	} 

}


