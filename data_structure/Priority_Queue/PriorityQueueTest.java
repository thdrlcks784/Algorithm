package Priority_Queue;

import java.util.Random;

public class PriorityQueueTest {
	public static void main(String args[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		Random rnd = new Random();
		
		for(int i = 0; i < 15; i++) {
			pq.offer(rnd.nextInt(100));
		}
		System.out.println("비었나 ? : " + pq.isEmpty());
		System.out.println("크기 : " + pq.size());
		while(!pq.isEmpty()) {
			System.out.print(pq.poll() + " ");
		}
	}
}
