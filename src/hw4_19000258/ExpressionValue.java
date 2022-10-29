// Ex3: Tính giá trị biểu thức

package hw4_19000258;

public class ExpressionValue extends Blackets {
	
	public static int calculateOperator(char op, int b, int a) {
		switch(op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b != 0)
				return a / b;
		}
		return 0;	
	}
	
	public static boolean isPrecalculated(char op1, char op2) {
		if (op2 == '(' || op2 == ')')
			return false;
		else if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}
	
	public static void calculateExpression(String expression) {
		if (areValidBlackets(expression)) {
			LinkedListStack<Integer> operand = new LinkedListStack<>();
	        LinkedListStack<Character> operator = new LinkedListStack<>();
	        
	        char[] characters = expression.toCharArray();
	 
	        for (int i = 0; i < characters.length; i++) {
	        
	            if (characters[i] == ' ')
	                continue;
	 
	            if (Character.isDigit(characters[i])) {
	                StringBuffer str = new StringBuffer();
	                while (i < characters.length &&Character.isDigit(characters[i])) {
	                    str.append(characters[i++]);
	                }
	                operand.push(Integer.parseInt(str.toString()));
	                i--;
	            }
	            
	            else if (characters[i] == '(')
	            	operator.push(characters[i]);
	 
	            else if (characters[i] == ')') {
	                while (operator.top() != '(') {
	                	operand.push(calculateOperator(operator.pop(), operand.pop(), operand.pop()));
	                }
	                operator.pop();
	            }
	 
	           
	            else if (characters[i] == '+' || characters[i] == '-' ||
	            		characters[i] == '*' || characters[i] == '/') {
	             
	                while (!operator.isEmpty() &&  isPrecalculated(characters[i], operator.top())) {
	                	operand.push(calculateOperator(operator.pop(), operand.pop(), operand.pop()));
	                }
	                
	                operator.push(characters[i]);
	            }
	        }
	 
	        while (!operator.isEmpty()) {
	        	operand.push(calculateOperator(operator.pop(), operand.pop(), operand.pop()));
	        }
	        
			System.out.println(expression + " = " + operand.pop() + "\n");
		}
		
		else
			System.out.println("Invalid blackets" + "\n");
	}

	public static void main(String[] args) {
		String expression1 = "(1 + ((2 + 3) * (8 * 5)))";
		calculateExpression(expression1);
		
		String expression2 = "(5 - ( 8 - 4) * (2 + 3)) + (8/2)";
		calculateExpression(expression2);
		
		String expression3 = "(5 - (( 8 - 4) * (2 + 3)) + (8/2)";
		calculateExpression(expression3);
	}

}
