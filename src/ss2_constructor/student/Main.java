package ss2_constructor.student;

public class Main {
	public static void main(String[] args) {
		// hop le
		System.out.println("=== SINH VIEN BAN DAU ===");
		Student s1 = new Student(1, "Nguyen Van A", 8.5);
		s1.output();

		// doi ten
		System.out.println("\n*** Setter Name ***");
		s1.setName("");             // loi
		s1.setName("Le Van B");     // ok
		System.out.println("Ten moi: " + s1.getName());

		// doi diem
		System.out.println("\n*** Setter Score ***");
		s1.setScore(-5);            // loi
		s1.setScore(15);            // loi
		s1.setScore(9.0);           // ok

		System.out.println("Điem moi: " + s1.getScore());

		System.out.println("\n=== THON TIN CUOI CUNG ===");
		s1.output();
	}
}
