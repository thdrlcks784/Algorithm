package Linked_List;

public class LinkedListTest {
	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertNode(12);
		linkedList.insertNode("test");
		linkedList.insertNode("ddee");
		linkedList.insertNode('c');
		linkedList.insertNode(true);
		
		//검색
		System.out.println(linkedList.searchNode("test").getData());
		
		//삭제
		System.out.println("삭제전");
		linkedList.printList();
		System.out.println("ddee 삭제후");
		linkedList.deleteNode("ddee");
		linkedList.printList();
		System.out.println("========================");
		
		//마지막 노드 삭제
		System.out.println("마지막 노드 삭제");
		linkedList.deleteNode();
		linkedList.printList();
		System.out.println("========================");
		
		//뒤집기
		System.out.println("노드 reverse");
		linkedList.reverseList();
		linkedList.printList();
	
	}
}
