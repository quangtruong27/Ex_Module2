package ss1_oop_overview.PhanSo;

import java.util.Scanner;

public class PhanSo {

	int tu;
	int mau;

	void input(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap vao phan so: ");
		tu = sc.nextInt();

		do {
			System.out.print("Nhap mau so (khac 0): ");
			mau = sc.nextInt();
			if (mau == 0) {
				System.out.println("Mau so khong duoc bang 0, nhap lai");
			}
		} while (mau == 0);

	}

	void output(){
		System.out.printf("%d/%d", tu, mau);
	}

	PhanSo cong(PhanSo ps){
		PhanSo tong = new PhanSo();
		tong.tu = tu * ps.mau + mau * ps.tu;
		tong.mau = mau * ps.mau;
		return tong;
	}

	PhanSo tru(PhanSo ps){
		PhanSo hieu = new PhanSo();
		hieu.tu = tu * ps.mau - mau * ps.tu;
		hieu.mau = mau * ps.mau;
		return hieu;
	}

	PhanSo nhan(PhanSo ps){
		PhanSo tich = new PhanSo();
		tich.tu = tu  * ps.tu;
		tich.mau = mau * ps.mau;
		return tich;
	}

	PhanSo chia(PhanSo ps){
		PhanSo thuong = new PhanSo();
		thuong.tu = tu  * ps.mau;
		thuong.mau = mau * ps.tu;
		return thuong;
	}
}

