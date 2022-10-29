// Ex2.2 (1/2)

package hw4_19000258;

import java.util.Iterator;

public class LinkedQueue<E> implements QueueInterface<E> {
	
	Node front;
	Node back;
	
	public LinkedQueue() {
		this.front = null;
		this.back = null;
	}
	
	class Node {
		E element;
		Node next;
		public E getElement() {
			return element;
		}
		public void setElement(E element) {
			this.element = element;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
	}

	@Override
	public void enqueue(E element) {
		Node newNode = new Node();
		newNode.element = element;
		newNode.next = null;
		if (isEmpty()) {
			front = newNode;
			back = newNode;
		}
		back.next = newNode;
		back = newNode;
	}

	@Override
	public E dequeue() {
		if (isEmpty())
			return null;
		E temp = front.getElement();
		front = front.getNext();
		return temp;
		
	}

	@Override
	public boolean isEmpty() {
		if (front == null)
			return true;
		return false;
	}
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void print() {
		if (isEmpty())
			System.out.print("Queue is empty");
		else {
			Node node = front;
			System.out.print("Elements in the queue: ");
			while (node != null) {
				System.out.print(node.getElement() + " ");
				node = node.getNext();
				
			}
			
		}
	
	}

}
