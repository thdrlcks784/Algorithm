package Linked_List;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	// 중간 삽입
	public void insertNode(Node preNode, Object data) {
		Node newNode = new Node(data);
		newNode.next = preNode.next;
		preNode.next = newNode;
	}
	//마지막 삽입
	public void insertNode(Object data) {
		Node newNode = new Node(data);
		if(head == null) {
			this.head = newNode;
		}
		else {
			Node tempNode = head;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}
	//중간 삭제
	public void deleteNode(Object data) {
		Node preNode = head;
		Node tempNode = head.next;
		
		if( data.equals( preNode.getData() ) ) {
			head = preNode.next;
			preNode.next = null;
		}
		else {
			while(tempNode != null) {
				if(data.equals( tempNode.getData() )) {
					if(tempNode.next == null) {
						preNode.next = null;
					}
					else {
						preNode.next = tempNode.next;
						tempNode.next = null;
					}
					break;
				}
				else {
					preNode = tempNode;
					tempNode = tempNode.next;
				}
			}
		}
	}
	
	public void deleteNode() {
		Node preNode;
		Node tempNode;
		
		if(head ==null) {
			return;
		}
		
		if(head.next ==null) {
			head = null;
		}
		else {
			preNode = head;
			tempNode = head.next;
			
			while(tempNode.next !=null) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			
			preNode.next = null;
		}
	}
	
	public Node searchNode(Object data) {
		Node tempNode = this.head;
		
		while(tempNode != null) {
			if( data.equals( tempNode.getData() ) ) {
				return tempNode;
			}
			else {
				tempNode = tempNode.next;
			}
		}
		return tempNode;
	}
	
	public void reverseList() {
		Node nextNode = head;
		Node curNode = null;
		Node preNode = null;
		
		while(nextNode != null) {
			preNode = curNode;
			curNode = nextNode;
			nextNode = nextNode.next;
			curNode.next = preNode;
		}
		head = curNode;
	}
	
	public void printList() {
		Node tempNode = this.head;
		
		while(tempNode != null) {
			System.out.print(tempNode.getData()+ " ");
			tempNode = tempNode.next;
		}
		System.out.println();
	}
}
