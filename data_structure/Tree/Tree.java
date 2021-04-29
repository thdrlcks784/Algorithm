package Tree;

public class Tree {
	public Node root;
	
	public void setRoot(Node node) {
		this.root = node;
	}
	
	public Node getRoot() {
		return root;
	}
	
	public Node createNode(Node left,int data, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		
		return node;
	}
	
	//중위 순회 Left -> Root -> Right
	public void inOrder(Node node) {
		if(node != null) {
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
	}
	
	//전위 순회 Root -> Left -> Right
	public void preOrder(Node node) {
		if(node != null) {
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	//후위순회 Left -> Right -> Root
	public void postOrder(Node node) {
		if(node != null) {
			preOrder(node.left);
			preOrder(node.right);
			System.out.println(node.data);
		}
	}
}
