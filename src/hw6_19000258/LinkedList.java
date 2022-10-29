package hw6_19000258;

public class LinkedList<E> {

	class Node<E> {
		private final E element;
		public Node next;

		public Node(E element) {
			this.element = element;
		}

		public E getElement() {
			return element;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String toString() {
			return element.toString();
		}

	}

	public Node firstNode;
	public int size;

	public LinkedList() {
		firstNode = null;
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return (firstNode == null);
	}

	public void add(E element) {
		Node newNode = new Node(element);
		newNode.next = firstNode;
		firstNode = newNode;
		size++;
	}

	public void remove() {
		if (isEmpty()) {
			System.out.println("empty");
		}

		else {
			firstNode = firstNode.next;
			size--;
		}
	}

	public String toString() {
		Node node = firstNode;
		String str = "";
		while (node != null) {
			str += (node.toString());
			if (node.next != null) {
				str += ", ";
			}
			node = node.next;
		}
		return str;
	}

}
