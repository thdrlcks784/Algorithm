package Queue;

public class QueueTest {
	public static void main(String args[]) {
		Queue queue = new Queue();
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		
		
		queue.add("test1");
		queue.add("test2");
		
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.size());
	}
}
