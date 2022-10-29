// Ex4 (1/2)

package hw3_19000258;

public class SimpleLinkedList<T> {
	
	private Node top ;
	private Node bot ;
	private int n ;
	
	public SimpleLinkedList() {
		top = new Node(null);
		bot = new Node(null);
		n = 0;
	}
	
	class Node {
		T data;
		Node next;
		
		public Node(T dataValue) {
			data = dataValue;
			next = null;
		}
		
		public Node(T dataValue, Node nextValue) {
			data =dataValue;
			next = nextValue;
		}
		
		public T getData() {
			return data;
		}
		
		public void setData(T dataValue) {
			data = dataValue;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node nextValue) {
			next = nextValue;
		}
		
	}
	
	// Them phan tu vao dau danh sach
	public void add(T data) {
		Node newest = new Node(data);
		Node current = top;
		while (newest.getNext() != null) {
			current = current.getNext();	
		}
		newest.setNext(current.getNext());
		current.setNext(newest);
		n++;
	}
	
	// Them phan tu vao cuoi danh sach
	public void addBot(T data) {
		Node newest = new Node(data);
		Node current = top;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(newest);
		n++;
	}
	
	// Lay phan tu o vi tri i
	public T get(int i) {
		if (i <= 0)
			return null;
		Node current = top.getNext();
		for (int j = 0; j < i; j++) {
			if (current.getNext() == null)
				return null;
			current = current.getNext();		
		}
	return current.getData();
	}
	
	// Gan gia tri o vi tri i bang data
	public void set(int i, T data) {
		Node current = top.getNext();
		for (int j = 0; j < i; j++) {
			current = current.getNext();
		}
		current.setData(data);
	}
	
	// Kiem tra trong danh sach co phan tu data hay khong
	public boolean isContain(T data) {
		for (Node current = top; current != null; current = current.getNext()) {
			if (current.getData().equals(data)) {
				return true;
			}
		}
		return false;
	}
	
	// So phan tu trong danh sach
	public int size() {
		return n;
	}
	
	public boolean isEmpty() {
		if (  n == 0)
			return true;
		return false;
	}
	
	// Xoa phan tu dau danh sach
	public T removeTop() {
		if (isEmpty())
			return null;
		top = top.getNext();
		return top.getData();
	}
	
	// Xoa phan tu cuoi danh sach
	public T removeBot() {
		if (isEmpty())
			return null;

		else {
			Node temp = top;
			for (int i = 0; i < n - 2; i++) {
				temp = temp.getNext();
			}
			bot = temp;
			temp.next = null;
			n--;	
		}
		return bot.getData();
	}
	
	// Xoa phan tu co gia tri bang data
	public void remove(T data) {
	        Node temp = top;
	        Node previous = null;
	 
	        if (temp != null && temp.data == data) {
	            top = temp.next; 
	            return;
	        }
	 
	        while (temp != null && temp.data != data) {
	            previous = temp;
	            temp = temp.next;
	        }
	 
	        if (temp == null)
	            return;
	        previous.next = temp.next;
	    }
			

	public String toString() {
		Node current = top.getNext();
		String output = "[ ";
		while (current != null) {
			output += current.getData().toString() + " ";
			current = current.getNext();
		}
		output += "]";
		return output;
	}
}
