package ss10_exception.phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneService {

	private static ArrayList<Phone> phones = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);

	static {
		phones.add(new NewPhone("DTM001", "Iphone 15", 30000000, "12 thang", "Apple", 10));
		phones.add(new OldPhone("DTC001", "Iphone X", 5000000, "1 thang", "Apple", 85, "Xuoc nhe"));
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

	// 2. Them
	public void addPhone(boolean isNew) {
		System.out.println("--- NHAP THONG TIN ---");

		Phone p;

		if (isNew) {
			p = new NewPhone();
			int count = 0;
			for (Phone phone : phones) {
				if (phone instanceof NewPhone) {
					count++;
				}
			}
			p.setId(String.format("DTM%03d", count + 1));
		} else {
			p = new OldPhone();
			int count = 0;
			for (Phone phone : phones) {
				if (phone instanceof OldPhone) {
					count++;
				}
			}

			p.setId(String.format("DTC%03d", count + 1));
		}

		System.out.println("ID: " + p.getId());

		while (true) {
			try {
				p.input(sc);
				phones.add(p);
				System.out.println("THEM THANH CONG!");
				break; // dung thi thoat
			} catch (Exception e) {
				System.out.println("Loi: " + e.getMessage());
				System.out.println("Vui long nhap lai");
			} catch (Throwable t) {
				System.out.println("Ứng dụng gặp một số lỗi không mong muốn, xin vui lòng thử lại các chức năng.");
				break;
			}
		}


	}

	// 3. update
	public void updatePhone() {
		System.out.print("Nhap ID cap nhat: ");
		String idInput = sc.nextLine();

		for (Phone p : phones) {
			if (p.getId().equalsIgnoreCase(idInput)) {
				System.out.println("Tim thay: " + p.getNamePhone());

				while (true) {
					try {
						p.input(sc);
						System.out.println("UPDATE THANH CONG");
						break;
					} catch (Exception e) {
						System.out.println("Loi: " + e.getMessage());
						System.out.println("Vui long nhap lai");
					} catch (Throwable t) {
						System.out.println("Ứng dụng gặp một số lỗi không mong muốn, xin vui lòng thử lại các chức năng.");
						break;
					}
				}
				return;


			}
		}
		System.out.println("Khong tim thay ID!");
	}

	// 4. Delete
	public void deletePhone() {
		System.out.print("Nhap ID can xoa: ");
		String idInput = sc.nextLine();

		for (int i = 0; i < phones.size(); i++) {
			if (phones.get(i).getId().equalsIgnoreCase(idInput)) {
				System.out.println("Tim thay: " + phones.get(i).getNamePhone());
				System.out.print("Xac nhan xoa (Yes/No)? ");
				if (sc.nextLine().equalsIgnoreCase("Yes")) {
					phones.remove(i);
					System.out.println("Xoa thanh cong!");
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
		for (Phone p : phones) {
			if (p instanceof Discount) {
				// Ép kiểu về Interface Discount để gọi hàm applyDiscount
				((Discount) p).applyDiscount(percent);
			}
		}
		System.out.println("Da ap dung ma giam gia");
	}
}