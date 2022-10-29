package hw5_19000258;

import hw5_19000258.LinkedBinaryTree.Node;

public interface BinaryTreeInterface<E> {
	
	Node<E> root();
	int size();
	boolean isEmpty();
	int numChildren(Node<E> p);
	
	Node<E> parent (Node<E> p);
	Node<E> right (Node<E> p);
	Node<E> sibling (Node<E> p) throws IllegalArgumentException;
	Node<E> left (Node<E> p);
	
}
