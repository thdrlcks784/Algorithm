package Priority_Queue;

import Heap.Heap;

public class PriorityQueue<E> {
	Heap<E> heap = new Heap<>();
	
	public void offer(E value) {
		heap.add(value);
	}
	
	public E peek() {
		return heap.peek();
	}
	
	public E poll() {
		return heap.remove();
	}
	
	public void remove() {
		heap.remove();
	}
	
	public void clear() {
		while(!heap.isEmpty()) {
			heap.remove();
		}
	}
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		return heap.isEmpty();
	}
	
}
