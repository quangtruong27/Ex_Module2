package check_module2.validation;

import java.util.Date;

public class GoiBaoHiemTuVong extends GoiBaoHiem {
	private String truongHopDongBH;
	private String thoiGianToiThieuTG;

	public GoiBaoHiemTuVong() {}

	public GoiBaoHiemTuVong(String truongHopDongBH, String thoiGianToiThieuTG) {
		this.truongHopDongBH = truongHopDongBH;
		this.thoiGianToiThieuTG = thoiGianToiThieuTG;
	}

	public GoiBaoHiemTuVong(String tenGoiBaoHiem, String thoiGianDong, Double mucPhiDong, String mucDich,
							String cachThucDong, Date thoiGianBatDau, Date thoiGianKetThuc, String truongHopDongBH,
							String thoiGianToiThieuTG) {
		super(tenGoiBaoHiem, thoiGianDong, mucPhiDong, mucDich, cachThucDong, thoiGianBatDau, thoiGianKetThuc);
		this.truongHopDongBH = truongHopDongBH;
		this.thoiGianToiThieuTG = thoiGianToiThieuTG;
	}

	public String getTruongHopDongBH() {
		return truongHopDongBH;
	}

	public void setTruongHopDongBH(String truongHopDongBH) {
		this.truongHopDongBH = truongHopDongBH;
	}

	public String getThoiGianToiThieuTG() {
		return thoiGianToiThieuTG;
	}

	public void setThoiGianToiThieuTG(String thoiGianToiThieuTG) {
		this.thoiGianToiThieuTG = thoiGianToiThieuTG;
	}

	@Override
	public String getKieuGoi(){
		return "T";
	}
	@Override
	public String toString() {
		return super.toString() + "Truong hop dong bao hiem: " + truongHopDongBH + "Thoi gian toi thieu tham gia: "
				+ thoiGianToiThieuTG;
	}
}
