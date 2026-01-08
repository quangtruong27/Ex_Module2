//package ss5_polymorphism.overload_override;
//
//public class Main {
//
//	// Trường hợp 1: Lớp SinhVien ghi đè phương thức a() từ lớp HocVien => Override
//	public class HocVien{
//		public void a(){
//			System.out.println("a cha");
//		}
//	}
//
//	public class SinhVien extends HocVien{
//		public void a(){
//			System.out.println("a con");
//		}
//	}
//
//	// Trường hợp 2: Lớp SinhVien ghi đè phương thức a() từ lớp HocVien, mở rộng pham vi truy cập (Defaul -> public) => Override
//	public class HocVien{
//		public void a(){
//			System.out.println("a cha");
//		}
//	}
//
//	public class SinhVien extends HocVien{
//		public void a(){
//			System.out.println("a con");
//		}
//	}
//
//	// Trường hợp 3: Phương thức a() trong lớp HocVien có phạm vi truy cập là private, nên lớp SinhVien không thể ghi đè nó.
//	// =>  Không có hiện tượng nào cả.
//
//	public class HocVien {
//		private void a() {
//			System.out.println("a cha");
//		}
//	}
//
//	public class SinhVien extends HocVien {
//		public void a() {
//			System.out.println("a con");
//		}
//	}
//
//	// Trường hợp 4: Lớp SinhVien ghi đè phương thức a() từ lớp HocVien, thu hẹp phạm vi truy cập => override
//	public class HocVien {
//		public void a() {
//			System.out.println("a cha");
//		}
//	}
//
//	public class SinhVien extends HocVien {
//		protected void a() {
//			System.out.println("a con");
//		}
//	}
//
//	// Trường hợp 5: Mặc dù phương thức a() có cùng tên, nhưng chúng trả về các kiểu dữ liệu khác nhau (byte và int).
//	// Java không cho phép ghi đè một phương thức và thay đổi kiểu trả về của nó. =>  Không có hiện tượng nào cả.
//
//	public class HocVien {
//		public byte a() {
//			System.out.println("a cha");
//			return 1;
//		}
//	}
//
//	public class SinhVien extends HocVien {
//		public int a() {
//			System.out.println("a con");
//			return 1;
//		}
//	}
//
//	// Trường hợp 6: Lớp SinhVien ghi đè phương thức a() từ lớp HocVien và thay đổi kiểu trả về từ
//	// Animal thành Dog (giả sử Dog là lớp con của Animal). Điều này là hợp lệ trong Java khi ghi đè.=> Override
//
//	public class HocVien {
//		public Animal a() {
//			System.out.println("a cha");
//			return null;
//		}
//	}
//
//	public class SinhVien extends HocVien {
//		public Dog a() {
//			System.out.println("a con");
//			return null;
//		}
//	}
//
//	// Trường hợp 7: Lớp SinhVien đã thêm một phương thức a(int i) không có trong lớp HocVien.=> Hiện tượng OL (Overloading) trong lớp SinhVien.
//
//	public class HocVien {
//		public void a(){
//		}
//	}
//
//	public class SinhVien extends HocVien {
//		public void a(int i){
//		}
//	}
//
//	// Trường hợp 8: Cả hai phương thức a() trong lớp SinhVien và HocVien đều được định nghĩa là static và có tên giống nhau.
//	// Nhưng, trong lập trình Java, một phương thức static không thể "ghi đè" (Override).
//	// Do đó, phương thức a() trong lớp SinhVien chỉ đơn giản "ẩn đi" phương thức a() trong lớp HocVien.
//	// => Không có sự "ghi đè" (Override) hay "nạp chồng" (Overload) ở đây.
//
//	public class HocVien {
//		public static void a(){
//		}
//	}
//
//	public class SinhVien extends HocVien {
//		public static void a(){
//		}
//	}
//
//	// Trường hợp 9: Phương thức a(double d, int c) trong lớp SinhVien có tham số đầu tiên là kiểu double,
//	// trong khi phương thức a(int b, int c) trong lớp HocVien có tham số đầu tiên là kiểu int.
//	// Mặc dù cả hai phương thức đều có tên a nhưng tham số của chúng khác nhau.
//	// => Đây là một ví dụ về sự "nạp chồng" (Overloading) phương thức.
//
//	public class HocVien {
//		public void a(int b, int c){
//			System.out.println(b+""+c);
//		}
//	}
//
//	public class SinhVien extends HocVien {
//		public void a(double d, int c){
//			System.out.println(d+""+c);
//		}
//	}
//
//	// Trường hợp 10: Lớp SinhVien thêm một phương thức mới b(double d, int c) không tồn tại trong lớp HocVien.
//	// => Không có hiện tượng nào cả.
//
//	public class HocVien {
//		public void a(int b, int c){
//			System.out.println(b+""+c);
//		}
//	}
//
//	public class SinhVien extends HocVien {
//		public void b(double d, int c){
//			System.out.println(d+""+c);
//		}
//	}
//}
