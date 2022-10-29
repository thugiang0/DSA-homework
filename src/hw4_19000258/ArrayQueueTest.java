// Ex2.1 (2/2)

package hw4_19000258;

public class ArrayQueueTest {

	public static void main(String[] args) {
		ArrayQueue<String> list = new ArrayQueue<>();
		
		// Add element to the back of queue
		list.enqueue("5");
		list.enqueue("6");
		list.enqueue("7");
		list.enqueue("8");
		list.enqueue("9");
		list.enqueue("10");
		list.enqueue("11");
		
		System.out.print("Elements in the queue: ");
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		// Remove the first element from the queue
		System.out.println("Remove the first element: " + list.dequeue()); // remove 5
		System.out.println("Remove the first element: " + list.dequeue()); // remove 6
		System.out.print("Elements in the queue: ");
		for (String s : list) {
			System.out.print(s + " ");
		}

	}

}

