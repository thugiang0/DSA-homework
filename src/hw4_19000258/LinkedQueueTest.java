// Ex2.2 (2/2)

package hw4_19000258;

public class LinkedQueueTest {

	public static void main(String[] args) {
		LinkedQueue<String> list = new LinkedQueue<>();
		
		// Add element to the back of queue
		list.enqueue("11");
		list.enqueue("12");
		list.enqueue("13");
		list.enqueue("15");
		list.enqueue("17");
		list.enqueue("19");
		list.print();
		System.out.println("\n");
		
		// Remove the first element from the queue
		System.out.println("Remove the first element: " + list.dequeue()); // remove 11
		list.print();
		System.out.println("\n");
		System.out.println("Remove the first element: " + list.dequeue()); // remove 12
		list.print();
		
	}

}
