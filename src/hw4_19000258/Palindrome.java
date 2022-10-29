package hw4_19000258;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		
		String word = str.toLowerCase().replaceAll("[-+.:,'!\\s]","");
		
		LinkedListStack<Character> stack = new LinkedListStack<>();
		LinkedQueue<Character> queue = new LinkedQueue<>();
		
		for (int i = 0; i < word.length(); i++) {
			stack.push(word.charAt(i));
			queue.enqueue(word.charAt(i));
		}
		
		while (!queue.isEmpty()) {
			if (stack.pop() == queue.dequeue()) {
				continue;
			} 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();
		if (isPalindrome(str))
			System.out.print("\"" + str + "\"" + " is a palindrome");
		else
			System.out.print("\"" + str + "\"" + " is NOT a palindrome");
	}
	
}
