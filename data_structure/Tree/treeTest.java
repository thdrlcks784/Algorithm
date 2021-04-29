package Tree;

public class treeTest {
	public static void main(String[] args) {
		Tree t = new Tree();
		
		Node n4 = t.createNode(null, 4, null);
		Node n5 = t.createNode(null, 5, null);
		Node n2 = t.createNode(n4, 2, n5);
		Node n3 = t.createNode(null, 3, null);
		Node n1 = t.createNode(n2, 1, n3);
		
		t.setRoot(n1);
		System.out.println("중위 순회");
		t.inOrder(t.getRoot());
		System.out.println("전위 순회");
		t.preOrder(t.getRoot());
		System.out.println("후위 순회");
		t.postOrder(t.getRoot());
	}
}
