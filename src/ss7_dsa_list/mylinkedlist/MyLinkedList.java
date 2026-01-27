package ss7_dsa_list.mylinkedlist;

public class MyLinkedList {

	private class Node {

		int value;     // dữ liệu của node
		Node next;     // con trỏ trỏ tới node tiếp theo (mặc định là null)

		// constructor gán giá trị cho node
		public Node(int value) {
			this.value = value;
		}
	}

	private Node head;   // node đầu tiên của danh sách
	private Node tail;   // node cuối cùng của danh sách
	private int size;    // số lượng phần tử trong danh sách

	// a. addFirst (int element)
	public void addFirst(int element) {

		// tạo node mới
		Node nodeNew = new Node(element);

		// nếu danh sách rỗng
		if (head == null) {
			head = tail = nodeNew;
		} else {
			// trỏ node mới tới node đầu cũ
			nodeNew.next = head;
			// cập nhật head
			head = nodeNew;
		}
		size++;
	}

	// c. addLast (int element)
	public void addLast(int element) {

		// nếu danh sách rỗng thì thêm đầu
		if (head == null) {
			addFirst(element);
		} else {
			Node nodeNew = new Node(element);
			// node cuối trỏ tới node mới
			tail.next = nodeNew;
			// cập nhật tail
			tail = nodeNew;
			size++;
		}
	}

	// d. add (int index, int element)
	public void add(int index, int element) {

		// kiểm tra index không hợp lệ
		if (index < 0 || index > size) {
			System.out.println("Index không hợp lệ");
			return;
		}

		// thêm vào đầu
		if (index == 0) {
			addFirst(element);
		}
		// thêm vào cuối
		else if (index == size) {
			addLast(element);
		}
		// thêm vào giữa
		else {
			Node temp = head;

			// duyệt tới node trước vị trí cần thêm
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}

			Node newNode = new Node(element);
			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}
	}

	// e. removeFirst ()
	public int removeFirst() {

		if (head == null) {
			System.out.println("Danh sách rỗng");
			return -1;
		}

		int value = head.value;
		head = head.next;
		size--;

		// nếu danh sách rỗng sau khi xoá
		if (size == 0) {
			tail = null;
		}

		return value;
	}

	// f. removeLast ()
	public int removeLast() {

		if (head == null) {
			System.out.println("Danh sách rỗng");
			return -1;
		}

		// nếu chỉ có 1 phần tử
		if (size == 1) {
			return removeFirst();
		}

		Node temp = head;

		// duyệt tới node trước node cuối
		for (int i = 0; i < size - 2; i++) {
			temp = temp.next;
		}

		int value = tail.value;
		temp.next = null;
		tail = temp;
		size--;

		return value;
	}

	// g. remove (int index)
	public int remove(int index) {

		if (index < 0 || index >= size) {
			System.out.println("Index không hợp lệ");
			return -1;
		}

		if (index == 0) {
			return removeFirst();
		}

		if (index == size - 1) {
			return removeLast();
		}

		Node temp = head;

		// duyệt tới node trước vị trí cần xoá
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}

		int value = temp.next.value;
		temp.next = temp.next.next;
		size--;

		return value;
	}

	// h. getFirst ()
	public int getFirst() {
		return head.value;
	}

	// i. getLast ()
	public int getLast() {
		return tail.value;
	}

	// j. get (int index)
	public int get(int index) {

		if (index < 0 || index >= size) {
			System.out.println("Index không hợp lệ");
			return -1;
		}

		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.value;
	}

	// k. set (int index, int element)
	public void set(int index, int element) {

		if (index < 0 || index >= size) {
			System.out.println("Index không hợp lệ");
			return;
		}

		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		temp.value = element;
	}

	// l. indexOf (int element)
	public int indexOf(int element) {

		Node temp = head;
		for (int i = 0; i < size; i++) {
			if (temp.value == element) {
				return i;
			}
			temp = temp.next;
		}
		return -1;
	}

	// m. lastIndexOf (int element)
	public int lastIndexOf(int element) {

		Node temp = head;
		int index = -1;

		for (int i = 0; i < size; i++) {
			if (temp.value == element) {
				index = i;
			}
			temp = temp.next;
		}
		return index;
	}


	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();
		Node temp = head;

		for (int i = 0; i < size; i++) {
			sb.append(temp.value).append("\t");
			temp = temp.next;
		}
		return sb.toString();
	}
}
