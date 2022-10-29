package hw7_19000258;

public class BianrySearchTree {
	
	public BinaryTree findMin(BinaryTree root) {
		if (root == null) {
			return null;
		}
		else {
			if (root.getLeft() == null) {
				return root;
			}
			else {
				return findMin(root.getLeft());
			}
		}
	}
	
	public BinaryTree findMax(BinaryTree root) {
		if (root == null)
			return null;
		while (root.getRight() == null) {
			root = root.getRight();
		}
		return root;		
	}
	
	public BinaryTree insert(BinaryTree root, int data) {
		if (root == null) {
			root = new BinaryTree();
			if (root == null) {
				return null;
			}
			else {
				root.setData(data);
				root.setLeft(null);
				root.setRight(null);
			}
		}
		else {
			if (data < root.getData()) {
				root.setLeft(insert(root.getLeft(), data));
			}
			else if (data > root.getData()) {
				root.setRight(insert(root.getRight(), data));
			}
		}
		return root;
	}
	
	public BinaryTree search(BinaryTree root, int data) {
		if (root == null) {
			return null;
		}
		while (root != null) {
			if (data == root.getData())
				return root;
			else if (data > root.getData())
				root = root.getRight();
			else
				root = root.getLeft();
		}
		return null;
	}
	
	public BinaryTree delete(BinaryTree root, int data) {
		BinaryTree temp;
		if (root == null) 
			return null;
		
		else if (data < root.data)
			root.left = delete(root.getLeft(), data);
		
		else if (data > root.data)
			root.right = delete(root.getRight(), data);
		
		else {
			if (root.getLeft() != null && root.getRight() != null) {
				temp = findMax(root.getLeft());
				root.setData(temp.data);
				root.left = delete(root.getLeft(), root.getData());
			}
			else {
				temp = root;
				if (root.getLeft() == null)
					root = root.getRight();
				if (root.getRight() == null)
					root = root.getLeft();
			}
		}
		return root;
	}

}
