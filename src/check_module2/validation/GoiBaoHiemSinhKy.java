package check_module2.validation;

import java.util.Date;

public class GoiBaoHiemSinhKy extends GoiBaoHiem {
	private String thoiGianTroCap;

	public GoiBaoHiemSinhKy() {}

	public GoiBaoHiemSinhKy(String thoiGianTroCap) {
		this.thoiGianTroCap = thoiGianTroCap;
	}

	public GoiBaoHiemSinhKy(String tenGoiBaoHiem, String thoiGianDong, Double mucPhiDong, String mucDich,
							String cachThucDong, Date thoiGianBatDau, Date thoiGianKetThuc, String thoiGianTroCap) {
		super(tenGoiBaoHiem, thoiGianDong, mucPhiDong, mucDich, cachThucDong, thoiGianBatDau, thoiGianKetThuc);
		this.thoiGianTroCap = thoiGianTroCap;
	}

	public String getThoiGianTroCap() {
		return thoiGianTroCap;
	}

	public void setThoiGianTroCap(String thoiGianTroCap) {
		this.thoiGianTroCap = thoiGianTroCap;
	}

	@Override
	public String getKieuGoi(){
		return "S";
	}

	@Override
	public String toString() {
		return super.toString() + "Thoi gian tro cap: " + thoiGianTroCap;
	}
}
