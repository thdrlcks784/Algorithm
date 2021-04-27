package Stack;
import Linked_List.LinkedList;
public class Stack {
	
	LinkedList linkedList = new LinkedList();
	
	public Object pop() {
		Object data = linkedList.searchNode().getData();
		linkedList.deleteNode();
		return data;
	}
	
	public void push(Object input) {
		linkedList.insertNode(input);
	}
	
	public Object peek() {
		return linkedList.searchNode().getData();
	}
	
	public boolean isEmpty() {
		return linkedList.searchNode() ==null;
	}
	
	public int size() {
		return linkedList.size();
	}
}