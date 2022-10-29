// Ex3: Xét tính hợp lệ về dấu ngoặc

package hw4_19000258;

import java.util.Scanner;

public class Blackets {
	
	public static boolean areValidBlackets(String str) {
		
		LinkedListStack<Character> stack = new LinkedListStack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (c == '{' || c == '[' || c == '(') 
				stack.push(c);
			
			if (c == '}' || c == ']' || c == ')') {
				if (stack.isEmpty())
					return false;
				char d = stack.top();
				if (c == '}' && d == '{' || c == ']' && d == '['|| c == ')' && d == '(')
					stack.pop();
				else
					return false;
			}
		}
		return stack.isEmpty();
		
	}

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an expression: ");
		String expression = scan.nextLine();
	
		if (areValidBlackets(expression)) 
			System.out.print("Valid blackets");
		else
			System.out.print("Invalid blackets");
	}
}


 