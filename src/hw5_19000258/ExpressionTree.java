package hw5_19000258;

public class ExpressionTree {
	
	public TreeNode root;
	
	public class TreeNode {
		public String data;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode(String data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	// Binary tree traversal 
	public static void preOrderPrint(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrderPrint(root.left);
		preOrderPrint(root.right);
	}
	
	public static void postOrderPrint(TreeNode root) {
		if (root == null)
			return;
		postOrderPrint(root.left);
		postOrderPrint(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void inOrderPrint(TreeNode root) {
		if (root == null)
			return;
		inOrderPrint(root.left);
		System.out.print(root.data + " ");
		inOrderPrint(root.right);
	}
	
	public static boolean isLeaf(TreeNode node) {
		if (node.left == null && node.right == null)
			return true;
		return false;
    }
	
	// Evaluate the expression
	public static double calculateOperator(String operator, double a, double b) {
		switch(operator) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			if (b != 0)
				return a / b;
		}
		return 0;	
	}
    
    public static double evaluateExpression(TreeNode root) {
        if (root == null) 
            return 0;
 
        if (isLeaf(root)) 
            return Double.valueOf(root.data);
 
        double x = evaluateExpression(root.left);
        double y = evaluateExpression(root.right);
 
        return calculateOperator(root.data, x, y);
    }

}
