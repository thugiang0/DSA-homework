package hw5_19000258;

public class PrintBinaryTree extends ConstructBinaryTree  {
	
	public static void main(String[] args) {
		InOrderToPostOrder infix = new InOrderToPostOrder();
		String strMath = "(11 - 8) * ((18 + 3) / 6)";
		System.out.println("Biểu thức trung tố: " + strMath);
		String[] elementMath = infix.processString(strMath);
		elementMath = infix.postOrder(elementMath);
		
		System.out.print("\nBiểu thức hậu tố: ");
		for (int i = 0; i < elementMath.length; i++) {
			System.out.print(elementMath[i] + " ");
		}
	    
		System.out.println("\n\nCây nhị phân biểu thức (theo chiều ngang nha): ");
	    ConstructBinaryTree.printTree(createTree(), 0);
	}
}
