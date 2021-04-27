package Queue;
import Linked_List.LinkedList;

public class Queue {
	
	LinkedList linkedList = new LinkedList();
	
	public void add(Object Data) {
		linkedList.insertNode(Data);
	}
	
	public Object peek() {
		return linkedList.firstSearchNode();
	}
	
	public Object poll() {
		Object data = linkedList.firstSearchNode();
		linkedList.firstDeleteNode();
		return data;
	}
	
	public boolean isEmpty() {
		return linkedList.firstSearchNode()==null;
	}
	
	public int size() {
		return linkedList.size();
	}
}
