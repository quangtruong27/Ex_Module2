package check_module2.validation;

import check_module2.util.ReadFileUtil;
import check_module2.util.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<KhachHang> listKhachHang = new ArrayList<>();

		System.out.println("Dang doc du lieu tu file input.txt...");
		try {
			listKhachHang = ReadFileUtil.readCustomerFile("src/check_module2/data/input.txt");
			System.out.println("Doc file thanh cong");
		} catch (IOException e) {
			System.err.println("Loi khi doc file: " + e.getMessage());
			return;
		}

		while (true) {
			System.out.println("\n========== QUAN LY BAO HIEM ==========");
			System.out.println("1. Hien thi danh sach khach hang");
			System.out.println("2. Tim kiem theo so CMND");
			System.out.println("3. Hien thi goi bao hiem co phi cao nhat");
			System.out.println("4. Thoat");
			System.out.print("Moi ban chon chuc nang: ");

			int choice = -1;
			try {
				choice = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap so");
			}

			switch (choice) {
				case 1:
					hienThiDanhSach(listKhachHang);
					break;
				case 2:
					//timKiemTheoCMND(scanner, listKhachHang);
					break;
				case 3:
					//hienThiGoiPhiCaoNhat(listKhachHang);
					break;
				case 4:
					System.out.println("Ket thuc chuong trinh.");
					return;
				default:
					System.out.println("Chuc nang khong hop le!");
			}
		}
	}

	private static void hienThiDanhSach(List<KhachHang> list) {
		if (list.isEmpty()) {
			System.out.println("Danh sach trong.");
			return;
		}
		System.out.println("\n--- DANH SACH KHACH HANG ---");
		for (KhachHang kh : list) {
			hienThiChiTiet(kh);
			System.out.println("--------------------------------------------------");
		}
	}

	private static void hienThiChiTiet(KhachHang kh) {
		// 1. In thông tin khách hàng
		System.out.println("Ho ten: " + kh.getHoTen());
		System.out.println("Ngay sinh: " + Util.dateToString(kh.getNgaySinh()));
		System.out.println("Noi thuong tru: " + kh.getNoiThuongTru());
		System.out.println("So chung minh thu: " + kh.getSoCMND());

		// 2. In thông tin gói bảo hiểm
		GoiBaoHiem g = kh.getGoiBaoHiem();
		if (g != null) {
			System.out.println("Ten goi BH: " + g.getTenGoiBaoHiem());
			System.out.println("Thoi han: " + g.getThoiGianDong());
			System.out.println("Muc phi: " + String.format("%.0f", g.getMucPhiDong()));
			System.out.println("Muc dich: " + g.getMucDich());
			System.out.println("Cach thuc dong phi: " + g.getCachThucDong());
			System.out.println("Thoi gian bat dau: " + Util.dateToString(g.getThoiGianBatDau()));
			System.out.println("Thoi gian ket thuc: " + Util.dateToString(g.getThoiGianKetThuc()));

		}
	}
}