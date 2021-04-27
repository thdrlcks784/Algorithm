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
	//마지막 삭제
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
	//중간 탐색
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
	//마지막 탐색
	public Node searchNode() {
		Node preNode = this.head;
		Node tempNode = this.head;
		if(preNode != null) {
			tempNode = preNode.next;
		}
		if(tempNode==null) {
			return preNode;
		}
		while(tempNode != null) {
			preNode = tempNode;
			tempNode = tempNode.next;
		}
		return preNode;
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
	
	public int size() {
		Node tempNode = head;
		int size = 0;
		while(tempNode != null) {
			tempNode = tempNode.next;
			size++;
		}
		return size;
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
