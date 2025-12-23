package ss3_static.math_util;

public class Main {
	public static void main(String[] args) {
		double x = 10.5;
		double y = 2.5;

		// MathUtil: gọi trực tiếp bằng tên lớp mà không cần tạo đối tượng.
		double tong = MathUtil.add(x, y);
		double hieu = MathUtil.subtract(x, y);
		double tich = MathUtil.multiply(x, y);
		double thuong = MathUtil.divide(x, y);

		System.out.println("Tong: " + tong);
		System.out.println("Hieu: " + hieu);
		System.out.println("Tich: " + tich);
		System.out.println("Thuong: " + thuong);

	}
}
