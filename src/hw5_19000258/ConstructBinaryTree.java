package hw5_19000258;

public class ConstructBinaryTree {
	
	public static final int distance = 5;
	
	public static class Node {
		String data;
		Node left;
		Node right;
		
		Node (String data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void printTree(Node root, int space) {
		if (root == null)
			return;
		
		space += distance;  
		
		printTree(root.right, space);
		
		System.out.print("\n");
		for (int i = distance; i < space; i++) {
			System.out.print(" ");
		}
		
		System.out.print(root.data + "\n");
		
		printTree(root.left, space);
	}
	
	public static Node createTree() {
		Node root = new Node("*");
	    Node c1 = new Node("-");
	    Node c2 = new Node("11");
	    Node c3 = new Node("8");
	    Node c4 = new Node("/");
	    Node c5 = new Node("+");
	    Node c6 = new Node("18");
	    Node c7 = new Node("3");
	    Node c8 = new Node("6");
	    
	    root.left = c1;
	    root.right = c4;
	   
	    c1.left = c2;
	    c1.right = c3;
	   
	    c4.right = c8;
	    c4.left = c5;
	   
	    c5.left = c6;
	    c5.right = c7;
	    
	    return root;
	}


}
