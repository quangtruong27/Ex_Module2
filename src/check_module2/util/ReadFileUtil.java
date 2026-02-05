package check_module2.util;

import check_module2.validation.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {

	private static List<String> readFile(String path) throws IOException {
		File file = new File(path);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		List<String> strings = new ArrayList<>();

		while ((line = bufferedReader.readLine()) != null) {
			// Kiểm tra dòng trống
			if (!line.trim().isEmpty()) {
				strings.add(line);
			}
		}
		bufferedReader.close();
		return strings;
	}

	public static List<KhachHang> readCustomerFile(String path) throws IOException {
		List<String> lines = readFile(path);
		List<KhachHang> customers = new ArrayList<>();

		GoiBaoHiem goiBaoHiem = null;
		KhachHang khachHang;
		String[] info;

		for (String line : lines) {
			info = line.split(",");
			if (info.length < 10) continue; //ktr tranh loi

			goiBaoHiem = null; //reset

			if (info[0].equals("T")) {
				GoiBaoHiemTuVong tv = new GoiBaoHiemTuVong();
				tv.setTruongHopDongBH(info[13]);
				tv.setThoiGianToiThieuTG(info[14]);
				goiBaoHiem = tv;

			} else if (info[0].equals("H")) {
				GoiBaoHiemTheoHanHopDong hd = new GoiBaoHiemTheoHanHopDong();
				hd.setSanPhamBHDiKem(info[12]);
				goiBaoHiem = hd;

			} else if (info[0].equals("S")) {
				GoiBaoHiemSinhKy sk = new GoiBaoHiemSinhKy();
				sk.setThoiGianTroCap(info[15]);
				goiBaoHiem = sk;
			}

			if (goiBaoHiem != null) {
				// Các thông tin chung
				goiBaoHiem.setTenGoiBaoHiem(info[5]);
				goiBaoHiem.setThoiGianDong(info[6]);
				goiBaoHiem.setMucPhiDong(Double.parseDouble(info[7]));
				goiBaoHiem.setMucDich(info[8]);
				goiBaoHiem.setCachThucDong(info[9]);
				goiBaoHiem.setThoiGianBatDau(Util.parseDate(info[10]));
				goiBaoHiem.setThoiGianKetThuc(Util.parseDate(info[11]));

				khachHang = new KhachHang();
				khachHang.setHoTen(info[1]);
				khachHang.setNgaySinh(Util.parseDate(info[2]));
				khachHang.setNoiThuongTru(info[3]);
				khachHang.setSoCMND(info[4]);
				khachHang.setGoiBaoHiem(goiBaoHiem);

				customers.add(khachHang);
			}
		}
		return customers;
	}
}