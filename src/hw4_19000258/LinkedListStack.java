// Ex1.2 (1/2)

package hw4_19000258;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {
	
	Node head;
	Node tail;
	
	public LinkedListStack() {
		head = new Node();
		tail = new Node();
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
	
	private Node stack = null;

	@Override
	public void push(E element) {
		Node temp = new Node();
		temp.setElement(element);
		if (tail == null) {
			tail = temp;
			head = temp;
		}
		else {
			temp.setNext(head);
			head = temp;
		}
	}

	@Override
	
	public E pop() {
		Node top = new Node();
		top = head;
		head = head.getNext();
		return top.getElement();
	}
	
	@Override
	public boolean isEmpty() {
		if (head.getElement() == null)
			return true;
		else
			return false;
	}

	@Override
	public E top() {
		if (isEmpty())
			return null;
		return head.getElement();
	}

	@Override
	public Iterator<E> iterator() {
		return new StackIterator();
	}
	
	class StackIterator implements Iterator<E> {
		
		private Node currentNode = stack;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return currentNode != null;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			E data = currentNode.element;
			currentNode = currentNode.next;
			return data;
		}
	}

	public void print() {
		Node node = head;
		if (isEmpty()) {
			System.out.print("Stack is empty");
		}
		else {
			System.out.print("Elements in the stack: ");
			while (node.getElement() != null) {
				System.out.print(node.getElement() + " ");
				node = node.getNext();
			}
		}
	}
}