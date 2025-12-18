package ss1_oop_overview.PhanSo;

public class Main {
	public static void main(String[] args) {
		PhanSo ps1 = new  PhanSo();
		PhanSo ps2 = new  PhanSo();

		ps1.input();
		ps2.input();


		PhanSo tong = ps1.cong(ps2);
		tong.output();
		PhanSo hieu = ps1.tru(ps2);
		hieu.output();
		PhanSo tich = ps1.nhan(ps2);
		tich.output();
		PhanSo thuong = ps1.chia(ps2);
		thuong.output();
	}
}
