package hw6_19000258;

public class SortedLinkedPriorityQueue<E> extends LinkedList implements PriorityQueueInterface<E> {

	public void insert(E element, int value) {
		Node currentNode = firstNode;
		Entry newItem = new Entry(element, value);
		Node newNode = new Node(newItem);

		if (!isEmpty()) {

			if (value <= ((Entry<E>) currentNode.getElement()).getValue()) {
				firstNode = newNode;
				newNode.next = currentNode;
				size++;
			}

			while (value > ((Entry<E>) currentNode.getElement()).getValue()) {
				if (currentNode.next == null) {
					currentNode.next = newNode;
					size++;
				} else if (value <= ((Entry<E>) currentNode.next.getElement()).getValue()) {
					newNode.next = currentNode.next;
					currentNode.next = newNode;
					size++;
				}
				currentNode = currentNode.next;
			}
		}

		else {
			firstNode = newNode;
			size++;
		}

	}

	@Override
	public E min() {
		if (isEmpty())
			return null;
		return ((Entry<E>) firstNode.getElement()).getElement();
	}

	@Override
	public void removeMin() {
		if (isEmpty())
			System.out.println("Queue is empty");
		firstNode = firstNode.next;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return firstNode == null;
	}

}
