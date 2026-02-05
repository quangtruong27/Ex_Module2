package check_module2.validation;

import java.util.Date;

public class GoiBaoHiemTheoHanHopDong extends GoiBaoHiem{
	private String sanPhamBHDiKem;

	public GoiBaoHiemTheoHanHopDong(){}
	public GoiBaoHiemTheoHanHopDong(String sanPhamBHDiKem) {
		this.sanPhamBHDiKem = sanPhamBHDiKem;
	}

	public GoiBaoHiemTheoHanHopDong(String tenGoiBaoHiem, String thoiGianDong, Double mucPhiDong, String mucDich, String cachThucDong, Date thoiGianBatDau, Date thoiGianKetThuc, String sanPhamBHDiKem) {
		super(tenGoiBaoHiem, thoiGianDong, mucPhiDong, mucDich, cachThucDong, thoiGianBatDau, thoiGianKetThuc);
		this.sanPhamBHDiKem = sanPhamBHDiKem;
	}

	public String getSanPhamBHDiKem() {
		return sanPhamBHDiKem;
	}

	public void setSanPhamBHDiKem(String sanPhamBHDiKem) {
		this.sanPhamBHDiKem = sanPhamBHDiKem;
	}

	@Override
	public String getKieuGoi(){
		return "H";
	}

	@Override
	public String toString() {
		return super.toString() + "San pham bao hiem di kem: " + sanPhamBHDiKem;
	}
}
