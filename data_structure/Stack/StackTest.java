package Stack;

public class StackTest {
	public static void main(String args[]) {
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		
		st.push("test1");
		st.push("test2");
		st.push("test3");
		
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.pop());
		System.out.println(st.size());
		
		
	}
}
