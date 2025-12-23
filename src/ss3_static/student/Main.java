package ss3_static.student;

public class Main {
	public static void main(String[] args) {

		System.out.println("So luong SV ban dau: " + Student.getStudentCount());

		// sv 1
		Student s1 = new Student(1, "Nguyen Van A", 8.5);
		s1.output();
		System.out.println("Sau khi tao sv 1: " + Student.getStudentCount());

		// sv 2
		Student s2 = new Student(2, "Tran Thi B", 9.0);
		s2.output();
		System.out.println("Sau khi tao sv 2: " + Student.getStudentCount());

		// sv 3
		Student s3 = new Student(3, "Le Van C", 7.5);
		s3.output();
		System.out.println("Sau khi tao sv 3: " + Student.getStudentCount());

	}
}
