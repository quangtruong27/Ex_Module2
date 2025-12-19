package ss1_oop_overview.coordinate;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();

		System.out.print("Nhap diem 1: ");
		p1.input();
		System.out.print("Nhap diem 2: ");
		p2.input();

		System.out.println("Diem 1: ");
		p1.output();
		System.out.println("Diem 2: ");
		p2.output();

		System.out.println("Khoang cach giua 2 diem: " + p1.distanceTo(p2));

	}
}
