package ss2_constructor.phan_so;

public class PhanSo {

	private int tu;
	private int mau;


	public PhanSo(){
		this.tu = 0;
		this.mau = 1;
	}

	public PhanSo(int tu){
		this.tu = tu;
		this.mau = 1;
	}

	public PhanSo(int tu, int mau) {
		if(mau == 0){
			System.out.println("Khong duoc bang 0");
		}
		this.tu = tu;
		this.mau = mau;
	}

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {
		this.mau = mau;
	}

	public PhanSo copy() {
		return new PhanSo(this.tu, this.mau);
	}

	private int USCLN(int a, int b){
		a = Math.abs(a);
		b = Math.abs(b);
		while(b != 0){
			int item = b;
			b = a % b;
			a = item;
		}
		return a;
	}

	private void rutGon(){
		int uscln = USCLN(this.tu, this.mau);
		this.tu /= uscln;
		this.mau /= uscln;

		if(this.mau < 0){// mau < 0 thi dua dau tru len tu so
			this.tu = -this.tu;
			this.mau = -this.mau;
		}
	}

	public PhanSo cong(PhanSo ps){
		PhanSo tong = new PhanSo();
		tong.setTu( tu * ps.mau + mau * ps.tu) ;
		tong.setMau(mau * ps.mau);
		return tong;
	}

	public void cong(int ps){
		this.tu = this.tu + ps * this.mau;
		rutGon();
	}

	 void output() {

		if (mau == 1) {
			System.out.println(tu);
		} else if (tu == 0) {
			System.out.println("0");
		} else {
			System.out.println(tu + "/" + mau);
		}
	}

	void check() {
		if (tu == 0) {
			System.out.println("Phan so bang 0");
		} else if (tu > 0 && mau > 0 || tu < 0 && mau < 0) {
			System.out.println("Phan so duong");
		} else {
			System.out.println("Phan so am");
		}
	}
}

