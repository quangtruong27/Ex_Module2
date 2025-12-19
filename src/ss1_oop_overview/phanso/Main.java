package ss1_oop_overview.phanso;

public class Main {
	public static void main(String[] args) {
		PhanSo ps1 = new  PhanSo();
		PhanSo ps2 = new  PhanSo();

		ps1.input();
		ps2.input();

		System.out.println("Tong: ");
		PhanSo tong = ps1.cong(ps2);
		tong.output();

		System.out.println("Hieu: ");
		PhanSo hieu = ps1.tru(ps2);
		hieu.output();

		System.out.println("Tich: ");
		PhanSo tich = ps1.nhan(ps2);
		tich.output();

		System.out.println("Thuong: ");
		PhanSo thuong = ps1.chia(ps2);
		thuong.output();

		System.out.println("Phan so 1 la: ");
		ps1.check();

		System.out.println("Phan so 2 la: ");
		ps2.check();
	}
}
