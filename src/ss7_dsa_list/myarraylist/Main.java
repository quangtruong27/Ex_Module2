package ss7_dsa_list.myarraylist;

public class Main {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);

		System.out.println("Danh sach ban đau:");
		System.out.println(list);

		// add(int index, int element)
		list.add(1, 99);
		System.out.println("Sau khi add(1, 99):");
		System.out.println(list);

		// get(int index)
		System.out.println("Phan tu tai index 2:");
		System.out.println(list.get(2));

		// set(int index, int element)
		list.set(2, 88);
		System.out.println("Sau khi set(2, 88):");
		System.out.println(list); // 10  99  88  30  20

		// indexOf
		System.out.println("indexOf(20): " + list.indexOf(20));

		//lastIndexOf
		list.add(20);
		System.out.println("Danh sach sau khi add them 20:");
		System.out.println(list);
		System.out.println("lastIndexOf(20): " + list.lastIndexOf(20));

		// remove(int index)
		list.remove(1);
		System.out.println("Sau khi remove(1):");
		System.out.println(list);

		// removeElement(int element)
		list.removeElement(20);
		System.out.println("Sau khi removeElement(20):");
		System.out.println(list);
	}
}
