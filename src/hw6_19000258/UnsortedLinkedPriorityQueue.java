package hw6_19000258;

public class UnsortedLinkedPriorityQueue<E> extends LinkedList implements PriorityQueueInterface<E> {

	@Override
	public void insert(E element, int value) {
		Entry<E> newElement = new Entry(element, value);
		this.add(newElement);
	}

	@Override
	public E min() {
		Node currentNode = firstNode;
		Entry<E> element = (Entry<E>) currentNode.getElement();
		int minValue = ((Entry<E>) currentNode.getElement()).getValue();

		if (isEmpty())
			return null;

		else {
			while (currentNode != null) {
				if (((Entry<E>) currentNode.getElement()).getValue() < minValue) {
					element = new Entry(((Entry<E>) currentNode.getElement()).getElement(),
							((Entry<E>) currentNode.getElement()).getValue());
					minValue = ((Entry<E>) currentNode.getElement()).getValue();
				}

				else
					currentNode = currentNode.next;
			}
		}

		return element.getElement();

	}

	public void removeMin() {
		Node previousNode = firstNode;
		Node currentNode = null;
		E min = min();

		if (isEmpty()) {
			System.out.println("Queue is empty");
		}

		else {
			currentNode = firstNode.next;
			if (((Entry<E>) firstNode.getElement()).getElement() == min) {
				firstNode = currentNode;
			}

			else {
				while (((Entry<E>) currentNode.getElement()).getElement() != min) {
					previousNode = previousNode.next;
					currentNode = currentNode.next;
				}
				if (currentNode.next == null) {
					previousNode.next = null;
				} else {
					previousNode.next = currentNode.next;
				}
			}
		}
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
