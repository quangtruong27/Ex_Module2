package ss8_generic_stack_queue.mystack;

public class Main {
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.size());
	}
}

