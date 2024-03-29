package hw4_19000258;

public interface QueueInterface<E> extends Iterable<E> {
	
	public void enqueue(E element);
	
	public E dequeue();
	
	public boolean isEmpty();

}
