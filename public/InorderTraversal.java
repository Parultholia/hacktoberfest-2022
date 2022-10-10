class Node {
  int item;
  Node left, right;

  public Node(int key) {
  item = key;
  left = right = null;
  }
}

class Tree {
  // root of Tree
  Node root;

  Tree() {
  root = null;
  }

  void inOrder(Node node) {
    if (node == null)
      return;

    // traversing left child
    inOrder(node.left);

    // traversing root node
    System.out.print(node.item + "->");

    // traversing right child
    inOrder(node.right);
  }


  public static void main(String[] args) {

    Tree tree = new Tree();

    // create nodes of the tree
    tree.root = new Node(1);
    tree.root.left = new Node(12);
    tree.root.right = new Node(9);

    // create child nodes of the left child
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);

    System.out.println("In Order traversal of the Tree is : ");
    tree.inOrder(tree.root);
  }
}