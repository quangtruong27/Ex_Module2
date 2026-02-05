package check_module2.validation;

import check_module2.util.Util;

import java.util.Date;

public abstract class GoiBaoHiem {
	private String tenGoiBaoHiem;
	private String thoiGianDong;
	private Double mucPhiDong;
	private String mucDich;
	private String cachThucDong;
	private Date thoiGianBatDau;
	private Date thoiGianKetThuc;

	public GoiBaoHiem() {}

	public GoiBaoHiem(String tenGoiBaoHiem, String thoiGianDong, Double mucPhiDong, String mucDich, String cachThucDong, Date thoiGianBatDau, Date thoiGianKetThuc) {
		this.tenGoiBaoHiem = tenGoiBaoHiem;
		this.thoiGianDong = thoiGianDong;
		this.mucPhiDong = mucPhiDong;
		this.mucDich = mucDich;
		this.cachThucDong = cachThucDong;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public String getTenGoiBaoHiem() {
		return tenGoiBaoHiem;
	}

	public void setTenGoiBaoHiem(String tenGoiBaoHiem) {
		this.tenGoiBaoHiem = tenGoiBaoHiem;
	}

	public String getThoiGianDong() {
		return thoiGianDong;
	}

	public void setThoiGianDong(String thoiGianDong) {
		this.thoiGianDong = thoiGianDong;
	}

	public Double getMucPhiDong() {
		return mucPhiDong;
	}

	public void setMucPhiDong(Double mucPhiDong) {
		this.mucPhiDong = mucPhiDong;
	}

	public String getMucDich() {
		return mucDich;
	}

	public void setMucDich(String mucDich) {
		this.mucDich = mucDich;
	}

	public String getCachThucDong() {
		return cachThucDong;
	}

	public void setCachThucDong(String cachThucDong) {
		this.cachThucDong = cachThucDong;
	}

	public Date getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(Date thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public Date getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public abstract String getKieuGoi();

	@Override
	public String toString() {
		return "Ten goi bao hiem: " + tenGoiBaoHiem + "Thoi gian dong: " +thoiGianDong +
				"Muc phi dong: " + mucPhiDong + "Cach thuc dong: " + cachThucDong +
				"Thoi gian bat dau: " + Util.dateToString(thoiGianBatDau) + "Thoi gian ket thuc: " + Util.dateToString(thoiGianKetThuc);
	}


}
