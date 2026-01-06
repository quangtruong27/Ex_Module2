package ss4_ke_thua;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneService {
	private static ArrayList<PhoneNew> phoneNews = new ArrayList<PhoneNew>();
	private static ArrayList<PhoneOld> phoneOlds = new ArrayList<PhoneOld>();
	private static Scanner sc = new Scanner(System.in);

	static {
		phoneNews.add(new PhoneNew("DTM001", "Iphone 17", 34000000, "12 thang", "Apple", 10));
		phoneOlds.add(new PhoneOld("DTC001", "Iphone X", 1000, "0 thang", "Xiaomi", 10, "Nhu muoi bo bien"));
	}

	//1. XEM DANH SACH
	public void displayPhone() {
		System.out.println("===== DANH SACH DIEN THOAI =====");
		displayNew();
		displayOld();
	}

	public void displayNew() {
		System.out.println("----- DANH SACH DIEN THOAI MOI -----");
		for (PhoneNew p : phoneNews) {
			p.showInfo();
		}
	}

	public void displayOld() {
		System.out.println("----- DANH SACH DIEN CU -----");
		for (PhoneOld p : phoneOlds) {
			p.showInfo();
		}
	}

	//2. THEM
	public void addPhone(boolean isNew) {
		System.out.println("NHAP THONG TIN DIEN THOAI");
		String id;

		if (isNew) {
			id = "DTM" + (phoneNews.size() + 1);
		} else {
			id = "DTC" + (phoneOlds.size() + 1);
		}

		System.out.print("Nhap ten dien thoai: ");
		String name = sc.nextLine();

		System.out.print("Nhap gia: ");
		double price = sc.nextDouble();
		sc.nextLine();

		System.out.print("Nhap thoi gian bao hanh: ");
		String warranty = sc.nextLine();

		System.out.print("Nhap nha san xuat: ");
		String manufacturer = sc.nextLine();

		if (isNew) {
			System.out.print("Nhap so luong: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			phoneNews.add(new PhoneNew(id, name, price, warranty, manufacturer, quantity));
		} else {
			System.out.print("Nhap tinh trang pin: ");
			int batteryStatus = sc.nextInt();
			sc.nextLine();

			System.out.print("Nhap mo ta: ");
			String description = sc.nextLine();

			phoneOlds.add(new PhoneOld(id, name, price, warranty, manufacturer, batteryStatus, description));
		}
		System.out.println("THEM MOI THANH CONG");
	}

	//cap nhat
	public void updatePhone() {
		System.out.print("Nhap ID cap nhat: ");
		String idInput = sc.nextLine();
		boolean isFound = false;

		//danh sach dt moi
		for (PhoneNew p : phoneNews) {
			if (p.getId().equals(idInput)) {
				isFound = true;
				System.out.print("Tim thay dien thoai: " + p.getNamePhone());
				System.out.println("UPDATE");

				System.out.print("Nhap ten dien thoai: ");
				String name = sc.nextLine();

				System.out.print("Nhap gia: ");
				double price = sc.nextDouble();
				sc.nextLine();

				System.out.print("Nhap thoi gian bao hanh: ");
				String warranty = sc.nextLine();

				System.out.print("Nhap nha san xuat: ");
				String manufacturer = sc.nextLine();

				System.out.print("Nhap so luong: ");
				int quantity = sc.nextInt();
				sc.nextLine();

				System.out.println("UPDATE THANH CONG");
				return;
			}
		}

		for (PhoneOld p : phoneOlds) {
			if (p.getId().equals(idInput)) {
				isFound = true;
				System.out.print("Tim thay dien thoai: " + p.getNamePhone());
				System.out.println("UPDATE");

				System.out.print("Nhap ten dien thoai: ");
				String name = sc.nextLine();

				System.out.print("Nhap gia: ");
				double price = sc.nextDouble();
				sc.nextLine();

				System.out.print("Nhap thoi gian bao hanh: ");
				String warranty = sc.nextLine();

				System.out.print("Nhap nha san xuat: ");
				String manufacturer = sc.nextLine();

				System.out.print("Nhap so luong: ");
				int quantity = sc.nextInt();
				sc.nextLine();

				System.out.print("Nhap tinh trang pin: ");
				int batteryStatus = sc.nextInt();
				sc.nextLine();

				System.out.print("Nhap mo ta: ");
				String description = sc.nextLine();

				System.out.println("UPDATE THANH CONG");
				return;
			}
		}

		if (!isFound) {
			System.out.println("Khong tim thay ID dien thoai");
		}
	}

	//xoa
	public void deletePhone() {
		System.out.print("Nhap ID can xoa: ");
		String idInput = sc.nextLine();
		boolean isFound = false;

		for (int i = 0; i < phoneNews.size(); i++) {
			if (phoneNews.get(i).getId().equals(idInput)) {
				System.out.println("Tim thay dien thoai: " + phoneNews.get(i).getNamePhone());
				System.out.println("Ban chac muon xoa? (Yes/no)");
				String confirm = sc.nextLine();
				if (confirm.equalsIgnoreCase("Yes")) {
					phoneNews.remove(i);
					System.out.println("Xoa thanh cong");
				} else {
					System.out.println("Da huy xoa");
				}
				isFound = true;
				break;
			}
		}

		if (!isFound) {
			for (int i = 0; i < phoneOlds.size(); i++) {
				if (phoneOlds.get(i).getId().equals(idInput)) {
					System.out.println("Tim thay dien thoai: " + phoneOlds.get(i).getNamePhone());
					System.out.println("Ban chac muon xoa? (Yes/no)");
					String confirm = sc.nextLine();
					if (confirm.equalsIgnoreCase("Yes")) {
						phoneOlds.remove(i);
						System.out.println("Xoa thanh cong");
					} else {
						System.out.println("Da huy xoa");
					}
					isFound = true;
					break;
				}
			}
		}
		if (!isFound) {
			System.out.println("Khong tim thay ID dien thoai");
		}
	}

	//sap xep

	public void sortByPrice(boolean asc) {
		// dien thoai moi
		for (int i = 0; i < phoneNews.size() - 1; i++) {
			for (int j = i + 1; j < phoneNews.size(); j++) {
				if (asc) {
					if (phoneNews.get(i).getPrice() > phoneNews.get(j).getPrice()) {
						PhoneNew temp = phoneNews.get(i);
						phoneNews.set(i, phoneNews.get(j));
						phoneNews.set(j, temp);
					}
				} else {
					if (phoneNews.get(i).getPrice() < phoneNews.get(j).getPrice()) {
						PhoneNew temp = phoneNews.get(i);
						phoneNews.set(i, phoneNews.get(j));
						phoneNews.set(j, temp);
					}
				}
			}
		}

		// dien thoai cu
		for (int i = 0; i < phoneOlds.size() - 1; i++) {
			for (int j = i + 1; j < phoneOlds.size(); j++) {
				if (asc) {
					if (phoneOlds.get(i).getPrice() > phoneOlds.get(j).getPrice()) {
						PhoneOld temp = phoneOlds.get(i);
						phoneOlds.set(i, phoneOlds.get(j));
						phoneOlds.set(j, temp);
					}
				} else {
					if (phoneOlds.get(i).getPrice() < phoneOlds.get(j).getPrice()) {
						PhoneOld temp = phoneOlds.get(i);
						phoneOlds.set(i, phoneOlds.get(j));
						phoneOlds.set(j, temp);
					}
				}
			}
		}
		System.out.println("Sap xep thanh cong");
	}

	//tim kiem
	//tim theo ten
	public void searchByNameType(int type, String keyword) {
		if (type == 1 || type == 3) {
			for (PhoneNew p : phoneNews) {
				if (p.getNamePhone().toLowerCase().contains(keyword.toLowerCase())) {
					p.showInfo();
				}
			}
		}

		if (type == 1 || type == 2) {
			for (PhoneOld p : phoneOlds) {
				if (p.getNamePhone().toLowerCase().contains(keyword.toLowerCase())) {
					p.showInfo();
				}
			}
		}
	}


	//tim theo hang
	public void searchByManufacturerType(int type, String manu) {
		if (type == 1 || type == 3) {
			for (PhoneNew p : phoneNews) {
				if (p.getManufacturer().equalsIgnoreCase(manu)) {
					p.showInfo();
				}
			}
		}

		if (type == 1 || type == 2) {
			for (PhoneOld p : phoneOlds) {
				if (p.getManufacturer().equalsIgnoreCase(manu)) {
					p.showInfo();
				}
			}
		}
	}


	//tim theo gia
	public void searchByPriceType(int type, double min, double max) {
		if (type == 1 || type == 3) {
			for (PhoneNew p : phoneNews) {
				if (p.getPrice() >= min && p.getPrice() <= max) {
					p.showInfo();
				}
			}
		}

		if (type == 1 || type == 2) {
			for (PhoneOld p : phoneOlds) {
				if (p.getPrice() >= min && p.getPrice() <= max) {
					p.showInfo();
				}
			}
		}
	}



	//tong tien
	public void totalMoney() {
		double total = 0;

		for (PhoneNew p : phoneNews) {
			total += p.getPrice() * p.getQuantity();
		}

		for (PhoneOld p : phoneOlds) {
			total += p.getPrice();
		}

		System.out.println("Tong tien: " + total);
	}

	//giam gia
	public void discountOldPhone(double percent) {
		for (PhoneOld p : phoneOlds) {
			double newPrice = p.getPrice() * (100 - percent) / 100;
			p.setPrice(newPrice);
		}
		System.out.println("Giam gia thanh cong!");
	}


}
