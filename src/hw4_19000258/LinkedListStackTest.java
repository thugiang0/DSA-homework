// Ex1.2 (2/2)

package hw4_19000258;

public class LinkedListStackTest {

	public static void main(String[] args) {
		LinkedListStack<String> list = new LinkedListStack<>();
		
		// Add element to the top of the stack
		list.push("5");
		list.push("0");
		list.push("22");
		list.push("11");
		list.push("18");
		list.print();
		System.out.println();
		
		// Remove the top element from stack
		System.out.println("\nRemove the top element from stack: " + list.pop());
		list.print();
		System.out.println();
		
		// The element at the top of stack
		System.out.println("\nThe element at the top of stack: " + list.top());
		list.print();
	}
}
