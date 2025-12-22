package ss2_constructor.student;

/**
 * Xây dựng lớp Student thỏa mãn tính bao đóng
 * Thông tin của học sinh bao gồm:
 * id: Không được phép chỉnh sửa.
 * name: Bắt buộc nhập.
 * score: Phải nằm trong khoảng từ 0 đến 10.
 * Nếu không thỏa mãn, hiển thị thông báo lỗi và không cho phép cập nhật thông tin.
 * Gợi ý: id không cài đặt setter, name & score xét điều kiện ở setter.
 */
public class Student {

	private int id;
	private String name;
	private double score;

	public Student(int id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			System.out.println("Khong co ten");
		} else {
			this.name = name;
		}
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 0 && score <= 10) {
			this.score = score;
		} else {
			System.out.println("Diem phai nam trong 0 - 10");
		}
	}

	public void display() {
		System.out.println("ID: " + id + " | Name: " + name + " | Score: " + score);
	}
}
