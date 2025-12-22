package ss2_constructor.phan_so;

public class Main {
	public static void main(String[] args) {
		PhanSo a = new PhanSo();
		a.output();

		PhanSo b = new PhanSo(1, 2);
		b.output();

		PhanSo c = new PhanSo(3);
		c.output();

		PhanSo d = new PhanSo(-6, -2);
		d.output();

		PhanSo e = new PhanSo(3, -1);
		e.output();

		PhanSo f = e.copy();
		f.cong(100);
		f.output();
	}
}
