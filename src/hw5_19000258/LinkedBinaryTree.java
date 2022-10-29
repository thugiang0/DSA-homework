package hw5_19000258;

public class LinkedBinaryTree<E> implements BinaryTreeInterface<E> {
	
	protected static class Node<E> {
		private E element;
		private Node<E> parent;
		private Node<E> left;
		private Node<E> right;
	
		
		public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
			element = e;
			parent = above;
			left = leftChild;
			right = rightChild;
		
		}
		
		public E getElement() {
			return element;
		}
		
		public Node<E> getParent() {
			return parent;
		}
		
		public Node<E> getLeft() {
			return left;
		}
		
		public Node<E> getRight() {
			return right;
		}
		
		public void setElement(E e) {
			element = e;
		}
		
		public void setParent(Node<E> parentNode) {
			parent = parentNode;
		}
		
		public void setLeft(Node<E> leftChild) {
			left = leftChild;
		}
		
		public void setRight(Node<E> rightChild) {
			right = rightChild;
		}
	
	}
	
	protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right) {
		return new Node<E>(e, parent, left, right);
	}
	
	protected Node<E> root = null;
	
	private int size = 0;
	
	public LinkedBinaryTree() {
		
	}
	
	protected Node<E> validate(Node<E> p) throws IllegalArgumentException {
		if(!(p instanceof Node)) 
			throw new IllegalArgumentException("Invalid Position type");
		Node<E> node = (Node<E>) p;
		if(node.getParent() == node) 
			throw new IllegalArgumentException("p is not in the tree");
		return node;
	}
	

	@Override
	public Node<E> root() {
		return root;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int numChildren(Node<E> p) {
		int count = 0;
		if (left(p) != null)
			count++;
		if (right(p) != null)
			count++;
		return count;
	}

	@Override
	public Node<E> parent(Node<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return node.getParent();
	}
	
	@Override
	public Node<E> left(Node<E> p) {
		Node<E> node = validate(p);
		return node.getLeft();
	}

	@Override
	public Node<E> right(Node<E> p) {
		Node<E> node = validate(p);
		return node.getRight();
	}

	@Override
	public Node<E> sibling(Node<E> p) {
		Node<E> parent = parent(p);
		if (parent == null)
			return null;
		if (p == left(parent))
			return right(parent);
		else
			return left(parent);
		
	}
	
	public Node<E> addRoot(E e) throws IllegalStateException {
		if (!isEmpty())
			throw new IllegalStateException("Tree is not empty");
		root = createNode(e, null, null, null);
		size = 1;
		return root;
	}
	
	public Node<E> addLeft(Node<E> p, E e) throws IllegalStateException {
		Node<E> parent = validate(p);
		if (parent.getLeft() != null)
			throw new IllegalArgumentException("p already has a left child");
		Node<E> child = createNode(e, parent, null, null);
		parent.setLeft(child);
		size++;
		return child;
	}
	
	public Node<E> addRight(Node<E> p, E e) throws IllegalStateException {
		Node<E> parent = validate(p);
		if (parent.getRight() != null)
			throw new IllegalArgumentException("p already has a right child");
		Node<E> child = createNode(e, parent, null, null);
		parent.setRight(child);
		size++;
		return child;
	}
	
	public E set(Node<E> p, E e) throws IllegalStateException {
		Node<E> node = validate(p);
		E temp = node.getElement();
		node.setElement(e);
		return temp;
	}
}

