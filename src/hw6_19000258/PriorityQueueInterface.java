package hw6_19000258;

public interface PriorityQueueInterface<E> {
	
	public void insert(E element, int value);
	
	public E min();
	
	public void removeMin();
	
	public int size();
	
	public boolean isEmpty();

}
