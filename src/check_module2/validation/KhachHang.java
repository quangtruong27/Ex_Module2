package check_module2.validation;

import check_module2.util.Util;

import java.util.Date;

public class KhachHang {
	private String hoTen;
	private Date ngaySinh;
	private String noiThuongTru;
	private String soCMND;
	private GoiBaoHiem goiBaoHiem;

	public KhachHang() {}

	public KhachHang(String hoTen, Date ngaySinh, String noiThuongTru, String soCMND,  GoiBaoHiem goiBaoHiem) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.noiThuongTru = noiThuongTru;
		this.soCMND = soCMND;
		this.goiBaoHiem = goiBaoHiem;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getNoiThuongTru() {
		return noiThuongTru;
	}

	public void setNoiThuongTru(String noiThuongTru) {
		this.noiThuongTru = noiThuongTru;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public GoiBaoHiem getGoiBaoHiem() {
		return goiBaoHiem;
	}

	public void setGoiBaoHiem(GoiBaoHiem goiBaoHiem) {
		this.goiBaoHiem = goiBaoHiem;
	}

	@Override
	public String toString() {
		return "Ho Ten: " + hoTen + "Ngay Sinh: " + Util.dateToString(ngaySinh) +
				"Noi Thuong Tru: " + noiThuongTru + "SoCMND: " + soCMND
				+ goiBaoHiem.toString();
	}
}
