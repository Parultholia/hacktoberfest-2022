// Java program for tree traversals

class Node {
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

class PostOrderTraversal {
	Node root;

	BinaryTree() { root = null; }

// method to print post order
	void printPostorder(Node node)
	{
		if (node == null)
			return;

		//  left subtree
		printPostorder(node.left);

		// right subtree
		printPostorder(node.right);

		//  deal with the node
		System.out.print(node.key + " ");
	}

	void printPostorder() { printPostorder(root); }

	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		// Function call
		System.out.println(
			"\nPostorder traversal of binary tree is ");
		tree.printPostorder();
	}
}
