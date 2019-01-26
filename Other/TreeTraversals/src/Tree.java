
public class Tree {
	public Node root;
	
	public void printInOrderTraversal(Node root) {
		if(root == null) return;
		printInOrderTraversal(root.left);
		System.out.println(root.value);
		printInOrderTraversal(root.right);

	}
	public void printPreOrderTraversal(Node root) {
		if(root == null) return;
		System.out.println(root.value);
		printPreOrderTraversal(root.left);
		printPreOrderTraversal(root.right);

	}
	public void printPostOrderTraversal(Node root) {
		if(root == null) return;
		printPostOrderTraversal(root.left);
		printPostOrderTraversal(root.right);
		System.out.println(root.value);
	}
}
