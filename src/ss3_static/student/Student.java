package ss3_static.student;

public class Student {

	private int id;
	private String name;
	private double score;

	private static int studentCount = 0;

	public Student(int id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;

		studentCount++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	public void output(){
		System.out.println("ID: " + id + " | Name: " + name + " | Score: " + score);
	}
}
