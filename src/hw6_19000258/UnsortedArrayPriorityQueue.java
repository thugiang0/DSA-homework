package hw6_19000258;

public class UnsortedArrayPriorityQueue<E> implements PriorityQueueInterface<E> {

	private Object[] array;
	private int size;

	public UnsortedArrayPriorityQueue(int n) {
		array = new Object[n];
		size = -1;
	}

	@Override
	public void insert(E element, int priority) {
		size++;

		if (size >= array.length) {
			size--;
			System.out.println("Queue is full");
		}

		else {
			array[size] = new Entry<>(element, priority);
		}
	}

	@Override
	public E min() {
		int min = ((Entry<E>) array[0]).getValue();
		int index = 0;

		if (isEmpty()) {
			return null;
		}

		else {
			for (int i = 0; i < size + 1; i++) {
				if (((Entry<E>) array[i]).getValue() < min) {
					min = ((Entry<E>) array[i]).getValue();
					index = i;
				}
			}
			return ((Entry<E>) array[index]).getElement();
		}

	}

	@Override
	public void removeMin() {
		if (isEmpty())
			System.out.print("Queue is empty");

		else {
			int min = ((Entry<E>) array[0]).getValue();
			int index = 0;

			for (int i = 0; i < size + 1; i++) {
				if (((Entry<E>) array[i]).getValue() < min) {
					min = ((Entry<E>) array[i]).getValue();
					index = i;
				}
			}

			for (int i = index; i < size + 1; i++) {
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
		for (int i = 0; i < size + 1; i++) {
			if (i > 0) {
				result = result + "; ";
			}
			result = result + array[i];
		}
		result = result + "]";
		return result;
	}

}
