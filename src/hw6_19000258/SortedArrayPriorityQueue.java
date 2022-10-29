package hw6_19000258;

public class SortedArrayPriorityQueue<E> implements PriorityQueueInterface<E> {

	private Object[] array;
	private int size;

	public SortedArrayPriorityQueue(int n) {
		array = new Object[n];
		size = -1;
	}

	@Override
	public void insert(E element, int value) {
		size++;

		if (size > array.length) {
			size--;
			System.out.print("Queue is ull");
		}

		else {
			int i = size;
			while (i > 0 && ((Entry<E>) array[i - 1]).getValue() > value) {
				array[i] = array[i - 1];
				i--;
			}
			array[i] = new Entry<>(element, value);

		}
	}

	@Override
	public E min() {
		if (isEmpty())
			return null;

		else
			return ((Entry<E>) array[0]).getElement();
	}

	@Override
	public void removeMin() {
		if (isEmpty())
			System.out.println("Queue is empty");

		else {
			for (int i = 0; i < size; i++) {
				array[i] = array[i + 1];
			}
			size--;
		}

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size < 0;
	}

	public String toString() {
		String result = "[";
		for (int i = 0; i <= size; i++) {
			if (i > 0) {
				result = result + ", ";
			}
			result = result + array[i];
		}
		result = result + "]";
		return result;
	}

}
