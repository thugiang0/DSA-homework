package hw5_19000258;

import java.util.Stack;

public class InOrderToPostOrder {
	
	public boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')')
			return true;
		return false;
	}
	
	public int priority(char c) {
		if (c == '*' || c == '/')
			return 2;
		else if (c == '+' || c == '-')
			return 1;
		else
			return 0;
	}
	
	public String[] processString(String strMath) {
		String str = "";
		String[] elementMath = null;
		InOrderToPostOrder infix = new InOrderToPostOrder();
		strMath = strMath.trim();
		strMath = strMath.replaceAll("\\s"," ");
		
		for (int i = 0; i < strMath.length(); i++) {
			char c = strMath.charAt(i);
			if (!infix.isOperator(c))
				str = str + c;
				
			else
				str = str + " " + c + " ";
		}
		str = str.trim();
		str = str.replaceAll("\\s+"," ");
		elementMath = str.split(" ");
		return elementMath;
	}
	
	public String[] postOrder(String[] elementMath) {
		InOrderToPostOrder infix = new InOrderToPostOrder();
		String str = "";
		String[] E;
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < elementMath.length; i++) {  // lặp qua các phần tử
			char c = elementMath[i].charAt(0);      // c là kí tự đầu của mỗi phần tử
			
			if (!infix.isOperator(c))    // nếu c là toán hạng thì đưa element vào str
				str = str + " " + elementMath[i];
			
			else {                       // nếu c là toán tử
				if (c == '(')              // c là "(" thì push vào stack
					stack.push(elementMath[i]);
				else {
					if (c == ')') {       // c là ")", duyệt lại các phần tử trong stack
						char c1 = ' ';
						while (c1 != '(') {
							c1 = stack.peek().charAt(0);
							if (c1 != '(')
								str = str + " " + stack.peek();
							stack.pop();
						}
					}
					else { 
						// stack không rỗng và ptu trong stack có sự ưu tiên >= ptu hiện tại
						while (!stack.isEmpty() && infix.priority(stack.peek().charAt(0)) >= infix.priority(c)) {
							str = str + " " + stack.peek();   // lấy ptu trong stack cho vào str
							stack.pop();                      // remove
						}
						stack.push(elementMath[i]);        // push phần tử hiện tại vào stack
					}
				}
			}
		}
		while (!stack.isEmpty()) {      // stack còn phần tử thì peek vào str
			str = str + " " + stack.peek();
			stack.pop();
		}
		E = str.split(" ");
		return E;
	}
	
	public static void main(String[] args) {
		InOrderToPostOrder infix = new InOrderToPostOrder();
		String strMath = "(11 - 8) * ((18 + 3) / 6)";
		String[] elementMath = infix.processString(strMath);
		elementMath = infix.postOrder(elementMath);
		
		for (int i = 0; i < elementMath.length; i++) {
			System.out.print(elementMath[i] + " ");
		}
	}
}