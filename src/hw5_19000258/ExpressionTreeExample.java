package hw5_19000258;

public class ExpressionTreeExample extends ExpressionTree {

	public void createBinaryTree() {
		
		TreeNode c1 = new TreeNode("11");
		TreeNode c2 = new TreeNode("-");
		TreeNode c3 = new TreeNode("8");
		TreeNode c4 = new TreeNode("*");
		TreeNode c5 = new TreeNode("18");
		TreeNode c6 = new TreeNode("+");
		TreeNode c7 = new TreeNode("3");
		TreeNode c8 = new TreeNode("/");
		TreeNode c9 = new TreeNode("6");
		
		// (11 - 8) * ((18 + 3) / 6) = 10.5
		
		// create binary tree
		root = c4;
		c4.left = c2;
		c4.right = c8;
		
		c2.left = c1;
		c2.right = c3;
		
		c8.left = c6;
		c8.right = c9;
		
		c6.left = c5;
		c6.right = c7;	
	}
	
	public static void main(String[] args) {
		ExpressionTreeExample tree = new ExpressionTreeExample();
		tree.createBinaryTree();
		
		System.out.println("Các dạng biểu diễn của biểu thức");
		System.out.print(" Pre-order: ");
		preOrderPrint(tree.root);
		System.out.println();
		
		System.out.print(" Post-order: ");
		postOrderPrint(tree.root);
		System.out.println();
		
		System.out.print(" In-order: ");
		inOrderPrint(tree.root);
		System.out.println();
		
		System.out.println("\nGiá trị của biểu thức: " + evaluateExpression(tree.root));
	}

}
