package ss11_file.phone.validation;

import ss11_file.phone.util.ReadFileUtil;
import ss11_file.phone.util.WriteFileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PhoneService {

	private static List<Phone> phones = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);

	static {
		try {
			phones = ReadFileUtil.readPhoneFile("src/ss11_file/phone/data/phones.csv");
		} catch (IOException e) {
			System.out.println("Loi" + e.getMessage());
			phones = new ArrayList<>();
		}
	}

	// 1. XEM DANH SACH
	public void displayPhone() {
		System.out.println("===== DANH SACH DIEN THOAI =====");
		for (Phone p : phones) {
			p.showInfo();
		}
	}

	public void displayNew() {
		System.out.println("----- DANH SACH DIEN THOAI MOI -----");
		for (Phone p : phones) {
			if (p instanceof NewPhone) {
				p.showInfo();
			}
		}
	}

	public void displayOld() {
		System.out.println("----- DANH SACH DIEN THOAI CU -----");
		for (Phone p : phones) {
			if (p instanceof OldPhone) {
				p.showInfo();
			}
		}
	}

	// 2. THEM MOI
	public void addPhone(boolean isNew) {
		System.out.println("--- NHAP THONG TIN ---");
		Phone p;

		// Logic tạo ID tự động (dựa trên size hoặc cách bạn muốn)
		if (isNew) {
			p = new NewPhone();
			p.setId("DTM" + (phones.size() + 1));
		} else {
			p = new OldPhone();
			p.setId("DTC" + (phones.size() + 1));
		}

		System.out.println("ID: " + p.getId());

		while (true) {
			try {
				p.input(sc);
				phones.add(p);

				// GHI FILE: VIẾT TRỰC TIẾP ĐƯỜNG DẪN VÀO ĐÂY
				WriteFileUtil.writePhonesFile("src/ss11_file/phone/data/phones.csv", phones);

				System.out.println("THEM THANH CONG!");
				break;
			} catch (Exception e) {
				System.out.println("Loi: " + e.getMessage());
			}
		}
	}

	// 3. CAP NHAT
	public void updatePhone() {
		System.out.print("Nhap ID cap nhat: ");
		String idInput = sc.nextLine();

		for (Phone p : phones) {
			if (p.getId().equalsIgnoreCase(idInput)) {
				System.out.println("Tim thay: " + p.getNamePhone());
				while (true) {
					try {
						p.input(sc);

						// GHI FILE SAU KHI SỬA
						WriteFileUtil.writePhonesFile("src/ss11_file/phone/data/phones.csv", phones);

						System.out.println("UPDATE THANH CONG");
						return;
					} catch (Exception e) {
						System.out.println("Loi: " + e.getMessage());
					}
				}
			}
		}
		System.out.println("Khong tim thay ID!");
	}

	// 4. XOA
	public void deletePhone() {
		System.out.print("Nhap ID can xoa: ");
		String idInput = sc.nextLine();

		for (int i = 0; i < phones.size(); i++) {
			if (phones.get(i).getId().equalsIgnoreCase(idInput)) {
				System.out.println("Tim thay: " + phones.get(i).getNamePhone());
				System.out.print("Xac nhan xoa (Yes/No)? ");
				if (sc.nextLine().equalsIgnoreCase("Yes")) {
					phones.remove(i);

					// GHI FILE SAU KHI XÓA (Cần try-catch vì hàm này ném IOException)
					try {
						WriteFileUtil.writePhonesFile("src/ss11_file/phone/data/phones.csv", phones);
						System.out.println("Xoa thanh cong!");
					} catch (IOException e) {
						System.out.println("Lỗi lưu file: " + e.getMessage());
					}

				} else {
					System.out.println("Huy xoa.");
				}
				return;
			}
		}
		System.out.println("Khong tim thay ID!");
	}

	// 5. Ssap xep
	public void sortByPrice(boolean asc) {
		if (asc) {
			Collections.sort(phones); // tăng dần
		} else {
			Collections.sort(phones, Collections.reverseOrder()); // giảm dần
		}
		System.out.println("Sap xep thanh cong");
	}


	// 6. Search
	public void searchByPriceType(int type, double min, double max) {
		for (Phone p : phones) {
			boolean isMatch = false;

			if (type == 1) {
				isMatch = true;
			} else if (type == 2 && p instanceof OldPhone) {
				isMatch = true;
			} else if (type == 3 && p instanceof NewPhone) {
				isMatch = true;
			}

			if (isMatch && p.getPrice() >= min && p.getPrice() <= max) {
				p.showInfo();
			}
		}
	}

	public void searchByNameType(int type, String keyword) {
		for (Phone p : phones) {
			boolean isMatch = false;
			if (type == 1) {
				isMatch = true;
			} else if (type == 2 && p instanceof OldPhone) {
				isMatch = true;
			} else if (type == 3 && p instanceof NewPhone) {
				isMatch = true;
			}

			if (isMatch && p.getNamePhone().toLowerCase().contains(keyword.toLowerCase())) {
				p.showInfo();
			}
		}
	}

	public void searchByManufacturerType(int type, String manu) {
		for (Phone p : phones) {
			boolean isMatch = false;
			if (type == 1) {
				isMatch = true;
			} else if (type == 2 && p instanceof OldPhone) {
				isMatch = true;
			} else if (type == 3 && p instanceof NewPhone) {
				isMatch = true;
			}

			if (isMatch && p.getManufacturer().equalsIgnoreCase(manu)) {
				p.showInfo();
			}
		}
	}

	// 7. total
	public void totalMoney() {
		double total = 0;
		for (Phone p : phones) {
			total += p.caculateTotalPrice();
		}
		System.out.printf("Tong tien: %,.0f VND\n", total);
	}

	// 8. GIAM GIA
	public void discountOldPhone(double percent) {
		boolean changed = false;
		for (Phone p : phones) {
			if (p instanceof Discount) {
				((Discount) p).applyDiscount(percent);
				changed = true;
			}
		}
		if (changed) {
			// GHI FILE SAU KHI GIẢM GIÁ
			try {
				WriteFileUtil.writePhonesFile("src/ss11_file/phone/data/phones.csv", phones);
				System.out.println("Da ap dung ma giam gia va luu file");
			} catch (IOException e) {
				System.out.println("Lỗi lưu file: " + e.getMessage());
			}
		}
	}
}