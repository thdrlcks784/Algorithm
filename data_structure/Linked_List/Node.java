package Linked_List;

public class Node {
	private Object data;
	public Node next;
	
	public Node() {
		this.data = null;
		this.next = null;
	}
	
	public Node(Object input){
		this.data = input;
		this.next = null;
	}
	
	public Node(Object input, Node next) {
		this.data = input;
		this.next = next;
	}
	
	public Object getData() {
		return this.data;
	}
	
	public String toString() {
		return String.valueOf(this.data);
	}
}
