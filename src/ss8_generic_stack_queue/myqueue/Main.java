package ss8_generic_stack_queue.myqueue;

public class Main {
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);

		System.out.println("Queue ban đau:");
		System.out.println(queue);

		System.out.println("Peek: " + queue.peek());

		System.out.println("Poll: " + queue.poll());
		System.out.println("Sau poll:");
		System.out.println(queue);

		System.out.println("Is empty " + queue.isEmpty());

		System.out.println("Size: " + queue.size());

		System.out.println("Poll: " + queue.poll());
		System.out.println("Poll: " + queue.poll());

		System.out.println("Queue sau khi poll het:");
		System.out.println(queue);
		System.out.println("Is empty " + queue.isEmpty());
	}
}