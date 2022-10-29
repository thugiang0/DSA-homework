// Ex3 (1/3)

package hw3_19000258;

public interface ListInterface<T> extends Iterable {
    
	public void add(T data); 
    
	public T get(int i);
   
	public void set(int i, T data); 
   
	public void remove(T data);
   
	public boolean isContain(T data); 
    
	public int size();
    
	public boolean isEmpty(); 
}
