// Ex1.1 (2/2)

package hw4_19000258;

public class ArrayListStackTest {
	
	public static void main(String[] args) {
		ArrayListStack<String> list = new ArrayListStack<>();
		
		// Add element to the top of the stack 
		list.push("8");
		list.push("9");
		list.push("10");
		list.push("11");
		list.push("12");
		list.push("13");
		list.push("14");
		
		System.out.print("Elements in the stack: ");
		for (int i = list.size(); i > 0; i--){
            System.out.print(list.get(i) +" ");
        }
		
		System.out.println("\n\nNumber of elements in the stack: " + list.size());
		
		// Remove the top element from stack
		System.out.println("\nRemove the top element from stack:" + list.pop());
		System.out.print("Elements in the stack: ");
		for (int i = list.size(); i > 0; i--){
            System.out.print(list.get(i) +" ");
        }
		
		// The element at the top of stack
		System.out.println("\n\nThe element at the top of stack: " + list.top());
	}
}