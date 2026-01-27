package ss7_dsa_list.mylinkedlist;

public class Main {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();

		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(20);

		System.out.println(list);

		list.add(1, 99);
		System.out.println(list);

		System.out.println("getFirst: " + list.getFirst());
		System.out.println("getLast: " + list.getLast());

		list.set(2, 88);
		System.out.println(list);

		System.out.println("indexOf(20): " + list.indexOf(20));
		System.out.println("lastIndexOf(20): " + list.lastIndexOf(20));

		list.removeFirst();
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

		list.remove(1);
		System.out.println(list);
	}
}
