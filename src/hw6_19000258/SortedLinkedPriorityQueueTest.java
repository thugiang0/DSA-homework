package hw6_19000258;

public class SortedLinkedPriorityQueueTest {

	public static void main(String[] args) {

		System.out.println("SORTED LINKED PRIORITY QUEUE\n");

		PriorityQueueInterface<Item> queue = new SortedArrayPriorityQueue<>(12);

		Item item1 = new Item("item1");
		Item item2 = new Item("item2");
		Item item3 = new Item("item3");
		Item item4 = new Item("item4");
		Item item5 = new Item("item5");
		Item item6 = new Item("item6");
		Item item7 = new Item("item7");
		Item item8 = new Item("item8");
		Item item9 = new Item("item9");
		Item item10 = new Item("item10");

		queue.insert(item1, 16);
		queue.insert(item2, 21);
		queue.insert(item3, 13);
		queue.insert(item4, 18);
		queue.insert(item5, 15);
		queue.insert(item6, 29);
		queue.insert(item7, 22);
		queue.insert(item8, 28);

		System.out.println("Queue is empty: " + queue.isEmpty());
		System.out.println("List of elements: " + queue);
		System.out.println("Minimum element: " + queue.min());

		queue.removeMin();
		System.out.println("\nAfter removing the minimum element");
		System.out.println("List of elements: " + queue);
		System.out.println("Minimum element: " + queue.min());
		queue.removeMin();
		System.out.println("Next minimum element: " + queue.min());

		queue.insert(item9, 11);
		queue.insert(item10, 25);
		System.out.println("\nAfter inserting 2 elements");
		System.out.println("List of elements: " + queue);
		System.out.println("Minimum element: " + queue.min());
	}

}
