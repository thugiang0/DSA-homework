package hw6_19000258;

public class MinHeapPriorityQueue<E> implements PriorityQueueInterface<E> {
	
	private Object[] array;
	private int lastId;
	
	public MinHeapPriorityQueue(int n) {
		array = new Object[n];
		lastId = -1;
	}
	
	public void swap(int i, int j) {
		Object temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void upHeap() {
		int elementId = lastId;
		while (elementId > 0) {
			int parentId = (elementId - 1) / 2;
			Object element = array[elementId];
			Object parent = array[parentId];
			
			if (((Entry<E>) element).getValue() < ((Entry<E>) parent).getValue()) {
				swap(elementId, parentId);
				elementId = parentId;
			}
			else {
				break;
			}
		}
	}
	
	public void downHeap() {
		int elementId = 0;
		int leftId = 2 * elementId + 1;
		
		while (leftId <= lastId) {
			int min = leftId;
			int rightId = 2 * elementId + 2;
			
			if (rightId <= lastId) {
				if (((Entry<E>) array[rightId]).getValue() < ((Entry<E>) array[leftId]).getValue()) 
                    min++;
			}
			if (((Entry<E>) array[elementId]).getValue() > ((Entry<E>) array[min]).getValue()) {

                swap(elementId, min);
                elementId = min;
                leftId = 2 * elementId + 1; 
			}
			else
				break;
		}
	}

	@Override
	public void insert(E element, int value) {
		lastId++;
		if (lastId >= array.length) {
			lastId--;
			System.out.println("Queue is empty");
		}
		else {
			array[lastId] = new Entry<>(element, value);
			this.upHeap();
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
			array[0] = array[lastId];
			lastId--;
			downHeap();
		}	
	}

	@Override
	public int size() {
		return lastId;
	}

	@Override
	public boolean isEmpty() {
		return lastId < 0;
	}
	
	public String toString() {
        String result = "[";
        for (int i = 0; i <= lastId; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + array[i];
        }
        result = result + "]";
        return result;
    }

}
